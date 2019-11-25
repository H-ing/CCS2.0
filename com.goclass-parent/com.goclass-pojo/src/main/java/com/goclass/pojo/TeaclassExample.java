package com.goclass.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeaclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeaclassExample() {
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

        public Criteria andSubjectNumIsNull() {
            addCriterion("subject_num is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNumIsNotNull() {
            addCriterion("subject_num is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNumEqualTo(Integer value) {
            addCriterion("subject_num =", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumNotEqualTo(Integer value) {
            addCriterion("subject_num <>", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumGreaterThan(Integer value) {
            addCriterion("subject_num >", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_num >=", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumLessThan(Integer value) {
            addCriterion("subject_num <", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumLessThanOrEqualTo(Integer value) {
            addCriterion("subject_num <=", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumIn(List<Integer> values) {
            addCriterion("subject_num in", values, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumNotIn(List<Integer> values) {
            addCriterion("subject_num not in", values, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumBetween(Integer value1, Integer value2) {
            addCriterion("subject_num between", value1, value2, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_num not between", value1, value2, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameIsNull() {
            addCriterion("teaclass_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameIsNotNull() {
            addCriterion("teaclass_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameEqualTo(String value) {
            addCriterion("teaclass_name =", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameNotEqualTo(String value) {
            addCriterion("teaclass_name <>", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameGreaterThan(String value) {
            addCriterion("teaclass_name >", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameGreaterThanOrEqualTo(String value) {
            addCriterion("teaclass_name >=", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameLessThan(String value) {
            addCriterion("teaclass_name <", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameLessThanOrEqualTo(String value) {
            addCriterion("teaclass_name <=", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameLike(String value) {
            addCriterion("teaclass_name like", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameNotLike(String value) {
            addCriterion("teaclass_name not like", value, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameIn(List<String> values) {
            addCriterion("teaclass_name in", values, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameNotIn(List<String> values) {
            addCriterion("teaclass_name not in", values, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameBetween(String value1, String value2) {
            addCriterion("teaclass_name between", value1, value2, "teaclassName");
            return (Criteria) this;
        }

        public Criteria andTeaclassNameNotBetween(String value1, String value2) {
            addCriterion("teaclass_name not between", value1, value2, "teaclassName");
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