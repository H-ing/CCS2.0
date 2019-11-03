package com.goclass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectclassExample() {
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

        public Criteria andSubjectClassroomIdIsNull() {
            addCriterion("subject_classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdIsNotNull() {
            addCriterion("subject_classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdEqualTo(Long value) {
            addCriterion("subject_classroom_id =", value, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdNotEqualTo(Long value) {
            addCriterion("subject_classroom_id <>", value, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdGreaterThan(Long value) {
            addCriterion("subject_classroom_id >", value, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("subject_classroom_id >=", value, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdLessThan(Long value) {
            addCriterion("subject_classroom_id <", value, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdLessThanOrEqualTo(Long value) {
            addCriterion("subject_classroom_id <=", value, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdIn(List<Long> values) {
            addCriterion("subject_classroom_id in", values, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdNotIn(List<Long> values) {
            addCriterion("subject_classroom_id not in", values, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdBetween(Long value1, Long value2) {
            addCriterion("subject_classroom_id between", value1, value2, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassroomIdNotBetween(Long value1, Long value2) {
            addCriterion("subject_classroom_id not between", value1, value2, "subjectClassroomId");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameIsNull() {
            addCriterion("subject_class_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameIsNotNull() {
            addCriterion("subject_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameEqualTo(String value) {
            addCriterion("subject_class_name =", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameNotEqualTo(String value) {
            addCriterion("subject_class_name <>", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameGreaterThan(String value) {
            addCriterion("subject_class_name >", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_class_name >=", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameLessThan(String value) {
            addCriterion("subject_class_name <", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameLessThanOrEqualTo(String value) {
            addCriterion("subject_class_name <=", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameLike(String value) {
            addCriterion("subject_class_name like", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameNotLike(String value) {
            addCriterion("subject_class_name not like", value, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameIn(List<String> values) {
            addCriterion("subject_class_name in", values, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameNotIn(List<String> values) {
            addCriterion("subject_class_name not in", values, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameBetween(String value1, String value2) {
            addCriterion("subject_class_name between", value1, value2, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andSubjectClassNameNotBetween(String value1, String value2) {
            addCriterion("subject_class_name not between", value1, value2, "subjectClassName");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("grade_id like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("grade_id not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountIsNull() {
            addCriterion("subject_student_count is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountIsNotNull() {
            addCriterion("subject_student_count is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountEqualTo(Integer value) {
            addCriterion("subject_student_count =", value, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountNotEqualTo(Integer value) {
            addCriterion("subject_student_count <>", value, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountGreaterThan(Integer value) {
            addCriterion("subject_student_count >", value, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_student_count >=", value, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountLessThan(Integer value) {
            addCriterion("subject_student_count <", value, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountLessThanOrEqualTo(Integer value) {
            addCriterion("subject_student_count <=", value, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountIn(List<Integer> values) {
            addCriterion("subject_student_count in", values, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountNotIn(List<Integer> values) {
            addCriterion("subject_student_count not in", values, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountBetween(Integer value1, Integer value2) {
            addCriterion("subject_student_count between", value1, value2, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectStudentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_student_count not between", value1, value2, "subjectStudentCount");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameIsNull() {
            addCriterion("subject_teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameIsNotNull() {
            addCriterion("subject_teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameEqualTo(String value) {
            addCriterion("subject_teacher_name =", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameNotEqualTo(String value) {
            addCriterion("subject_teacher_name <>", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameGreaterThan(String value) {
            addCriterion("subject_teacher_name >", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_teacher_name >=", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameLessThan(String value) {
            addCriterion("subject_teacher_name <", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("subject_teacher_name <=", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameLike(String value) {
            addCriterion("subject_teacher_name like", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameNotLike(String value) {
            addCriterion("subject_teacher_name not like", value, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameIn(List<String> values) {
            addCriterion("subject_teacher_name in", values, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameNotIn(List<String> values) {
            addCriterion("subject_teacher_name not in", values, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameBetween(String value1, String value2) {
            addCriterion("subject_teacher_name between", value1, value2, "subjectTeacherName");
            return (Criteria) this;
        }

        public Criteria andSubjectTeacherNameNotBetween(String value1, String value2) {
            addCriterion("subject_teacher_name not between", value1, value2, "subjectTeacherName");
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