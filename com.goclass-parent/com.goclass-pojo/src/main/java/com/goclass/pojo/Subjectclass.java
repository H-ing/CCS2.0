package com.goclass.pojo;

import java.util.Date;

public class Subjectclass {
    private Long subjectClassroomId;

    private String subjectClassName;

    private String gradeId;

    private Integer groupId;

    private Integer subjectId;

    private Integer subjectStudentCount;

    private String subjectTeacherName;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getSubjectClassroomId() {
        return subjectClassroomId;
    }

    public void setSubjectClassroomId(Long subjectClassroomId) {
        this.subjectClassroomId = subjectClassroomId;
    }

    public String getSubjectClassName() {
        return subjectClassName;
    }

    public void setSubjectClassName(String subjectClassName) {
        this.subjectClassName = subjectClassName == null ? null : subjectClassName.trim();
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSubjectStudentCount() {
        return subjectStudentCount;
    }

    public void setSubjectStudentCount(Integer subjectStudentCount) {
        this.subjectStudentCount = subjectStudentCount;
    }

    public String getSubjectTeacherName() {
        return subjectTeacherName;
    }

    public void setSubjectTeacherName(String subjectTeacherName) {
        this.subjectTeacherName = subjectTeacherName == null ? null : subjectTeacherName.trim();
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