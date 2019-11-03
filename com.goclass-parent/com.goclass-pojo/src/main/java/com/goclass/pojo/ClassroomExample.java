package com.goclass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Long value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Long value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Long value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Long value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Long value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Long> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Long> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Long value1, Long value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Long value1, Long value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNull() {
            addCriterion("classroom_name is null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNotNull() {
            addCriterion("classroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameEqualTo(String value) {
            addCriterion("classroom_name =", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotEqualTo(String value) {
            addCriterion("classroom_name <>", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThan(String value) {
            addCriterion("classroom_name >", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_name >=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThan(String value) {
            addCriterion("classroom_name <", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThanOrEqualTo(String value) {
            addCriterion("classroom_name <=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLike(String value) {
            addCriterion("classroom_name like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotLike(String value) {
            addCriterion("classroom_name not like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIn(List<String> values) {
            addCriterion("classroom_name in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotIn(List<String> values) {
            addCriterion("classroom_name not in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameBetween(String value1, String value2) {
            addCriterion("classroom_name between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotBetween(String value1, String value2) {
            addCriterion("classroom_name not between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNull() {
            addCriterion("max_size is null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNotNull() {
            addCriterion("max_size is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeEqualTo(Integer value) {
            addCriterion("max_size =", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotEqualTo(Integer value) {
            addCriterion("max_size <>", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThan(Integer value) {
            addCriterion("max_size >", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_size >=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThan(Integer value) {
            addCriterion("max_size <", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThanOrEqualTo(Integer value) {
            addCriterion("max_size <=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIn(List<Integer> values) {
            addCriterion("max_size in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotIn(List<Integer> values) {
            addCriterion("max_size not in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeBetween(Integer value1, Integer value2) {
            addCriterion("max_size between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_size not between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIsNull() {
            addCriterion("is_empty is null");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIsNotNull() {
            addCriterion("is_empty is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmptyEqualTo(Integer value) {
            addCriterion("is_empty =", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotEqualTo(Integer value) {
            addCriterion("is_empty <>", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyGreaterThan(Integer value) {
            addCriterion("is_empty >", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_empty >=", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyLessThan(Integer value) {
            addCriterion("is_empty <", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyLessThanOrEqualTo(Integer value) {
            addCriterion("is_empty <=", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIn(List<Integer> values) {
            addCriterion("is_empty in", values, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotIn(List<Integer> values) {
            addCriterion("is_empty not in", values, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyBetween(Integer value1, Integer value2) {
            addCriterion("is_empty between", value1, value2, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_empty not between", value1, value2, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeIsNull() {
            addCriterion("classroom_type is null");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeIsNotNull() {
            addCriterion("classroom_type is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeEqualTo(Integer value) {
            addCriterion("classroom_type =", value, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeNotEqualTo(Integer value) {
            addCriterion("classroom_type <>", value, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeGreaterThan(Integer value) {
            addCriterion("classroom_type >", value, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_type >=", value, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeLessThan(Integer value) {
            addCriterion("classroom_type <", value, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_type <=", value, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeIn(List<Integer> values) {
            addCriterion("classroom_type in", values, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeNotIn(List<Integer> values) {
            addCriterion("classroom_type not in", values, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeBetween(Integer value1, Integer value2) {
            addCriterion("classroom_type between", value1, value2, "classroomType");
            return (Criteria) this;
        }

        public Criteria andClassroomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_type not between", value1, value2, "classroomType");
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