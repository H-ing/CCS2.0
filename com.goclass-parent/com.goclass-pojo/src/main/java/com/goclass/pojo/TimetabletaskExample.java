package com.goclass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimetabletaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimetabletaskExample() {
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

        public Criteria andTimetableTaskIdIsNull() {
            addCriterion("timetable_task_id is null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdIsNotNull() {
            addCriterion("timetable_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdEqualTo(Long value) {
            addCriterion("timetable_task_id =", value, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdNotEqualTo(Long value) {
            addCriterion("timetable_task_id <>", value, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdGreaterThan(Long value) {
            addCriterion("timetable_task_id >", value, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("timetable_task_id >=", value, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdLessThan(Long value) {
            addCriterion("timetable_task_id <", value, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("timetable_task_id <=", value, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdIn(List<Long> values) {
            addCriterion("timetable_task_id in", values, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdNotIn(List<Long> values) {
            addCriterion("timetable_task_id not in", values, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdBetween(Long value1, Long value2) {
            addCriterion("timetable_task_id between", value1, value2, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("timetable_task_id not between", value1, value2, "timetableTaskId");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameIsNull() {
            addCriterion("timetable_task_name is null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameIsNotNull() {
            addCriterion("timetable_task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameEqualTo(String value) {
            addCriterion("timetable_task_name =", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameNotEqualTo(String value) {
            addCriterion("timetable_task_name <>", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameGreaterThan(String value) {
            addCriterion("timetable_task_name >", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("timetable_task_name >=", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameLessThan(String value) {
            addCriterion("timetable_task_name <", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameLessThanOrEqualTo(String value) {
            addCriterion("timetable_task_name <=", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameLike(String value) {
            addCriterion("timetable_task_name like", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameNotLike(String value) {
            addCriterion("timetable_task_name not like", value, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameIn(List<String> values) {
            addCriterion("timetable_task_name in", values, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameNotIn(List<String> values) {
            addCriterion("timetable_task_name not in", values, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameBetween(String value1, String value2) {
            addCriterion("timetable_task_name between", value1, value2, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskNameNotBetween(String value1, String value2) {
            addCriterion("timetable_task_name not between", value1, value2, "timetableTaskName");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidIsNull() {
            addCriterion("timetable_task_ruleid is null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidIsNotNull() {
            addCriterion("timetable_task_ruleid is not null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidEqualTo(String value) {
            addCriterion("timetable_task_ruleid =", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidNotEqualTo(String value) {
            addCriterion("timetable_task_ruleid <>", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidGreaterThan(String value) {
            addCriterion("timetable_task_ruleid >", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidGreaterThanOrEqualTo(String value) {
            addCriterion("timetable_task_ruleid >=", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidLessThan(String value) {
            addCriterion("timetable_task_ruleid <", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidLessThanOrEqualTo(String value) {
            addCriterion("timetable_task_ruleid <=", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidLike(String value) {
            addCriterion("timetable_task_ruleid like", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidNotLike(String value) {
            addCriterion("timetable_task_ruleid not like", value, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidIn(List<String> values) {
            addCriterion("timetable_task_ruleid in", values, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidNotIn(List<String> values) {
            addCriterion("timetable_task_ruleid not in", values, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidBetween(String value1, String value2) {
            addCriterion("timetable_task_ruleid between", value1, value2, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskRuleidNotBetween(String value1, String value2) {
            addCriterion("timetable_task_ruleid not between", value1, value2, "timetableTaskRuleid");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusIsNull() {
            addCriterion("timetable_task_status is null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusIsNotNull() {
            addCriterion("timetable_task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusEqualTo(Integer value) {
            addCriterion("timetable_task_status =", value, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusNotEqualTo(Integer value) {
            addCriterion("timetable_task_status <>", value, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusGreaterThan(Integer value) {
            addCriterion("timetable_task_status >", value, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("timetable_task_status >=", value, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusLessThan(Integer value) {
            addCriterion("timetable_task_status <", value, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("timetable_task_status <=", value, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusIn(List<Integer> values) {
            addCriterion("timetable_task_status in", values, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusNotIn(List<Integer> values) {
            addCriterion("timetable_task_status not in", values, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("timetable_task_status between", value1, value2, "timetableTaskStatus");
            return (Criteria) this;
        }

        public Criteria andTimetableTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("timetable_task_status not between", value1, value2, "timetableTaskStatus");
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