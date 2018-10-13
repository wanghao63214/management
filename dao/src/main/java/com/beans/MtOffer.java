package com.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class MtOffer implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 订单ID（数据库中请用bigint(20)存储此字段）
     */
    private String order_id;

    /**
     * 活动ID
     */
    private String act_detail_id;

    /**
     * 活动优惠金额，也即美团承担活动费用和商户承担活动费用的总和
     */
    private String reduce_fee;

    /**
     * 优惠金额中美团承担的部分，该信息默认不推送，如有需求可在开发者中心订阅
     */
    private String mt_charge;

    /**
     * 优惠金额中商家承担的部分，该信息默认不推送，如有需求可在开发者中心订阅
     */
    private String poi_charge;

    /**
     * 优惠说明
     */
    private String remark;

    /**
     * 活动类型：1-新用户立减；2-满减；4-套餐赠送；5-满赠；9-使用红包；11-提前下单减；16-满免配送费(即将废弃)；17-折扣商品；18-美团专送再减(即将废弃)；19-点评券；20-第二份半价；21-会员免配送费；22-门店新客立减；23-买赠；24-平台新用户立减；25-满减配送费；100-满返商家代金券；101-使用商家代金券；103-进店领券
     */
    private String type;

    /**
     * 骑手应付款，只对美团配送线上支付线下结算的商家有效，该信息默认不推送，如有需求可在开发者中心订阅
     */
    private String rider_fee;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getAct_detail_id() {
        return act_detail_id;
    }

    public void setAct_detail_id(String act_detail_id) {
        this.act_detail_id = act_detail_id;
    }

    public String getReduce_fee() {
        return reduce_fee;
    }

    public void setReduce_fee(String reduce_fee) {
        this.reduce_fee = reduce_fee;
    }

    public String getMt_charge() {
        return mt_charge;
    }

    public void setMt_charge(String mt_charge) {
        this.mt_charge = mt_charge;
    }

    public String getPoi_charge() {
        return poi_charge;
    }

    public void setPoi_charge(String poi_charge) {
        this.poi_charge = poi_charge;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRider_fee() {
        return rider_fee;
    }

    public void setRider_fee(String rider_fee) {
        this.rider_fee = rider_fee;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MtOffer other = (MtOffer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getAct_detail_id() == null ? other.getAct_detail_id() == null : this.getAct_detail_id().equals(other.getAct_detail_id()))
            && (this.getReduce_fee() == null ? other.getReduce_fee() == null : this.getReduce_fee().equals(other.getReduce_fee()))
            && (this.getMt_charge() == null ? other.getMt_charge() == null : this.getMt_charge().equals(other.getMt_charge()))
            && (this.getPoi_charge() == null ? other.getPoi_charge() == null : this.getPoi_charge().equals(other.getPoi_charge()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRider_fee() == null ? other.getRider_fee() == null : this.getRider_fee().equals(other.getRider_fee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getAct_detail_id() == null) ? 0 : getAct_detail_id().hashCode());
        result = prime * result + ((getReduce_fee() == null) ? 0 : getReduce_fee().hashCode());
        result = prime * result + ((getMt_charge() == null) ? 0 : getMt_charge().hashCode());
        result = prime * result + ((getPoi_charge() == null) ? 0 : getPoi_charge().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRider_fee() == null) ? 0 : getRider_fee().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", order_id=").append(order_id);
        sb.append(", act_detail_id=").append(act_detail_id);
        sb.append(", reduce_fee=").append(reduce_fee);
        sb.append(", mt_charge=").append(mt_charge);
        sb.append(", poi_charge=").append(poi_charge);
        sb.append(", remark=").append(remark);
        sb.append(", type=").append(type);
        sb.append(", rider_fee=").append(rider_fee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}