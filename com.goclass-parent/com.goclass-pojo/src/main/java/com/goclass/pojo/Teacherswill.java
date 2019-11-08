package com.goclass.pojo;

import java.util.Date;

public class Teacherswill {
    private Long teachersWillId;

    private Long teacherId;

    private String teacherName;

    private String timeItems;

    private String statue;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getTeachersWillId() {
        return teachersWillId;
    }

    public void setTeachersWillId(Long teachersWillId) {
        this.teachersWillId = teachersWillId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTimeItems() {
        return timeItems;
    }

    public void setTimeItems(String timeItems) {
        this.timeItems = timeItems == null ? null : timeItems.trim();
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue == null ? null : statue.trim();
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