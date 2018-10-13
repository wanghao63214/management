<%@page import="java.util.Date" %>
<%@ page import="com.utils.ShiroUtils" %>
<%@ page import="com.beans.Account" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    Account account = ShiroUtils.getLoginUser();
    String userName = "";
    String app_poi_code = "";
    if(null != account){
        userName = account.getUsername();
        app_poi_code = account.getAppPoiCode();
    }
%>
<script type="text/javascript">
    var _basePath = "<%=basePath%>";
    var userName = "<%=userName%>";
    var app_poi_code = "<%=app_poi_code%>";
</script>
<!-- 自定义ico -->
<link href="<%=basePath%>js/lib/Bracket1.5/css/style.default.css" rel="stylesheet">
<!-- 暗黑色的背景 -->
<link href="<%=basePath%>js/lib/Bracket1.5/css/jquery.datatables.css" rel="stylesheet">
<link href="<%=basePath%>js/lib/bootstrapValidator/css/bootstrapValidator.min.css" rel="stylesheet"/>
<link href="<%=basePath%>js/lib/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" rel="stylesheet">
<link href="<%=basePath%>js/lib/zTree/zTreeStyle.css" rel="stylesheet">
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery-1.11.1.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery-migrate-1.2.1.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery-ui-1.10.3.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/bootstrap.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/custom.js"></script>
<script src="<%=basePath%>js/lib/bootstrap-table/bootstrap-table.js"></script>
<script src="<%=basePath%>js/lib/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/modernizr.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery.sparkline.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/toggles.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/retina.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery.cookies.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery.ba-hashchange.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery.bootstrap.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/select2.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/select2_locale_zh-CN.min.js"></script>
<script src="<%=basePath%>js/lib/bootstrapValidator/bootstrapValidator.min.js"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/bootstrap-datetimepicker.js" type="text/javascript"
        charset="UTF-8"></script>
<script src="<%=basePath%>js/lib/Bracket1.5/js/jquery.addMethod.js" type="text/javascript" charset="UTF-8"></script>
<!-- src="<%=basePath%>js/lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js" -->
<!-- type="text/javascript" charset="UTF-8"></script> -->
<script src="<%=basePath%>js/lib/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"
        type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/bootstrapValidator/language/zh_CN.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/jquery.form.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/zTree/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/Highcharts-4.2.5/js/highcharts.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/Highcharts-4.2.5/js/modules/exporting.js"></script>
<!---------------------------------------- 首页效果的js -------------------------------------->
<script type="text/javascript" src="<%=basePath%>js/lib/index.js?<%=new Date().getTime()%>"></script>
<script type="text/javascript" src="<%=basePath%>js/index.js?<%=new Date().getTime()%>"></script>
<script type="text/javascript" src="<%=basePath%>js/common.js?<%=new Date().getTime()%>"></script>
<script type="text/javascript" src="<%=basePath%>js/window.js?<%=new Date().getTime()%>"></script>
<link href="<%=basePath%>css/common.css" rel="stylesheet">
<!-- 自定义css -->
<script type="text/javascript" src="<%=basePath%>js/tool.js?<%=new Date().getTime()%>"></script>
<script type="text/javascript" src="<%=basePath%>js/UED.js?<%=new Date().getTime()%>"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=basePath%>js/echarts.min.js"></script>
