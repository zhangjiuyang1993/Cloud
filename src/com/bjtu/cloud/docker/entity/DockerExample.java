package com.bjtu.cloud.docker.entity;

import java.util.ArrayList;
import java.util.List;

public class DockerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DockerExample() {
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

        public Criteria andDockeridIsNull() {
            addCriterion("dockerId is null");
            return (Criteria) this;
        }

        public Criteria andDockeridIsNotNull() {
            addCriterion("dockerId is not null");
            return (Criteria) this;
        }

        public Criteria andDockeridEqualTo(Integer value) {
            addCriterion("dockerId =", value, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridNotEqualTo(Integer value) {
            addCriterion("dockerId <>", value, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridGreaterThan(Integer value) {
            addCriterion("dockerId >", value, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("dockerId >=", value, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridLessThan(Integer value) {
            addCriterion("dockerId <", value, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridLessThanOrEqualTo(Integer value) {
            addCriterion("dockerId <=", value, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridIn(List<Integer> values) {
            addCriterion("dockerId in", values, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridNotIn(List<Integer> values) {
            addCriterion("dockerId not in", values, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridBetween(Integer value1, Integer value2) {
            addCriterion("dockerId between", value1, value2, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockeridNotBetween(Integer value1, Integer value2) {
            addCriterion("dockerId not between", value1, value2, "dockerid");
            return (Criteria) this;
        }

        public Criteria andDockernameIsNull() {
            addCriterion("dockerName is null");
            return (Criteria) this;
        }

        public Criteria andDockernameIsNotNull() {
            addCriterion("dockerName is not null");
            return (Criteria) this;
        }

        public Criteria andDockernameEqualTo(String value) {
            addCriterion("dockerName =", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameNotEqualTo(String value) {
            addCriterion("dockerName <>", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameGreaterThan(String value) {
            addCriterion("dockerName >", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameGreaterThanOrEqualTo(String value) {
            addCriterion("dockerName >=", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameLessThan(String value) {
            addCriterion("dockerName <", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameLessThanOrEqualTo(String value) {
            addCriterion("dockerName <=", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameLike(String value) {
            addCriterion("dockerName like", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameNotLike(String value) {
            addCriterion("dockerName not like", value, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameIn(List<String> values) {
            addCriterion("dockerName in", values, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameNotIn(List<String> values) {
            addCriterion("dockerName not in", values, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameBetween(String value1, String value2) {
            addCriterion("dockerName between", value1, value2, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernameNotBetween(String value1, String value2) {
            addCriterion("dockerName not between", value1, value2, "dockername");
            return (Criteria) this;
        }

        public Criteria andDockernumberIsNull() {
            addCriterion("dockerNumber is null");
            return (Criteria) this;
        }

        public Criteria andDockernumberIsNotNull() {
            addCriterion("dockerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDockernumberEqualTo(String value) {
            addCriterion("dockerNumber =", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberNotEqualTo(String value) {
            addCriterion("dockerNumber <>", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberGreaterThan(String value) {
            addCriterion("dockerNumber >", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberGreaterThanOrEqualTo(String value) {
            addCriterion("dockerNumber >=", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberLessThan(String value) {
            addCriterion("dockerNumber <", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberLessThanOrEqualTo(String value) {
            addCriterion("dockerNumber <=", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberLike(String value) {
            addCriterion("dockerNumber like", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberNotLike(String value) {
            addCriterion("dockerNumber not like", value, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberIn(List<String> values) {
            addCriterion("dockerNumber in", values, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberNotIn(List<String> values) {
            addCriterion("dockerNumber not in", values, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberBetween(String value1, String value2) {
            addCriterion("dockerNumber between", value1, value2, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andDockernumberNotBetween(String value1, String value2) {
            addCriterion("dockerNumber not between", value1, value2, "dockernumber");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("ipAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("ipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("ipAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("ipAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("ipAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("ipAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("ipAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("ipAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("ipAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("ipAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("ipAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("ipAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("ipAddress not between", value1, value2, "ipaddress");
            return (Criteria) this;
        }
    }

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