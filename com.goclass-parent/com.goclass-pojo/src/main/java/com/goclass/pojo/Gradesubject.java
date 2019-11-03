package com.goclass.pojo;

import java.util.Date;

public class Gradesubject {
    private Long relationshipId;

    private Integer gradeId;

    private Integer gradeTeacherCount;

    private Integer courseId;

    private String courseName;

    private Integer gradeStudentCount;

    private Integer periodPerWeek;

    private String subjectMasterName;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(Long relationshipId) {
        this.relationshipId = relationshipId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getGradeTeacherCount() {
        return gradeTeacherCount;
    }

    public void setGradeTeacherCount(Integer gradeTeacherCount) {
        this.gradeTeacherCount = gradeTeacherCount;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getGradeStudentCount() {
        return gradeStudentCount;
    }

    public void setGradeStudentCount(Integer gradeStudentCount) {
        this.gradeStudentCount = gradeStudentCount;
    }

    public Integer getPeriodPerWeek() {
        return periodPerWeek;
    }

    public void setPeriodPerWeek(Integer periodPerWeek) {
        this.periodPerWeek = periodPerWeek;
    }

    public String getSubjectMasterName() {
        return subjectMasterName;
    }

    public void setSubjectMasterName(String subjectMasterName) {
        this.subjectMasterName = subjectMasterName == null ? null : subjectMasterName.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}