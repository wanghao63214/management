package com.beans;

import java.util.ArrayList;
import java.util.List;

public class MtOfferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MtOfferExample() {
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

        public Criteria andAct_detail_idIsNull() {
            addCriterion("act_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idIsNotNull() {
            addCriterion("act_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idEqualTo(String value) {
            addCriterion("act_detail_id =", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idNotEqualTo(String value) {
            addCriterion("act_detail_id <>", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idGreaterThan(String value) {
            addCriterion("act_detail_id >", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idGreaterThanOrEqualTo(String value) {
            addCriterion("act_detail_id >=", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idLessThan(String value) {
            addCriterion("act_detail_id <", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idLessThanOrEqualTo(String value) {
            addCriterion("act_detail_id <=", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idLike(String value) {
            addCriterion("act_detail_id like", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idNotLike(String value) {
            addCriterion("act_detail_id not like", value, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idIn(List<String> values) {
            addCriterion("act_detail_id in", values, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idNotIn(List<String> values) {
            addCriterion("act_detail_id not in", values, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idBetween(String value1, String value2) {
            addCriterion("act_detail_id between", value1, value2, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andAct_detail_idNotBetween(String value1, String value2) {
            addCriterion("act_detail_id not between", value1, value2, "act_detail_id");
            return (Criteria) this;
        }

        public Criteria andReduce_feeIsNull() {
            addCriterion("reduce_fee is null");
            return (Criteria) this;
        }

        public Criteria andReduce_feeIsNotNull() {
            addCriterion("reduce_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReduce_feeEqualTo(String value) {
            addCriterion("reduce_fee =", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeNotEqualTo(String value) {
            addCriterion("reduce_fee <>", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeGreaterThan(String value) {
            addCriterion("reduce_fee >", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeGreaterThanOrEqualTo(String value) {
            addCriterion("reduce_fee >=", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeLessThan(String value) {
            addCriterion("reduce_fee <", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeLessThanOrEqualTo(String value) {
            addCriterion("reduce_fee <=", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeLike(String value) {
            addCriterion("reduce_fee like", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeNotLike(String value) {
            addCriterion("reduce_fee not like", value, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeIn(List<String> values) {
            addCriterion("reduce_fee in", values, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeNotIn(List<String> values) {
            addCriterion("reduce_fee not in", values, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeBetween(String value1, String value2) {
            addCriterion("reduce_fee between", value1, value2, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andReduce_feeNotBetween(String value1, String value2) {
            addCriterion("reduce_fee not between", value1, value2, "reduce_fee");
            return (Criteria) this;
        }

        public Criteria andMt_chargeIsNull() {
            addCriterion("mt_charge is null");
            return (Criteria) this;
        }

        public Criteria andMt_chargeIsNotNull() {
            addCriterion("mt_charge is not null");
            return (Criteria) this;
        }

        public Criteria andMt_chargeEqualTo(String value) {
            addCriterion("mt_charge =", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeNotEqualTo(String value) {
            addCriterion("mt_charge <>", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeGreaterThan(String value) {
            addCriterion("mt_charge >", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeGreaterThanOrEqualTo(String value) {
            addCriterion("mt_charge >=", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeLessThan(String value) {
            addCriterion("mt_charge <", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeLessThanOrEqualTo(String value) {
            addCriterion("mt_charge <=", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeLike(String value) {
            addCriterion("mt_charge like", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeNotLike(String value) {
            addCriterion("mt_charge not like", value, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeIn(List<String> values) {
            addCriterion("mt_charge in", values, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeNotIn(List<String> values) {
            addCriterion("mt_charge not in", values, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeBetween(String value1, String value2) {
            addCriterion("mt_charge between", value1, value2, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andMt_chargeNotBetween(String value1, String value2) {
            addCriterion("mt_charge not between", value1, value2, "mt_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeIsNull() {
            addCriterion("poi_charge is null");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeIsNotNull() {
            addCriterion("poi_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeEqualTo(String value) {
            addCriterion("poi_charge =", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeNotEqualTo(String value) {
            addCriterion("poi_charge <>", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeGreaterThan(String value) {
            addCriterion("poi_charge >", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeGreaterThanOrEqualTo(String value) {
            addCriterion("poi_charge >=", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeLessThan(String value) {
            addCriterion("poi_charge <", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeLessThanOrEqualTo(String value) {
            addCriterion("poi_charge <=", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeLike(String value) {
            addCriterion("poi_charge like", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeNotLike(String value) {
            addCriterion("poi_charge not like", value, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeIn(List<String> values) {
            addCriterion("poi_charge in", values, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeNotIn(List<String> values) {
            addCriterion("poi_charge not in", values, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeBetween(String value1, String value2) {
            addCriterion("poi_charge between", value1, value2, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andPoi_chargeNotBetween(String value1, String value2) {
            addCriterion("poi_charge not between", value1, value2, "poi_charge");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRider_feeIsNull() {
            addCriterion("rider_fee is null");
            return (Criteria) this;
        }

        public Criteria andRider_feeIsNotNull() {
            addCriterion("rider_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRider_feeEqualTo(String value) {
            addCriterion("rider_fee =", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeNotEqualTo(String value) {
            addCriterion("rider_fee <>", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeGreaterThan(String value) {
            addCriterion("rider_fee >", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeGreaterThanOrEqualTo(String value) {
            addCriterion("rider_fee >=", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeLessThan(String value) {
            addCriterion("rider_fee <", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeLessThanOrEqualTo(String value) {
            addCriterion("rider_fee <=", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeLike(String value) {
            addCriterion("rider_fee like", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeNotLike(String value) {
            addCriterion("rider_fee not like", value, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeIn(List<String> values) {
            addCriterion("rider_fee in", values, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeNotIn(List<String> values) {
            addCriterion("rider_fee not in", values, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeBetween(String value1, String value2) {
            addCriterion("rider_fee between", value1, value2, "rider_fee");
            return (Criteria) this;
        }

        public Criteria andRider_feeNotBetween(String value1, String value2) {
            addCriterion("rider_fee not between", value1, value2, "rider_fee");
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