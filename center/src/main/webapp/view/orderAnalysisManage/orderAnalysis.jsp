<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<div class="pageheader"><h2 style="color: white;"> 订单分析 </h2></div>
<div class="contentpanel containermain">
    <div class="tab-content">
        <div>
            <form id="form" class="form-inline"
                  action="#" onkeydown="if(event.keyCode==13){return false;}" role="form">
                <div class="form-group" style="margin:5px">
                    <label for="app_poi_code" class="control-label">门店：</label>
                    <select id="app_poi_code" class="select2" style="width:320px" class="form-control">
                    </select>
                </div>
                <label for="jjyOrderType" class="control-label">订单类型：</label>
                <select id="jjyOrderType" class="select2" style="width:160px" class="form-control">
                    <option value="">全部</option>
                    <option value="0">正常销售单</option>
                    <option value="1">全额退款单</option>
                    <option value="2">部分退款单</option>
                </select>
                <label for="jjyDiffType" class="control-label">异常状态：</label>
                <select id="jjyDiffType" class="select2" style="width:160px" class="form-control">
                    <option value="">全部</option>
                    <option value="0">正常</option>
                    <option value="1">补录</option>
                    <option value="2">配送异常</option>
                </select>
                <label for="jjyPushType" class="control-label">推送状态：</label>
                <select id="jjyPushType" class="select2" style="width:160px" class="form-control">
                    <option value="">全部</option>
                    <option value="0">未推送</option>
                    <option value="1">已推送</option>
                    <option value="2">推送失败</option>
                </select>

                <div class="form-group" style="margin:5px">
                    <label for="startTime" class="control-label">开始日期：</label>
                    <input name="datepicker" placeholder="请选择日期" type="text" style="width:150px; background-color:white"
                           class="form-control" readonly="readonly" id="startTime">
                </div>
                <div class="form-group" style="margin:5px">
                    <label for="endTime" class="control-label">结束日期：</label>
                    <input name="datepicker" placeholder="请选择日期" type="text" style="width:150px; background-color:white"
                           class="form-control" readonly="readonly" id="endTime">
                </div>

                <div class="form-group" style="margin:5px">
                    <label for="orderId" class="control-label">美团订单号：</label>
                    <input name="orderId" placeholder="请输入美团订单号" type="text" style="width:170px;"
                           class="form-control" id="orderId">
                </div>
                <div class="form-group" style="margin:5px">
                    <label for="jjyBillId" class="control-label">家家悦流水单号：</label>
                    <input name="jjyBillId" placeholder="请输入家家悦流水单号" type="text" style="width:170px;"
                           class="form-control" id="jjyBillId">
                </div>

                <div class="form-group" style="margin:5px">
                    <div style="float:right;margin-right: 20px;margin-top: 10px;margin-bottom: 10px;">
                        <button type="button" class="btn btn-primary btn-sm" onclick="reFresh()">查询</button>
                        <button type="button" class="btn btn-primary btn-sm" onclick="clearFormData()">清空</button>
                        <button type="button" class="btn btn-primary btn-sm" onclick="excelExport()">Excel表格导出</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <table id="queryTable"></table>
</div>
<script type="text/javascript">
    var queryUrl = 'orderAnalysisManage/query.do';
    var exportUrl = 'orderAnalysisManage/export.do';
    var $queryTable = $('#queryTable'), selections = [];
    if (app_poi_code == "null" || !app_poi_code) {
        select2Ajax({"selectId": 'app_poi_code', "defaultText": '全部', "url": 'orderManage/completedOrder/getApp.do'});
    } else {
        alert(app_poi_code);
        select2Ajax({
            "selectId": 'app_poi_code',
            "value": app_poi_code,
            "defaultText": '全部',
            "url": 'orderManage/completedOrder/getApp.do'
        });
        $("#app_poi_code").attr("disabled", "disabled");
    }
    var pageNum = 1;
    var pageSize = 10;
    var data = '';
    var queryPageUrl = 'view/orderAnalysisManage/orderAnalysisDetail.jsp';
    window.operateEvents = {
        'click .orderAnalysisDetail': function (e, value, row, index) {
            data = value;
            _window._showPopup('信息详情', queryPageUrl, function () {
            });
        }
    };
    $(function () {
        $('#appPoiCode').select2();
        $('#jjyOrderType').select2();
        $('#jjyDiffType').select2();
        $('#jjyPushType').select2();
        $('#startTime').val(_dateFormat(new Date().getTime(), "yyyy-MM-dd 00:00"));
        $('#endTime').val(_dateFormat(new Date().getTime(), "yyyy-MM-dd 23:59"));
        $queryTable.bootstrapTable({
            columns: [
                {
                    field: '_id_', title: '序号', sortable: false, visible: true, align: 'middle',
                    formatter: function (value, row, index) {
                        return ((pageNum - 1) * pageSize + index + 1);
                    }
                }, {
                    field: 'id', title: 'id', sortable: false, align: 'center', visible: false
                }, {
                    field: 'wm_poi_name', title: '商家店名', sortable: false, align: 'center'
                }, {
                    field: 'order_id', title: '订单ID', sortable: false, align: 'center'
                }, {
                    field: 'jjy_bill_id', title: '家家悦订单', sortable: false, align: 'center'
                }, {
                    field: 'original_price', title: '原价（未减优惠的金额，包含配送费）', sortable: false, align: 'center'
                }, {
                    field: 'total', title: '总价（用户实际支付，包含配送费）', sortable: false, align: 'center'
                }, {
                    field: 'mt_charge', title: '美团承担费用', sortable: false, align: 'center'
                }, {
                    field: 'poi_charge', title: '商家承担费用', sortable: false, align: 'center'
                }, {
                    field: 'shipping_fee', title: '门店配送费', sortable: false, align: 'center'
                }, {
                    field: 'package_bag_money', title: '打包袋金额', sortable: false, align: 'center'
                }, {
                    field: 'food_list',
                    title: '商品信息',
                    sortable: false,
                    align: 'center',
                    events: operateEvents,
                    formatter: function (value) {
                        return popoverFormat(value);
                    }
                }, {
                    field: 'offer_list',
                    title: '优惠信息',
                    sortable: false,
                    align: 'center',
                    events: operateEvents,
                    formatter: function (value) {
                        return popoverFormat(value);
                    }
                }, {
                    field: 'order_create_time', title: '下单时间', sortable: false, align: 'center',
                    formatter: function (value) {
                        return changeDateFormat(value)
                    }
                }, {
                    field: 'order_completed_time', title: '订单完成时间', sortable: false, align: 'center',
                    formatter: function (value) {
                        return changeDateFormat(value)
                    }
                }, {
                    field: 'order_life_cycle', title: '订单生命周期(分钟)', sortable: false, align: 'center'
                }, {
                    field: 'avg_send_time', title: '平均配送时间(分钟)', sortable: false, align: 'center'
                }, {
                    field: 'recipient_name', title: '收件人姓名', sortable: false, align: 'center'
                }, {
                    field: 'recipient_phone', title: '收件人电话', sortable: false, align: 'center'
                }, {
                    field: 'recipient_address',
                    title: '收件人地址',
                    sortable: false,
                    align: 'center',
                    events: operateEvents,
                    formatter: function (value) {
                        return popoverFormat(value);
                    }
                }, {
                    field: 'is_poi_first_order',
                    title: '是否第一次在此门店消费',
                    sortable: false,
                    align: 'center',
                    formatter: isFirstOrder
                }, {
                    field: 'jjy_order_type', title: '订单类型', sortable: false, align: 'center', formatter: jjyOrderType
                }, {
                    field: 'jjy_diff_type', title: '异常状态', sortable: false, align: 'center', formatter: jjyDiffType
                }, {
                    field: 'jjy_push_type', title: '推送状态', sortable: false, align: 'center', formatter: jjyPushType
                }, {
                    field: 'log_list',
                    title: '日志信息',
                    sortable: false,
                    align: 'center',
                    events: operateEvents,
                    formatter: function (value) {
                        return popoverFormat(value);
                    }
                }, {
                    field: 'json_data', title: 'json信息', sortable: false, align: 'center', events: operateEvents,
                    formatter: function (value) {
                        return popoverFormat(value);
                    }
                }, {
                    field: 'create_time', title: '美团推送时间', sortable: false, align: 'center',
                    formatter: function (value) {
                        return changeDateFormat(value)
                    }
                }
            ],
            search: false,
            showToggle: false,
            minimumCountColumns: 2,
            queryParams: function (params) {
                params.appPoiCode = $("#app_poi_code").val();
                params.jjyOrderType = $('#jjyOrderType').val();
                params.jjyDiffType = $('#jjyDiffType').val();
                params.jjyPushType = $('#jjyPushType').val();
                params.startTime = $('#startTime').val();
                params.endTime = $('#endTime').val();
                params.orderId = $('#orderId').val();
                params.jjyBillId = $('#jjyBillId').val();
                return params;
            },
            showPaginationSwitch: false,
            pagination: true,
            idField: 'id',
            pageList: '[10]',
            showFooter: false,
            height: getToauditHeight(),
            onClickRow: linesSelected,
            detailFormatter: 'detailFormatter',
            rowStyle: function (value, row, index) {
                return {classes: "divnowrap"};
            },
            contentType: "application/x-www-form-urlencoded",
            sidePagination: 'server',
            url: queryUrl,
            showExport: false
        });

        function isFirstOrder(value, row, index) {
            var map = new Map();
            map.set("true", "<span class='badge badge-danger'>是</span>");
            map.set("false", "<span class ='badge badge-success'>否</span>");
            return map.get(value.toString());
        }

        function jjyOrderType(value, row, index) {
            var map = new Map();
            map.set("0", "<span class='badge badge-success'>正常销售单</span>");
            map.set("1", "<span class='badge badge-warning'>全额退款单</span>");
            map.set("2", "<span class ='badge badge-danger'>部分退款单</span>");
            return map.get(value.toString());
        }

        function jjyDiffType(value, row, index) {
            var map = new Map();
            map.set("0", "<span class='badge badge-success'>正常</span>");
            map.set("1", "<span class='badge badge-warning'>补录</span>");
            map.set("2", "<span class ='badge badge-danger'>配送异常</span>");
            return map.get(value.toString());
        }

        function jjyPushType(value, row, index) {
            var map = new Map();
            map.set("0", "<span class='badge badge-success'>未推送</span>");
            map.set("1", "<span class='badge badge-warning'>已推送</span>");
            map.set("2", "<span class ='badge badge-danger'>推送失败</span>");
            return map.get(value.toString());
        }

        /**
         *表格分页设置
         **/
        $queryTable.on('page-change.bs.table', function (number, size) {
            pageNum = size; //获取当前页面
        });

        $("#startTime").datetimepicker({//选择年月日
            format: 'yyyy-mm-dd hh:ii',
            language: 'zh-CN',
            weekStart: 7,
            todayBtn: true,
            autoclose: true,
            initialDate: new Date(),
            todayHighlight: 1,
            startView: 2,
            minView: 0,
            maxView: 2,
            minuteStep: 5,
            clearBtn: true,//清除按钮
            forceParse: false
        });
        $("#endTime").datetimepicker({//选择年月日
            format: 'yyyy-mm-dd hh:ii',
            language: 'zh-CN',
            weekStart: 7,
            todayBtn: true,//显示‘今日’按钮
            autoclose: true,
            initialDate: new Date(),//初始化当前日期
            todayHighlight: 1,
            startView: 2,
            minView: 0,  //Number, String. 默认值：0, 'hour'，日期时间选择器所能够提供的最精确的时间选择视图。
            maxView: 2,
            minuteStep: 5,
            clearBtn: true,//清除按钮
            forceParse: false
        });

    });

    function reFresh() {
        pageNum = 1;
        $queryTable.bootstrapTable('refresh', {url: queryUrl});
    }

    function excelExport() {
        layer.confirm('确定导出记录？', {
            btn: ['确定', '取消']
        }, function (index) {
            layer.close(index);
            var startTime = $("#startTime").val();
            var endTime = $("#endTime").val();
            var str = "";
            str = str + "&appPoiCode=" + $("#app_poi_code").val();
            str = str + "&jjyOrderType=" + $('#jjyOrderType').val();
            str = str + "&jjyDiffType=" + $('#jjyDiffType').val();
            str = str + "&jjyPushType=" + $('#jjyPushType').val();
            str = str + "&orderId=" + $('#orderId').val();
            str = str + "&jjyBillId=" + $('#jjyBillId').val();
            window.open(exportUrl + "?startTime=" + startTime + "&endTime=" + endTime + str);

            /*$.ajax({
                url: exportUrl + "?startTime=" + startTime + "&endTime=" + endTime + str, //请求的url地址
                dataType: "json", //返回格式为json
                async: true, //请求是否异步，默认为异步，这也是ajax重要特性
                // data: {"id": "value"}, //参数值
                type: "GET", //请求方式 get 或者post
                beforeSend: function () {//请求前的处理
                    },
                    success:function (req) {//请求成功时处理
                         },
                        complete:function () {//请求完成的处理
                             },
                            error:function () {//请求出错处理
                                 }});*/
        }, function (index) {
            layer.close(index);
        });
    }

    //修改——转换日期格式(时间戳转换为datetime格式)
    function changeDateFormat(cellval) {
        if (cellval != null) {
            var date = new Date(cellval);
            var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
            var currentDay = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
            var currentHour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
            var currentMinute = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
            var currentSecond = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
            return date.getFullYear() + "-" + month + "-" + currentDay + " " + currentHour + ":" + currentMinute + ":" + currentSecond;
        }
    }

    function popoverFormat(value) {
        if (value != null && value.length > 10) {
            return [
                '<a class="orderAnalysisDetail" href="javascript:void(0)" title="查看详情">查看详情', '</a>'
            ].join('');
        } else {
            return [
                '<span">',
                value,
                '</span> '
            ].join('');
        }
    }

    function ContentMethod(txt) {
        return '<div style="overflow: hidden;">' + txt + '</div>';
    }

    function clearFormData() {
        $('#startTime').val(_dateFormat(new Date().getTime(), "yyyy-MM-dd 00:00"));
        $('#endTime').val(_dateFormat(new Date().getTime(), "yyyy-MM-dd 23:59"));
        $('#orderId').val("");
        $('#jjyBillId').val("");
    }

</script>
