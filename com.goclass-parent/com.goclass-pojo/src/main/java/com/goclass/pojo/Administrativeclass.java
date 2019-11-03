package com.goclass.pojo;

import java.util.Date;

public class Administrativeclass {
    private Long administrativeClassroomId;

    private String administrativeClassName;

    private String grade;

    private Integer masterId;

    private Integer classroomId;

    private Integer studentCount;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getAdministrativeClassroomId() {
        return administrativeClassroomId;
    }

    public void setAdministrativeClassroomId(Long administrativeClassroomId) {
        this.administrativeClassroomId = administrativeClassroomId;
    }

    public String getAdministrativeClassName() {
        return administrativeClassName;
    }

    public void setAdministrativeClassName(String administrativeClassName) {
        this.administrativeClassName = administrativeClassName == null ? null : administrativeClassName.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
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