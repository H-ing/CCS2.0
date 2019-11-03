package com.goclass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdministrativeclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministrativeclassExample() {
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

        public Criteria andAdministrativeClassroomIdIsNull() {
            addCriterion("administrative_classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdIsNotNull() {
            addCriterion("administrative_classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdEqualTo(Long value) {
            addCriterion("administrative_classroom_id =", value, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdNotEqualTo(Long value) {
            addCriterion("administrative_classroom_id <>", value, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdGreaterThan(Long value) {
            addCriterion("administrative_classroom_id >", value, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("administrative_classroom_id >=", value, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdLessThan(Long value) {
            addCriterion("administrative_classroom_id <", value, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdLessThanOrEqualTo(Long value) {
            addCriterion("administrative_classroom_id <=", value, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdIn(List<Long> values) {
            addCriterion("administrative_classroom_id in", values, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdNotIn(List<Long> values) {
            addCriterion("administrative_classroom_id not in", values, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdBetween(Long value1, Long value2) {
            addCriterion("administrative_classroom_id between", value1, value2, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassroomIdNotBetween(Long value1, Long value2) {
            addCriterion("administrative_classroom_id not between", value1, value2, "administrativeClassroomId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameIsNull() {
            addCriterion("administrative_class_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameIsNotNull() {
            addCriterion("administrative_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameEqualTo(String value) {
            addCriterion("administrative_class_name =", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameNotEqualTo(String value) {
            addCriterion("administrative_class_name <>", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameGreaterThan(String value) {
            addCriterion("administrative_class_name >", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_class_name >=", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameLessThan(String value) {
            addCriterion("administrative_class_name <", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameLessThanOrEqualTo(String value) {
            addCriterion("administrative_class_name <=", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameLike(String value) {
            addCriterion("administrative_class_name like", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameNotLike(String value) {
            addCriterion("administrative_class_name not like", value, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameIn(List<String> values) {
            addCriterion("administrative_class_name in", values, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameNotIn(List<String> values) {
            addCriterion("administrative_class_name not in", values, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameBetween(String value1, String value2) {
            addCriterion("administrative_class_name between", value1, value2, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeClassNameNotBetween(String value1, String value2) {
            addCriterion("administrative_class_name not between", value1, value2, "administrativeClassName");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andMasterIdIsNull() {
            addCriterion("master_id is null");
            return (Criteria) this;
        }

        public Criteria andMasterIdIsNotNull() {
            addCriterion("master_id is not null");
            return (Criteria) this;
        }

        public Criteria andMasterIdEqualTo(Integer value) {
            addCriterion("master_id =", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdNotEqualTo(Integer value) {
            addCriterion("master_id <>", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdGreaterThan(Integer value) {
            addCriterion("master_id >", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("master_id >=", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdLessThan(Integer value) {
            addCriterion("master_id <", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdLessThanOrEqualTo(Integer value) {
            addCriterion("master_id <=", value, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdIn(List<Integer> values) {
            addCriterion("master_id in", values, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdNotIn(List<Integer> values) {
            addCriterion("master_id not in", values, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdBetween(Integer value1, Integer value2) {
            addCriterion("master_id between", value1, value2, "masterId");
            return (Criteria) this;
        }

        public Criteria andMasterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("master_id not between", value1, value2, "masterId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Integer value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Integer value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Integer value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Integer value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Integer> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Integer> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Integer value1, Integer value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andStudentCountIsNull() {
            addCriterion("student_count is null");
            return (Criteria) this;
        }

        public Criteria andStudentCountIsNotNull() {
            addCriterion("student_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCountEqualTo(Integer value) {
            addCriterion("student_count =", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotEqualTo(Integer value) {
            addCriterion("student_count <>", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountGreaterThan(Integer value) {
            addCriterion("student_count >", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_count >=", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountLessThan(Integer value) {
            addCriterion("student_count <", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountLessThanOrEqualTo(Integer value) {
            addCriterion("student_count <=", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountIn(List<Integer> values) {
            addCriterion("student_count in", values, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotIn(List<Integer> values) {
            addCriterion("student_count not in", values, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountBetween(Integer value1, Integer value2) {
            addCriterion("student_count between", value1, value2, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("student_count not between", value1, value2, "studentCount");
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