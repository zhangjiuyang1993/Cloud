package com.bjtu.cloud.process.entity;

import java.util.ArrayList;
import java.util.List;

public class ProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
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

        public Criteria andCpuPercentIsNull() {
            addCriterion("cpu_percent is null");
            return (Criteria) this;
        }

        public Criteria andCpuPercentIsNotNull() {
            addCriterion("cpu_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCpuPercentEqualTo(Double value) {
            addCriterion("cpu_percent =", value, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentNotEqualTo(Double value) {
            addCriterion("cpu_percent <>", value, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentGreaterThan(Double value) {
            addCriterion("cpu_percent >", value, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("cpu_percent >=", value, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentLessThan(Double value) {
            addCriterion("cpu_percent <", value, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentLessThanOrEqualTo(Double value) {
            addCriterion("cpu_percent <=", value, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentIn(List<Double> values) {
            addCriterion("cpu_percent in", values, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentNotIn(List<Double> values) {
            addCriterion("cpu_percent not in", values, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentBetween(Double value1, Double value2) {
            addCriterion("cpu_percent between", value1, value2, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andCpuPercentNotBetween(Double value1, Double value2) {
            addCriterion("cpu_percent not between", value1, value2, "cpuPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNull() {
            addCriterion("memory_used is null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNotNull() {
            addCriterion("memory_used is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedEqualTo(String value) {
            addCriterion("memory_used =", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotEqualTo(String value) {
            addCriterion("memory_used <>", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThan(String value) {
            addCriterion("memory_used >", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThanOrEqualTo(String value) {
            addCriterion("memory_used >=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThan(String value) {
            addCriterion("memory_used <", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThanOrEqualTo(String value) {
            addCriterion("memory_used <=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLike(String value) {
            addCriterion("memory_used like", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotLike(String value) {
            addCriterion("memory_used not like", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIn(List<String> values) {
            addCriterion("memory_used in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotIn(List<String> values) {
            addCriterion("memory_used not in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedBetween(String value1, String value2) {
            addCriterion("memory_used between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotBetween(String value1, String value2) {
            addCriterion("memory_used not between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentIsNull() {
            addCriterion("memory_percent is null");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentIsNotNull() {
            addCriterion("memory_percent is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentEqualTo(Double value) {
            addCriterion("memory_percent =", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentNotEqualTo(Double value) {
            addCriterion("memory_percent <>", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentGreaterThan(Double value) {
            addCriterion("memory_percent >", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("memory_percent >=", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentLessThan(Double value) {
            addCriterion("memory_percent <", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentLessThanOrEqualTo(Double value) {
            addCriterion("memory_percent <=", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentIn(List<Double> values) {
            addCriterion("memory_percent in", values, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentNotIn(List<Double> values) {
            addCriterion("memory_percent not in", values, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentBetween(Double value1, Double value2) {
            addCriterion("memory_percent between", value1, value2, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentNotBetween(Double value1, Double value2) {
            addCriterion("memory_percent not between", value1, value2, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIsNull() {
            addCriterion("disk_used is null");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIsNotNull() {
            addCriterion("disk_used is not null");
            return (Criteria) this;
        }

        public Criteria andDiskUsedEqualTo(String value) {
            addCriterion("disk_used =", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotEqualTo(String value) {
            addCriterion("disk_used <>", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedGreaterThan(String value) {
            addCriterion("disk_used >", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedGreaterThanOrEqualTo(String value) {
            addCriterion("disk_used >=", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLessThan(String value) {
            addCriterion("disk_used <", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLessThanOrEqualTo(String value) {
            addCriterion("disk_used <=", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLike(String value) {
            addCriterion("disk_used like", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotLike(String value) {
            addCriterion("disk_used not like", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIn(List<String> values) {
            addCriterion("disk_used in", values, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotIn(List<String> values) {
            addCriterion("disk_used not in", values, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedBetween(String value1, String value2) {
            addCriterion("disk_used between", value1, value2, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotBetween(String value1, String value2) {
            addCriterion("disk_used not between", value1, value2, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskPercentIsNull() {
            addCriterion("disk_percent is null");
            return (Criteria) this;
        }

        public Criteria andDiskPercentIsNotNull() {
            addCriterion("disk_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDiskPercentEqualTo(Double value) {
            addCriterion("disk_percent =", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentNotEqualTo(Double value) {
            addCriterion("disk_percent <>", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentGreaterThan(Double value) {
            addCriterion("disk_percent >", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("disk_percent >=", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentLessThan(Double value) {
            addCriterion("disk_percent <", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentLessThanOrEqualTo(Double value) {
            addCriterion("disk_percent <=", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentIn(List<Double> values) {
            addCriterion("disk_percent in", values, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentNotIn(List<Double> values) {
            addCriterion("disk_percent not in", values, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentBetween(Double value1, Double value2) {
            addCriterion("disk_percent between", value1, value2, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentNotBetween(Double value1, Double value2) {
            addCriterion("disk_percent not between", value1, value2, "diskPercent");
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