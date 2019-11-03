package com.goclass.pojo;

import java.util.Date;

public class Selectiondetailed {
    private Long selectionDetailedId;

    private Integer studentId;

    private Integer courseCombinationId;

    private String courseCombinationName;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getSelectionDetailedId() {
        return selectionDetailedId;
    }

    public void setSelectionDetailedId(Long selectionDetailedId) {
        this.selectionDetailedId = selectionDetailedId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseCombinationId() {
        return courseCombinationId;
    }

    public void setCourseCombinationId(Integer courseCombinationId) {
        this.courseCombinationId = courseCombinationId;
    }

    public String getCourseCombinationName() {
        return courseCombinationName;
    }

    public void setCourseCombinationName(String courseCombinationName) {
        this.courseCombinationName = courseCombinationName == null ? null : courseCombinationName.trim();
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