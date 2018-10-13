package com.beans;

import java.util.ArrayList;
import java.util.List;

public class MtOrderFoodDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MtOrderFoodDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idIsNull() {
            addCriterion("jjy_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idIsNotNull() {
            addCriterion("jjy_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idEqualTo(String value) {
            addCriterion("jjy_bill_id =", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idNotEqualTo(String value) {
            addCriterion("jjy_bill_id <>", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idGreaterThan(String value) {
            addCriterion("jjy_bill_id >", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idGreaterThanOrEqualTo(String value) {
            addCriterion("jjy_bill_id >=", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idLessThan(String value) {
            addCriterion("jjy_bill_id <", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idLessThanOrEqualTo(String value) {
            addCriterion("jjy_bill_id <=", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idLike(String value) {
            addCriterion("jjy_bill_id like", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idNotLike(String value) {
            addCriterion("jjy_bill_id not like", value, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idIn(List<String> values) {
            addCriterion("jjy_bill_id in", values, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idNotIn(List<String> values) {
            addCriterion("jjy_bill_id not in", values, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idBetween(String value1, String value2) {
            addCriterion("jjy_bill_id between", value1, value2, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andJjy_bill_idNotBetween(String value1, String value2) {
            addCriterion("jjy_bill_id not between", value1, value2, "jjy_bill_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(String value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(String value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(String value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(String value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLike(String value) {
            addCriterion("order_id like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotLike(String value) {
            addCriterion("order_id not like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<String> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<String> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeIsNull() {
            addCriterion("app_food_code is null");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeIsNotNull() {
            addCriterion("app_food_code is not null");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeEqualTo(String value) {
            addCriterion("app_food_code =", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeNotEqualTo(String value) {
            addCriterion("app_food_code <>", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeGreaterThan(String value) {
            addCriterion("app_food_code >", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeGreaterThanOrEqualTo(String value) {
            addCriterion("app_food_code >=", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeLessThan(String value) {
            addCriterion("app_food_code <", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeLessThanOrEqualTo(String value) {
            addCriterion("app_food_code <=", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeLike(String value) {
            addCriterion("app_food_code like", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeNotLike(String value) {
            addCriterion("app_food_code not like", value, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeIn(List<String> values) {
            addCriterion("app_food_code in", values, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeNotIn(List<String> values) {
            addCriterion("app_food_code not in", values, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeBetween(String value1, String value2) {
            addCriterion("app_food_code between", value1, value2, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andApp_food_codeNotBetween(String value1, String value2) {
            addCriterion("app_food_code not between", value1, value2, "app_food_code");
            return (Criteria) this;
        }

        public Criteria andFood_nameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFood_nameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFood_nameEqualTo(String value) {
            addCriterion("food_name =", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameGreaterThan(String value) {
            addCriterion("food_name >", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameLessThan(String value) {
            addCriterion("food_name <", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameLike(String value) {
            addCriterion("food_name like", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameNotLike(String value) {
            addCriterion("food_name not like", value, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameIn(List<String> values) {
            addCriterion("food_name in", values, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "food_name");
            return (Criteria) this;
        }

        public Criteria andFood_nameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "food_name");
            return (Criteria) this;
        }

        public Criteria andSku_idIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSku_idIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSku_idEqualTo(String value) {
            addCriterion("sku_id =", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idGreaterThan(String value) {
            addCriterion("sku_id >", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLessThan(String value) {
            addCriterion("sku_id <", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLike(String value) {
            addCriterion("sku_id like", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotLike(String value) {
            addCriterion("sku_id not like", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idIn(List<String> values) {
            addCriterion("sku_id in", values, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "sku_id");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBox_numIsNull() {
            addCriterion("box_num is null");
            return (Criteria) this;
        }

        public Criteria andBox_numIsNotNull() {
            addCriterion("box_num is not null");
            return (Criteria) this;
        }

        public Criteria andBox_numEqualTo(String value) {
            addCriterion("box_num =", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numNotEqualTo(String value) {
            addCriterion("box_num <>", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numGreaterThan(String value) {
            addCriterion("box_num >", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numGreaterThanOrEqualTo(String value) {
            addCriterion("box_num >=", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numLessThan(String value) {
            addCriterion("box_num <", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numLessThanOrEqualTo(String value) {
            addCriterion("box_num <=", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numLike(String value) {
            addCriterion("box_num like", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numNotLike(String value) {
            addCriterion("box_num not like", value, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numIn(List<String> values) {
            addCriterion("box_num in", values, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numNotIn(List<String> values) {
            addCriterion("box_num not in", values, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numBetween(String value1, String value2) {
            addCriterion("box_num between", value1, value2, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_numNotBetween(String value1, String value2) {
            addCriterion("box_num not between", value1, value2, "box_num");
            return (Criteria) this;
        }

        public Criteria andBox_priceIsNull() {
            addCriterion("box_price is null");
            return (Criteria) this;
        }

        public Criteria andBox_priceIsNotNull() {
            addCriterion("box_price is not null");
            return (Criteria) this;
        }

        public Criteria andBox_priceEqualTo(String value) {
            addCriterion("box_price =", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotEqualTo(String value) {
            addCriterion("box_price <>", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceGreaterThan(String value) {
            addCriterion("box_price >", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceGreaterThanOrEqualTo(String value) {
            addCriterion("box_price >=", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceLessThan(String value) {
            addCriterion("box_price <", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceLessThanOrEqualTo(String value) {
            addCriterion("box_price <=", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceLike(String value) {
            addCriterion("box_price like", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotLike(String value) {
            addCriterion("box_price not like", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceIn(List<String> values) {
            addCriterion("box_price in", values, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotIn(List<String> values) {
            addCriterion("box_price not in", values, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceBetween(String value1, String value2) {
            addCriterion("box_price between", value1, value2, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotBetween(String value1, String value2) {
            addCriterion("box_price not between", value1, value2, "box_price");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andFood_discountIsNull() {
            addCriterion("food_discount is null");
            return (Criteria) this;
        }

        public Criteria andFood_discountIsNotNull() {
            addCriterion("food_discount is not null");
            return (Criteria) this;
        }

        public Criteria andFood_discountEqualTo(String value) {
            addCriterion("food_discount =", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountNotEqualTo(String value) {
            addCriterion("food_discount <>", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountGreaterThan(String value) {
            addCriterion("food_discount >", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountGreaterThanOrEqualTo(String value) {
            addCriterion("food_discount >=", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountLessThan(String value) {
            addCriterion("food_discount <", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountLessThanOrEqualTo(String value) {
            addCriterion("food_discount <=", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountLike(String value) {
            addCriterion("food_discount like", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountNotLike(String value) {
            addCriterion("food_discount not like", value, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountIn(List<String> values) {
            addCriterion("food_discount in", values, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountNotIn(List<String> values) {
            addCriterion("food_discount not in", values, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountBetween(String value1, String value2) {
            addCriterion("food_discount between", value1, value2, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_discountNotBetween(String value1, String value2) {
            addCriterion("food_discount not between", value1, value2, "food_discount");
            return (Criteria) this;
        }

        public Criteria andFood_propertyIsNull() {
            addCriterion("food_property is null");
            return (Criteria) this;
        }

        public Criteria andFood_propertyIsNotNull() {
            addCriterion("food_property is not null");
            return (Criteria) this;
        }

        public Criteria andFood_propertyEqualTo(String value) {
            addCriterion("food_property =", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyNotEqualTo(String value) {
            addCriterion("food_property <>", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyGreaterThan(String value) {
            addCriterion("food_property >", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyGreaterThanOrEqualTo(String value) {
            addCriterion("food_property >=", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyLessThan(String value) {
            addCriterion("food_property <", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyLessThanOrEqualTo(String value) {
            addCriterion("food_property <=", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyLike(String value) {
            addCriterion("food_property like", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyNotLike(String value) {
            addCriterion("food_property not like", value, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyIn(List<String> values) {
            addCriterion("food_property in", values, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyNotIn(List<String> values) {
            addCriterion("food_property not in", values, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyBetween(String value1, String value2) {
            addCriterion("food_property between", value1, value2, "food_property");
            return (Criteria) this;
        }

        public Criteria andFood_propertyNotBetween(String value1, String value2) {
            addCriterion("food_property not between", value1, value2, "food_property");
            return (Criteria) this;
        }

        public Criteria andCart_idIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCart_idIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCart_idEqualTo(String value) {
            addCriterion("cart_id =", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idNotEqualTo(String value) {
            addCriterion("cart_id <>", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idGreaterThan(String value) {
            addCriterion("cart_id >", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idGreaterThanOrEqualTo(String value) {
            addCriterion("cart_id >=", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idLessThan(String value) {
            addCriterion("cart_id <", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idLessThanOrEqualTo(String value) {
            addCriterion("cart_id <=", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idLike(String value) {
            addCriterion("cart_id like", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idNotLike(String value) {
            addCriterion("cart_id not like", value, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idIn(List<String> values) {
            addCriterion("cart_id in", values, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idNotIn(List<String> values) {
            addCriterion("cart_id not in", values, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idBetween(String value1, String value2) {
            addCriterion("cart_id between", value1, value2, "cart_id");
            return (Criteria) this;
        }

        public Criteria andCart_idNotBetween(String value1, String value2) {
            addCriterion("cart_id not between", value1, value2, "cart_id");
            return (Criteria) this;
        }

        public Criteria andIs_rtnIsNull() {
            addCriterion("is_rtn is null");
            return (Criteria) this;
        }

        public Criteria andIs_rtnIsNotNull() {
            addCriterion("is_rtn is not null");
            return (Criteria) this;
        }

        public Criteria andIs_rtnEqualTo(Integer value) {
            addCriterion("is_rtn =", value, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnNotEqualTo(Integer value) {
            addCriterion("is_rtn <>", value, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnGreaterThan(Integer value) {
            addCriterion("is_rtn >", value, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_rtn >=", value, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnLessThan(Integer value) {
            addCriterion("is_rtn <", value, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnLessThanOrEqualTo(Integer value) {
            addCriterion("is_rtn <=", value, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnIn(List<Integer> values) {
            addCriterion("is_rtn in", values, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnNotIn(List<Integer> values) {
            addCriterion("is_rtn not in", values, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnBetween(Integer value1, Integer value2) {
            addCriterion("is_rtn between", value1, value2, "is_rtn");
            return (Criteria) this;
        }

        public Criteria andIs_rtnNotBetween(Integer value1, Integer value2) {
            addCriterion("is_rtn not between", value1, value2, "is_rtn");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}