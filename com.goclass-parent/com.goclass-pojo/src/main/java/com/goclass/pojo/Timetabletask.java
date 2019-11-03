package com.goclass.pojo;

import java.util.Date;

public class Timetabletask {
    private Long timetableTaskId;

    private String timetableTaskName;

    private String timetableTaskRuleid;

    private Integer timetableTaskStatus;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getTimetableTaskId() {
        return timetableTaskId;
    }

    public void setTimetableTaskId(Long timetableTaskId) {
        this.timetableTaskId = timetableTaskId;
    }

    public String getTimetableTaskName() {
        return timetableTaskName;
    }

    public void setTimetableTaskName(String timetableTaskName) {
        this.timetableTaskName = timetableTaskName == null ? null : timetableTaskName.trim();
    }

    public String getTimetableTaskRuleid() {
        return timetableTaskRuleid;
    }

    public void setTimetableTaskRuleid(String timetableTaskRuleid) {
        this.timetableTaskRuleid = timetableTaskRuleid == null ? null : timetableTaskRuleid.trim();
    }

    public Integer getTimetableTaskStatus() {
        return timetableTaskStatus;
    }

    public void setTimetableTaskStatus(Integer timetableTaskStatus) {
        this.timetableTaskStatus = timetableTaskStatus;
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