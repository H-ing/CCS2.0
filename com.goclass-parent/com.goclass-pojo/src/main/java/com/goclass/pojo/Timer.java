package com.goclass.pojo;

import java.util.Date;

public class Timer {
    private Long timerId;

    private Integer timerNum;

    private String timerSchedul;

    private String name;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getTimerId() {
        return timerId;
    }

    public void setTimerId(Long timerId) {
        this.timerId = timerId;
    }

    public Integer getTimerNum() {
        return timerNum;
    }

    public void setTimerNum(Integer timerNum) {
        this.timerNum = timerNum;
    }

    public String getTimerSchedul() {
        return timerSchedul;
    }

    public void setTimerSchedul(String timerSchedul) {
        this.timerSchedul = timerSchedul == null ? null : timerSchedul.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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