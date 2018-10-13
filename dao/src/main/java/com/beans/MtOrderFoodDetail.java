package com.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class MtOrderFoodDetail implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 生成规则：门店号+收银机997+日期+5位流水号
     */
    private String jjy_bill_id;

    /**
     * 订单ID（数据库中请用bigint(20)存储此字段）
     */
    private String order_id;

    /**
     * APP方菜品id，最大长度128，不同门店可以重复，同一门店内不能重复
     */
    private String app_food_code;

    /**
     * 菜品名称
     */
    private String food_name;

    /**
     * sku编码
     */
    private String sku_id;

    /**
     * 商品数量
     */
    private String quantity;

    /**
     * 商品单价，此字段默认为活动折扣后价格，可在开发者中心订阅是否替换为原价
     */
    private String price;

    /**
     * 餐盒数量
     */
    private String box_num;

    /**
     * 餐盒价格
     */
    private String box_price;

    /**
     * 规格
     */
    private String spec;

    /**
     * 单位
     */
    private String unit;

    /**
     * 商品折扣，默认为1，仅美团商家可设置
     */
    private String food_discount;

    /**
     * 菜品属性，多个属性用半角逗号隔开，该信息默认不推送，如有需求可在开发者中心订阅
     */
    private String food_property;

    /**
     * 商品所在的口袋，0为1号口袋，1为2号口袋，以此类推，如有需求请在开发者中心订阅
     */
    private String cart_id;

    /**
     * 是否是退货商品 0:否,1:是
     */
    private Integer is_rtn;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJjy_bill_id() {
        return jjy_bill_id;
    }

    public void setJjy_bill_id(String jjy_bill_id) {
        this.jjy_bill_id = jjy_bill_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getApp_food_code() {
        return app_food_code;
    }

    public void setApp_food_code(String app_food_code) {
        this.app_food_code = app_food_code;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBox_num() {
        return box_num;
    }

    public void setBox_num(String box_num) {
        this.box_num = box_num;
    }

    public String getBox_price() {
        return box_price;
    }

    public void setBox_price(String box_price) {
        this.box_price = box_price;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFood_discount() {
        return food_discount;
    }

    public void setFood_discount(String food_discount) {
        this.food_discount = food_discount;
    }

    public String getFood_property() {
        return food_property;
    }

    public void setFood_property(String food_property) {
        this.food_property = food_property;
    }

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public Integer getIs_rtn() {
        return is_rtn;
    }

    public void setIs_rtn(Integer is_rtn) {
        this.is_rtn = is_rtn;
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
        MtOrderFoodDetail other = (MtOrderFoodDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJjy_bill_id() == null ? other.getJjy_bill_id() == null : this.getJjy_bill_id().equals(other.getJjy_bill_id()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getApp_food_code() == null ? other.getApp_food_code() == null : this.getApp_food_code().equals(other.getApp_food_code()))
            && (this.getFood_name() == null ? other.getFood_name() == null : this.getFood_name().equals(other.getFood_name()))
            && (this.getSku_id() == null ? other.getSku_id() == null : this.getSku_id().equals(other.getSku_id()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBox_num() == null ? other.getBox_num() == null : this.getBox_num().equals(other.getBox_num()))
            && (this.getBox_price() == null ? other.getBox_price() == null : this.getBox_price().equals(other.getBox_price()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getFood_discount() == null ? other.getFood_discount() == null : this.getFood_discount().equals(other.getFood_discount()))
            && (this.getFood_property() == null ? other.getFood_property() == null : this.getFood_property().equals(other.getFood_property()))
            && (this.getCart_id() == null ? other.getCart_id() == null : this.getCart_id().equals(other.getCart_id()))
            && (this.getIs_rtn() == null ? other.getIs_rtn() == null : this.getIs_rtn().equals(other.getIs_rtn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJjy_bill_id() == null) ? 0 : getJjy_bill_id().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getApp_food_code() == null) ? 0 : getApp_food_code().hashCode());
        result = prime * result + ((getFood_name() == null) ? 0 : getFood_name().hashCode());
        result = prime * result + ((getSku_id() == null) ? 0 : getSku_id().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBox_num() == null) ? 0 : getBox_num().hashCode());
        result = prime * result + ((getBox_price() == null) ? 0 : getBox_price().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getFood_discount() == null) ? 0 : getFood_discount().hashCode());
        result = prime * result + ((getFood_property() == null) ? 0 : getFood_property().hashCode());
        result = prime * result + ((getCart_id() == null) ? 0 : getCart_id().hashCode());
        result = prime * result + ((getIs_rtn() == null) ? 0 : getIs_rtn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jjy_bill_id=").append(jjy_bill_id);
        sb.append(", order_id=").append(order_id);
        sb.append(", app_food_code=").append(app_food_code);
        sb.append(", food_name=").append(food_name);
        sb.append(", sku_id=").append(sku_id);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", box_num=").append(box_num);
        sb.append(", box_price=").append(box_price);
        sb.append(", spec=").append(spec);
        sb.append(", unit=").append(unit);
        sb.append(", food_discount=").append(food_discount);
        sb.append(", food_property=").append(food_property);
        sb.append(", cart_id=").append(cart_id);
        sb.append(", is_rtn=").append(is_rtn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}