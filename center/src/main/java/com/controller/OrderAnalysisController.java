package com.controller;

import com.beans.Account;
import com.beans.MtCompletedOrder;
import com.common.utils.ExportExcelUtil;
import com.common.utils.StringUtils;
import com.service.OrderAnalysisService;
import com.utils.ShiroUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/orderAnalysisManage/")
public class OrderAnalysisController extends BaseController {

    /**
     * 日志打印
     */
    private static final Logger LOG = LoggerFactory.getLogger(OrderAnalysisController.class);

    @Autowired
    private OrderAnalysisService orderAnalysisService;

    //@RequiresPermissions("role:query")
    @RequestMapping(value = "query" + REQUEST_FORMAT, produces = JSON + CHARSET)
    @ResponseBody
    public Map<String, Object> orderAnalysisQuery(MtCompletedOrder mtCompletedOrder, String startTime, String endTime, int limit, int offset) {
        Map<String, Object> map = new HashMap<>();
        Account account = ShiroUtils.getLoginUser();
        try {
            if (null != account && StringUtils.isNotEmpty(account.getAppPoiCode())) {
                mtCompletedOrder.setAppPoiCode(account.getAppPoiCode());
            }
            map = orderAnalysisService.orderAnalysisQuery(mtCompletedOrder, startTime, endTime, limit, offset);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "export" + REQUEST_FORMAT, produces = JSON + CHARSET)
    public Object completedOrderExport(MtCompletedOrder mtCompletedOrder, String startTime, String endTime) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = fmt.format(new Date());
        String fileName = "orderAnalysis_" + time + ".xls";
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        OutputStream out = null;
        try {
            out = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] headers = new String[]{"商家店名", "订单ID", "家家悦流水单", "原价（未减优惠的金额，包含配送费）", "总价（用户实际支付，包含配送费）", "美团承担费用", "商家承担费用", "门店配送费", "打包袋金额", "商品信息", "优惠信息", "下单时间", "订单完成时间", "订单生命周期(分钟)", "平均配送时间(分钟)", "收件人姓名", "收件人电话", "收件人地址", "是否第一次在此门店消费", "订单类型", "异常状态", "推送状态", "日志信息", "美团推送时间"};
        List<Map<String, Object>> varList = orderAnalysisService.orderAnalysisExport(mtCompletedOrder, startTime, endTime);
        List<Object[]> dataList = new ArrayList<>();
        Object[] objs = null;
        if (varList != null && varList.size() >= 0) {
            for (int i = 0; i < varList.size(); i++) {
                Map<String, Object> map = varList.get(i);
                objs = new Object[24];
                objs[0] = map.get("wm_poi_name");
                objs[1] = map.get("order_id");
                objs[2] = map.get("jjy_bill_id");
                objs[3] = map.get("original_price");
                objs[4] = map.get("total");
                objs[5] = map.get("mt_charge");
                objs[6] = map.get("poi_charge");
                objs[7] = map.get("shipping_fee");
                objs[8] = map.get("package_bag_money");
                objs[9] = map.get("food_list2");
                objs[10] = map.get("offer_list2");
                objs[11] = map.get("order_create_time");
                objs[12] = map.get("order_completed_time");
                objs[13] = map.get("order_life_cycle");
                objs[14] = map.get("avg_send_time");
                objs[15] = map.get("recipient_name");
                objs[16] = map.get("recipient_phone");
                objs[17] = map.get("recipient_address");
                objs[18] = map.get("is_poi_first_order");
                String jjyOrderType = String.valueOf(map.get("jjy_order_type"));
                switch (jjyOrderType) {
                    case "0":
                        objs[19] = "正常销售单";
                        break;
                    case "1":
                        objs[19] = "全额退款单";
                        break;
                    case "2":
                        objs[19] = "部分退款单";
                        break;
                    default:
                        objs[19] = "类型异常";
                        break;
                }
                String jjyDiffType = String.valueOf(map.get("jjy_diff_type"));
                switch (jjyDiffType) {
                    case "0":
                        objs[20] = "正常";
                        break;
                    case "1":
                        objs[20] = "补录";
                        break;
                    case "2":
                        objs[20] = "配送异常";
                        break;
                    default:
                        objs[20] = "类型异常";
                        break;
                }
                String jjyPushType = String.valueOf(map.get("jjy_push_type"));
                switch (jjyPushType) {
                    case "0":
                        objs[21] = "未推送";
                        break;
                    case "1":
                        objs[21] = "已推送";
                        break;
                    case "2":
                        objs[21] = "推送失败";
                        break;
                    default:
                        objs[21] = "类型异常";
                        break;
                }
                objs[22] = map.get("log_list2");
                objs[23] = map.get("create_time");
                dataList.add(objs);
            }
        }
        //调用导出Excel工具
        ExportExcelUtil ex = new ExportExcelUtil(headers, dataList);

        try {
            ex.export(out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
}
