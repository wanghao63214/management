package com.service;

import com.beans.*;
import com.common.utils.DateUtils;
import com.common.utils.StringUtils;
import com.github.pagehelper.PageHelper;
import com.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 角色的service层
 *
 * @author zhangge
 */
@Service
public class OrderAnalysisService {

    @Autowired
    private MtCompletedOrderMapper mtCompletedOrderMapper;

    @Autowired
    private MtCompletedOrderMapper_Manual mtCompletedOrderMapper_Manual;

    @Autowired
    private MtOrderFoodDetailMapper mtOrderFoodDetailMapper;

    @Autowired
    private MtOfferMapper mtOfferMapper;

    @Autowired
    private MtOrderLogMapper mtOrderLogMapper;

    /**
     * xxb_fsh
     *
     * @param mtCompletedOrder
     * @param startTime
     * @param endTime
     * @param limit
     * @param offset
     * @return 订单大数据分析查询
     */
    public Map<String, Object> orderAnalysisQuery(MtCompletedOrder mtCompletedOrder, String startTime, String endTime, int limit, int offset) {
        Map<String, Object> map = new HashMap<>();
        try {
            MtCompletedOrderExample mtCompletedOrderExample = new MtCompletedOrderExample();
            MtCompletedOrderExample.Criteria criteria = mtCompletedOrderExample.createCriteria();
            if (StringUtils.isNotEmpty(mtCompletedOrder.getAppPoiCode())) {
                criteria.andAppPoiCodeEqualTo(mtCompletedOrder.getAppPoiCode());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyOrderType())) {
                criteria.andJjyOrderTypeEqualTo(mtCompletedOrder.getJjyOrderType());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyDiffType())) {
                criteria.andJjyDiffTypeEqualTo(mtCompletedOrder.getJjyDiffType());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyPushType())) {
                criteria.andJjyPushTypeEqualTo(mtCompletedOrder.getJjyPushType());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getOrderId())) {
                criteria.andOrderIdLike("%" + mtCompletedOrder.getOrderId() + "%");
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyBillId())) {
                criteria.andJjyBillIdLike("%" + mtCompletedOrder.getJjyBillId() + "%");
            }

            criteria.andOrderCreateTimeBetween(DateUtils.format("yyyy-MM-dd HH:mm", startTime), DateUtils.format("yyyy-MM-dd HH:mm", endTime));
            map.put("total", mtCompletedOrderMapper.countByExample(mtCompletedOrderExample));
            PageHelper.startPage((offset / limit) + 1, limit);//startPage, PageSize
            List<Map<String, Object>> rows = mtCompletedOrderMapper_Manual.selectListMap(mtCompletedOrderExample);
            if (rows != null && rows.size() > 0) {
                for (Map<String, Object> item : rows) {
                    BigDecimal packageBagMoney = new BigDecimal(String.valueOf(item.get("package_bag_money")));
                    packageBagMoney = packageBagMoney.multiply(new BigDecimal("0.01"));
                    item.put("package_bag_money", packageBagMoney);

                    BigDecimal orderLifeCycle = new BigDecimal(String.valueOf(item.get("utime"))).subtract(new BigDecimal(String.valueOf(item.get("ctime"))));
                    orderLifeCycle = orderLifeCycle.divide(new BigDecimal("60"), 0, BigDecimal.ROUND_UP);
                    item.put("order_life_cycle", orderLifeCycle);

                    BigDecimal avgSendTime = new BigDecimal(String.valueOf(item.get("avg_send_time")));
                    avgSendTime = avgSendTime.divide(new BigDecimal("60"), 0, BigDecimal.ROUND_UP);
                    item.put("avg_send_time", avgSendTime);

                    String orderId = String.valueOf(item.get("order_id"));
                    MtOrderFoodDetailExample mtOrderFoodDetailExample = new MtOrderFoodDetailExample();
                    mtOrderFoodDetailExample.or().andOrder_idEqualTo(orderId);
                    List<MtOrderFoodDetail> mtOrderFoodDetailList = mtOrderFoodDetailMapper.selectByExample(mtOrderFoodDetailExample);
                    StringBuilder foodStr = new StringBuilder();
                    if (mtOrderFoodDetailList != null && mtOrderFoodDetailList.size() > 0) {
                        int j = 0;
                        for (int i = 0; i < mtOrderFoodDetailList.size(); i++) {
                            MtOrderFoodDetail foodItem = mtOrderFoodDetailList.get(i);
                            if (foodItem.getIs_rtn() == 0) {
                                foodStr.append("(").append(i + 1).append(")===").append(foodItem.getFood_name()).append("===<br>skuId:").append(foodItem.getSku_id()).append("===").append(foodItem.getPrice()).append("元x").append(foodItem.getQuantity()).append("件<br>");
                            } else {
                                foodStr.append("<b>(").append(++j).append(")===").append(foodItem.getFood_name()).append("===<br>skuId:").append(foodItem.getSku_id()).append("===").append(foodItem.getPrice()).append("元x").append(foodItem.getQuantity()).append("件<br>");
                                foodStr.append("退货商品</b><br>");
                            }
                        }
                    }
                    item.put("food_list", foodStr.toString());

                    MtOfferExample mtOfferExample = new MtOfferExample();
                    mtOfferExample.or().andOrder_idEqualTo(orderId);
                    List<MtOffer> mtOfferList = mtOfferMapper.selectByExample(mtOfferExample);
                    BigDecimal mtCharge = new BigDecimal("0");
                    BigDecimal poiCharge = new BigDecimal("0");
                    StringBuilder offerStr = new StringBuilder();
                    if (mtOfferList != null && mtOfferList.size() > 0) {
                        for (int i = 0; i < mtOfferList.size(); i++) {
                            MtOffer offerItem = mtOfferList.get(i);
                            mtCharge = mtCharge.add(new BigDecimal(offerItem.getMt_charge()));
                            poiCharge = poiCharge.add(new BigDecimal(offerItem.getPoi_charge()));
                            offerStr.append("(").append(i + 1).append(")===").append(offerItem.getRemark()).append("===<br>家家悦承担").append(offerItem.getPoi_charge()).append("元===美团承担").append(offerItem.getMt_charge()).append("元<br>");
                        }
                    }
                    item.put("mt_charge", mtCharge);
                    item.put("poi_charge", poiCharge);
                    item.put("offer_list", offerStr.toString());

                    String jjyBillId = String.valueOf(item.get("jjy_bill_id"));
                    MtOrderLogExample mtOrderLogExample = new MtOrderLogExample();
                    mtOrderLogExample.or().andJjyBillIdEqualTo(jjyBillId);
                    List<MtOrderLog> logList = mtOrderLogMapper.selectByExampleWithBLOBs(mtOrderLogExample);
                    StringBuilder logStr = new StringBuilder();
                    if (logList != null && logList.size() > 0) {
                        for (int i = 0; i < logList.size(); i++) {
                            MtOrderLog logItem = logList.get(i);
                            logStr.append("(").append(i + 1).append(")===").append(logItem.getMsg()).append("===<br>");
                        }
                    }
                    item.put("log_list", logStr.toString());
                }
            }
            map.put("rows", rows);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("total", 0);
            map.put("rows", new ArrayList<>());
        }
        return map;
    }

    /**
     * xxb_fsh
     *
     * @param mtCompletedOrder
     * @param startTime
     * @param endTime
     * @return 订单大数据分析导出
     */
    public List<Map<String, Object>> orderAnalysisExport(MtCompletedOrder mtCompletedOrder, String startTime, String endTime) {
        List<Map<String, Object>> rows = new ArrayList<>();
        try {
            MtCompletedOrderExample mtCompletedOrderExample = new MtCompletedOrderExample();
            MtCompletedOrderExample.Criteria criteria = mtCompletedOrderExample.createCriteria();
            if (StringUtils.isNotEmpty(mtCompletedOrder.getAppPoiCode())) {
                criteria.andAppPoiCodeEqualTo(mtCompletedOrder.getAppPoiCode());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyOrderType())) {
                criteria.andJjyOrderTypeEqualTo(mtCompletedOrder.getJjyOrderType());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyDiffType())) {
                criteria.andJjyDiffTypeEqualTo(mtCompletedOrder.getJjyDiffType());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyPushType())) {
                criteria.andJjyPushTypeEqualTo(mtCompletedOrder.getJjyPushType());
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getOrderId())) {
                criteria.andOrderIdLike("%" + mtCompletedOrder.getOrderId() + "%");
            }
            if (StringUtils.isNotEmpty(mtCompletedOrder.getJjyBillId())) {
                criteria.andJjyBillIdLike("%" + mtCompletedOrder.getJjyBillId() + "%");
            }
            criteria.andOrderCreateTimeBetween(DateUtils.format("yyyy-MM-dd HH:mm", startTime), DateUtils.format("yyyy-MM-dd HH:mm", endTime));
            rows = mtCompletedOrderMapper_Manual.selectListMap(mtCompletedOrderExample);
            if (rows != null && rows.size() > 0) {
                for (Map<String, Object> item : rows) {
                    BigDecimal packageBagMoney = new BigDecimal(String.valueOf(item.get("package_bag_money")));
                    packageBagMoney = packageBagMoney.multiply(new BigDecimal("0.01"));
                    item.put("package_bag_money", packageBagMoney);

                    BigDecimal orderLifeCycle = new BigDecimal(String.valueOf(item.get("utime"))).subtract(new BigDecimal(String.valueOf(item.get("ctime"))));
                    orderLifeCycle = orderLifeCycle.divide(new BigDecimal("60"), 0, BigDecimal.ROUND_UP);
                    item.put("order_life_cycle", orderLifeCycle);

                    BigDecimal avgSendTime = new BigDecimal(String.valueOf(item.get("avg_send_time")));
                    avgSendTime = avgSendTime.divide(new BigDecimal("60"), 0, BigDecimal.ROUND_UP);
                    item.put("avg_send_time", avgSendTime);

                    String orderId = String.valueOf(item.get("order_id"));
                    MtOrderFoodDetailExample mtOrderFoodDetailExample = new MtOrderFoodDetailExample();
                    mtOrderFoodDetailExample.or().andOrder_idEqualTo(orderId);
                    List<MtOrderFoodDetail> mtOrderFoodDetailList = mtOrderFoodDetailMapper.selectByExample(mtOrderFoodDetailExample);
                    StringBuilder foodStr = new StringBuilder();
                    if (mtOrderFoodDetailList != null && mtOrderFoodDetailList.size() > 0) {
                        for (int i = 0; i < mtOrderFoodDetailList.size(); i++) {
                            MtOrderFoodDetail foodItem = mtOrderFoodDetailList.get(i);
                            foodStr.append("(").append(i + 1).append(")===").append(foodItem.getFood_name()).append("===<br>skuId:").append(foodItem.getSku_id()).append("===").append(foodItem.getPrice()).append("元x").append(foodItem.getQuantity()).append("件<br>");
                        }
                    }
                    item.put("food_list", foodStr.toString());

                    MtOfferExample mtOfferExample = new MtOfferExample();
                    mtOfferExample.or().andOrder_idEqualTo(orderId);
                    List<MtOffer> mtOfferList = mtOfferMapper.selectByExample(mtOfferExample);
                    BigDecimal mtCharge = new BigDecimal("0");
                    BigDecimal poiCharge = new BigDecimal("0");
                    StringBuilder offerStr = new StringBuilder();
                    if (mtOfferList != null && mtOfferList.size() > 0) {
                        for (int i = 0; i < mtOfferList.size(); i++) {
                            MtOffer offerItem = mtOfferList.get(i);
                            mtCharge = mtCharge.add(new BigDecimal(offerItem.getMt_charge()));
                            poiCharge = poiCharge.add(new BigDecimal(offerItem.getPoi_charge()));
                            offerStr.append("(").append(i + 1).append(")===").append(offerItem.getRemark()).append("===<br>家家悦承担").append(offerItem.getPoi_charge()).append("元===美团承担").append(offerItem.getMt_charge()).append("元<br>");
                        }
                    }
                    item.put("mt_charge", mtCharge);
                    item.put("poi_charge", poiCharge);
                    item.put("offer_list", offerStr.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

}
