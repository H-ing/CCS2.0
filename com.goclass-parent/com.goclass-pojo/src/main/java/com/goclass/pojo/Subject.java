package com.goclass.pojo;

import java.util.Date;

public class Subject {
    private Long subjectId;

    private String subjectName;

    private String subjectMinName;

    private Integer subjectNumber;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getSubjectMinName() {
        return subjectMinName;
    }

    public void setSubjectMinName(String subjectMinName) {
        this.subjectMinName = subjectMinName == null ? null : subjectMinName.trim();
    }

    public Integer getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(Integer subjectNumber) {
        this.subjectNumber = subjectNumber;
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