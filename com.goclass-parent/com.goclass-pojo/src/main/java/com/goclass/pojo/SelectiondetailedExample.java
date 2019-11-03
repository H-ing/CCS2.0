package com.goclass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SelectiondetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectiondetailedExample() {
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

        public Criteria andSelectionDetailedIdIsNull() {
            addCriterion("selection_detailed_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdIsNotNull() {
            addCriterion("selection_detailed_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdEqualTo(Long value) {
            addCriterion("selection_detailed_id =", value, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdNotEqualTo(Long value) {
            addCriterion("selection_detailed_id <>", value, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdGreaterThan(Long value) {
            addCriterion("selection_detailed_id >", value, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("selection_detailed_id >=", value, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdLessThan(Long value) {
            addCriterion("selection_detailed_id <", value, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdLessThanOrEqualTo(Long value) {
            addCriterion("selection_detailed_id <=", value, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdIn(List<Long> values) {
            addCriterion("selection_detailed_id in", values, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdNotIn(List<Long> values) {
            addCriterion("selection_detailed_id not in", values, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdBetween(Long value1, Long value2) {
            addCriterion("selection_detailed_id between", value1, value2, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andSelectionDetailedIdNotBetween(Long value1, Long value2) {
            addCriterion("selection_detailed_id not between", value1, value2, "selectionDetailedId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdIsNull() {
            addCriterion("course_combination_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdIsNotNull() {
            addCriterion("course_combination_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdEqualTo(Integer value) {
            addCriterion("course_combination_id =", value, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdNotEqualTo(Integer value) {
            addCriterion("course_combination_id <>", value, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdGreaterThan(Integer value) {
            addCriterion("course_combination_id >", value, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_combination_id >=", value, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdLessThan(Integer value) {
            addCriterion("course_combination_id <", value, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_combination_id <=", value, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdIn(List<Integer> values) {
            addCriterion("course_combination_id in", values, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdNotIn(List<Integer> values) {
            addCriterion("course_combination_id not in", values, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdBetween(Integer value1, Integer value2) {
            addCriterion("course_combination_id between", value1, value2, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_combination_id not between", value1, value2, "courseCombinationId");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameIsNull() {
            addCriterion("course_combination_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameIsNotNull() {
            addCriterion("course_combination_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameEqualTo(String value) {
            addCriterion("course_combination_name =", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameNotEqualTo(String value) {
            addCriterion("course_combination_name <>", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameGreaterThan(String value) {
            addCriterion("course_combination_name >", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_combination_name >=", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameLessThan(String value) {
            addCriterion("course_combination_name <", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameLessThanOrEqualTo(String value) {
            addCriterion("course_combination_name <=", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameLike(String value) {
            addCriterion("course_combination_name like", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameNotLike(String value) {
            addCriterion("course_combination_name not like", value, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameIn(List<String> values) {
            addCriterion("course_combination_name in", values, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameNotIn(List<String> values) {
            addCriterion("course_combination_name not in", values, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameBetween(String value1, String value2) {
            addCriterion("course_combination_name between", value1, value2, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andCourseCombinationNameNotBetween(String value1, String value2) {
            addCriterion("course_combination_name not between", value1, value2, "courseCombinationName");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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