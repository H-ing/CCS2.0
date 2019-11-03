package com.goclass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradesubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradesubjectExample() {
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

        public Criteria andRelationshipIdIsNull() {
            addCriterion("relationship_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIsNotNull() {
            addCriterion("relationship_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdEqualTo(Long value) {
            addCriterion("relationship_id =", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotEqualTo(Long value) {
            addCriterion("relationship_id <>", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdGreaterThan(Long value) {
            addCriterion("relationship_id >", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("relationship_id >=", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLessThan(Long value) {
            addCriterion("relationship_id <", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLessThanOrEqualTo(Long value) {
            addCriterion("relationship_id <=", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIn(List<Long> values) {
            addCriterion("relationship_id in", values, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotIn(List<Long> values) {
            addCriterion("relationship_id not in", values, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdBetween(Long value1, Long value2) {
            addCriterion("relationship_id between", value1, value2, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotBetween(Long value1, Long value2) {
            addCriterion("relationship_id not between", value1, value2, "relationshipId");
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

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountIsNull() {
            addCriterion("grade_teacher_count is null");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountIsNotNull() {
            addCriterion("grade_teacher_count is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountEqualTo(Integer value) {
            addCriterion("grade_teacher_count =", value, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountNotEqualTo(Integer value) {
            addCriterion("grade_teacher_count <>", value, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountGreaterThan(Integer value) {
            addCriterion("grade_teacher_count >", value, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_teacher_count >=", value, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountLessThan(Integer value) {
            addCriterion("grade_teacher_count <", value, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountLessThanOrEqualTo(Integer value) {
            addCriterion("grade_teacher_count <=", value, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountIn(List<Integer> values) {
            addCriterion("grade_teacher_count in", values, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountNotIn(List<Integer> values) {
            addCriterion("grade_teacher_count not in", values, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountBetween(Integer value1, Integer value2) {
            addCriterion("grade_teacher_count between", value1, value2, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andGradeTeacherCountNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_teacher_count not between", value1, value2, "gradeTeacherCount");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountIsNull() {
            addCriterion("grade_student_count is null");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountIsNotNull() {
            addCriterion("grade_student_count is not null");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountEqualTo(Integer value) {
            addCriterion("grade_student_count =", value, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountNotEqualTo(Integer value) {
            addCriterion("grade_student_count <>", value, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountGreaterThan(Integer value) {
            addCriterion("grade_student_count >", value, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_student_count >=", value, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountLessThan(Integer value) {
            addCriterion("grade_student_count <", value, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountLessThanOrEqualTo(Integer value) {
            addCriterion("grade_student_count <=", value, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountIn(List<Integer> values) {
            addCriterion("grade_student_count in", values, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountNotIn(List<Integer> values) {
            addCriterion("grade_student_count not in", values, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountBetween(Integer value1, Integer value2) {
            addCriterion("grade_student_count between", value1, value2, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andGradeStudentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_student_count not between", value1, value2, "gradeStudentCount");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekIsNull() {
            addCriterion("period_per_week is null");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekIsNotNull() {
            addCriterion("period_per_week is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekEqualTo(Integer value) {
            addCriterion("period_per_week =", value, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekNotEqualTo(Integer value) {
            addCriterion("period_per_week <>", value, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekGreaterThan(Integer value) {
            addCriterion("period_per_week >", value, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_per_week >=", value, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekLessThan(Integer value) {
            addCriterion("period_per_week <", value, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekLessThanOrEqualTo(Integer value) {
            addCriterion("period_per_week <=", value, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekIn(List<Integer> values) {
            addCriterion("period_per_week in", values, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekNotIn(List<Integer> values) {
            addCriterion("period_per_week not in", values, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekBetween(Integer value1, Integer value2) {
            addCriterion("period_per_week between", value1, value2, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andPeriodPerWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("period_per_week not between", value1, value2, "periodPerWeek");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameIsNull() {
            addCriterion("subject_master_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameIsNotNull() {
            addCriterion("subject_master_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameEqualTo(String value) {
            addCriterion("subject_master_name =", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameNotEqualTo(String value) {
            addCriterion("subject_master_name <>", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameGreaterThan(String value) {
            addCriterion("subject_master_name >", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_master_name >=", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameLessThan(String value) {
            addCriterion("subject_master_name <", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameLessThanOrEqualTo(String value) {
            addCriterion("subject_master_name <=", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameLike(String value) {
            addCriterion("subject_master_name like", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameNotLike(String value) {
            addCriterion("subject_master_name not like", value, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameIn(List<String> values) {
            addCriterion("subject_master_name in", values, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameNotIn(List<String> values) {
            addCriterion("subject_master_name not in", values, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameBetween(String value1, String value2) {
            addCriterion("subject_master_name between", value1, value2, "subjectMasterName");
            return (Criteria) this;
        }

        public Criteria andSubjectMasterNameNotBetween(String value1, String value2) {
            addCriterion("subject_master_name not between", value1, value2, "subjectMasterName");
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