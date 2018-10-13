package com.beans;

import java.util.ArrayList;
import java.util.List;

public class AppCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AppCodeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andDb_idIsNull() {
            addCriterion("db_id is null");
            return (Criteria) this;
        }

        public Criteria andDb_idIsNotNull() {
            addCriterion("db_id is not null");
            return (Criteria) this;
        }

        public Criteria andDb_idEqualTo(String value) {
            addCriterion("db_id =", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idNotEqualTo(String value) {
            addCriterion("db_id <>", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idGreaterThan(String value) {
            addCriterion("db_id >", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idGreaterThanOrEqualTo(String value) {
            addCriterion("db_id >=", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idLessThan(String value) {
            addCriterion("db_id <", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idLessThanOrEqualTo(String value) {
            addCriterion("db_id <=", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idLike(String value) {
            addCriterion("db_id like", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idNotLike(String value) {
            addCriterion("db_id not like", value, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idIn(List<String> values) {
            addCriterion("db_id in", values, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idNotIn(List<String> values) {
            addCriterion("db_id not in", values, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idBetween(String value1, String value2) {
            addCriterion("db_id between", value1, value2, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_idNotBetween(String value1, String value2) {
            addCriterion("db_id not between", value1, value2, "db_id");
            return (Criteria) this;
        }

        public Criteria andDb_nameIsNull() {
            addCriterion("db_name is null");
            return (Criteria) this;
        }

        public Criteria andDb_nameIsNotNull() {
            addCriterion("db_name is not null");
            return (Criteria) this;
        }

        public Criteria andDb_nameEqualTo(String value) {
            addCriterion("db_name =", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameNotEqualTo(String value) {
            addCriterion("db_name <>", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameGreaterThan(String value) {
            addCriterion("db_name >", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameGreaterThanOrEqualTo(String value) {
            addCriterion("db_name >=", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameLessThan(String value) {
            addCriterion("db_name <", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameLessThanOrEqualTo(String value) {
            addCriterion("db_name <=", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameLike(String value) {
            addCriterion("db_name like", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameNotLike(String value) {
            addCriterion("db_name not like", value, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameIn(List<String> values) {
            addCriterion("db_name in", values, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameNotIn(List<String> values) {
            addCriterion("db_name not in", values, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameBetween(String value1, String value2) {
            addCriterion("db_name between", value1, value2, "db_name");
            return (Criteria) this;
        }

        public Criteria andDb_nameNotBetween(String value1, String value2) {
            addCriterion("db_name not between", value1, value2, "db_name");
            return (Criteria) this;
        }

        public Criteria andIs_onlineIsNull() {
            addCriterion("is_online is null");
            return (Criteria) this;
        }

        public Criteria andIs_onlineIsNotNull() {
            addCriterion("is_online is not null");
            return (Criteria) this;
        }

        public Criteria andIs_onlineEqualTo(Integer value) {
            addCriterion("is_online =", value, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineNotEqualTo(Integer value) {
            addCriterion("is_online <>", value, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineGreaterThan(Integer value) {
            addCriterion("is_online >", value, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_online >=", value, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineLessThan(Integer value) {
            addCriterion("is_online <", value, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineLessThanOrEqualTo(Integer value) {
            addCriterion("is_online <=", value, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineIn(List<Integer> values) {
            addCriterion("is_online in", values, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineNotIn(List<Integer> values) {
            addCriterion("is_online not in", values, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineBetween(Integer value1, Integer value2) {
            addCriterion("is_online between", value1, value2, "is_online");
            return (Criteria) this;
        }

        public Criteria andIs_onlineNotBetween(Integer value1, Integer value2) {
            addCriterion("is_online not between", value1, value2, "is_online");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop_idEqualTo(String value) {
            addCriterion("shop_id =", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThan(String value) {
            addCriterion("shop_id >", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThan(String value) {
            addCriterion("shop_id <", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLike(String value) {
            addCriterion("shop_id like", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotLike(String value) {
            addCriterion("shop_id not like", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIn(List<String> values) {
            addCriterion("shop_id in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeIsNull() {
            addCriterion("app_poi_code is null");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeIsNotNull() {
            addCriterion("app_poi_code is not null");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeEqualTo(String value) {
            addCriterion("app_poi_code =", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeNotEqualTo(String value) {
            addCriterion("app_poi_code <>", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeGreaterThan(String value) {
            addCriterion("app_poi_code >", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeGreaterThanOrEqualTo(String value) {
            addCriterion("app_poi_code >=", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeLessThan(String value) {
            addCriterion("app_poi_code <", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeLessThanOrEqualTo(String value) {
            addCriterion("app_poi_code <=", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeLike(String value) {
            addCriterion("app_poi_code like", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeNotLike(String value) {
            addCriterion("app_poi_code not like", value, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeIn(List<String> values) {
            addCriterion("app_poi_code in", values, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeNotIn(List<String> values) {
            addCriterion("app_poi_code not in", values, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeBetween(String value1, String value2) {
            addCriterion("app_poi_code between", value1, value2, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andApp_poi_codeNotBetween(String value1, String value2) {
            addCriterion("app_poi_code not between", value1, value2, "app_poi_code");
            return (Criteria) this;
        }

        public Criteria andShop_nameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShop_nameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShop_nameEqualTo(String value) {
            addCriterion("shop_name =", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLessThan(String value) {
            addCriterion("shop_name <", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLike(String value) {
            addCriterion("shop_name like", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotLike(String value) {
            addCriterion("shop_name not like", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameIn(List<String> values) {
            addCriterion("shop_name in", values, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shop_name");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidIsNull() {
            addCriterion("package_bag_skuid is null");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidIsNotNull() {
            addCriterion("package_bag_skuid is not null");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidEqualTo(String value) {
            addCriterion("package_bag_skuid =", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidNotEqualTo(String value) {
            addCriterion("package_bag_skuid <>", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidGreaterThan(String value) {
            addCriterion("package_bag_skuid >", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidGreaterThanOrEqualTo(String value) {
            addCriterion("package_bag_skuid >=", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidLessThan(String value) {
            addCriterion("package_bag_skuid <", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidLessThanOrEqualTo(String value) {
            addCriterion("package_bag_skuid <=", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidLike(String value) {
            addCriterion("package_bag_skuid like", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidNotLike(String value) {
            addCriterion("package_bag_skuid not like", value, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidIn(List<String> values) {
            addCriterion("package_bag_skuid in", values, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidNotIn(List<String> values) {
            addCriterion("package_bag_skuid not in", values, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidBetween(String value1, String value2) {
            addCriterion("package_bag_skuid between", value1, value2, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andPackage_bag_skuidNotBetween(String value1, String value2) {
            addCriterion("package_bag_skuid not between", value1, value2, "package_bag_skuid");
            return (Criteria) this;
        }

        public Criteria andApp_idIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andApp_idIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andApp_idEqualTo(String value) {
            addCriterion("app_id =", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotEqualTo(String value) {
            addCriterion("app_id <>", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idGreaterThan(String value) {
            addCriterion("app_id >", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idLessThan(String value) {
            addCriterion("app_id <", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idLike(String value) {
            addCriterion("app_id like", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotLike(String value) {
            addCriterion("app_id not like", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idIn(List<String> values) {
            addCriterion("app_id in", values, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotIn(List<String> values) {
            addCriterion("app_id not in", values, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_secretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andApp_secretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andApp_secretEqualTo(String value) {
            addCriterion("app_secret =", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretGreaterThan(String value) {
            addCriterion("app_secret >", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretLessThan(String value) {
            addCriterion("app_secret <", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretLike(String value) {
            addCriterion("app_secret like", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretNotLike(String value) {
            addCriterion("app_secret not like", value, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretIn(List<String> values) {
            addCriterion("app_secret in", values, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "app_secret");
            return (Criteria) this;
        }

        public Criteria andApp_secretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "app_secret");
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