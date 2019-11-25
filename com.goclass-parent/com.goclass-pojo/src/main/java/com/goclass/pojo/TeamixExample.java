package com.goclass.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeamixExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamixExample() {
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

        public Criteria andTeaclassIdIsNull() {
            addCriterion("teaclass_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdIsNotNull() {
            addCriterion("teaclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdEqualTo(Long value) {
            addCriterion("teaclass_id =", value, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdNotEqualTo(Long value) {
            addCriterion("teaclass_id <>", value, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdGreaterThan(Long value) {
            addCriterion("teaclass_id >", value, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teaclass_id >=", value, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdLessThan(Long value) {
            addCriterion("teaclass_id <", value, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdLessThanOrEqualTo(Long value) {
            addCriterion("teaclass_id <=", value, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdIn(List<Long> values) {
            addCriterion("teaclass_id in", values, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdNotIn(List<Long> values) {
            addCriterion("teaclass_id not in", values, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdBetween(Long value1, Long value2) {
            addCriterion("teaclass_id between", value1, value2, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andTeaclassIdNotBetween(Long value1, Long value2) {
            addCriterion("teaclass_id not between", value1, value2, "teaclassId");
            return (Criteria) this;
        }

        public Criteria andMixIdIsNull() {
            addCriterion("mix_id is null");
            return (Criteria) this;
        }

        public Criteria andMixIdIsNotNull() {
            addCriterion("mix_id is not null");
            return (Criteria) this;
        }

        public Criteria andMixIdEqualTo(Long value) {
            addCriterion("mix_id =", value, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdNotEqualTo(Long value) {
            addCriterion("mix_id <>", value, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdGreaterThan(Long value) {
            addCriterion("mix_id >", value, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mix_id >=", value, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdLessThan(Long value) {
            addCriterion("mix_id <", value, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdLessThanOrEqualTo(Long value) {
            addCriterion("mix_id <=", value, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdIn(List<Long> values) {
            addCriterion("mix_id in", values, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdNotIn(List<Long> values) {
            addCriterion("mix_id not in", values, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdBetween(Long value1, Long value2) {
            addCriterion("mix_id between", value1, value2, "mixId");
            return (Criteria) this;
        }

        public Criteria andMixIdNotBetween(Long value1, Long value2) {
            addCriterion("mix_id not between", value1, value2, "mixId");
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