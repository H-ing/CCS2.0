package com.goclass.pojo;

import java.util.Date;

public class Timetablerule {
    private Long timetableRuleId;

    private String timetableRule;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getTimetableRuleId() {
        return timetableRuleId;
    }

    public void setTimetableRuleId(Long timetableRuleId) {
        this.timetableRuleId = timetableRuleId;
    }

    public String getTimetableRule() {
        return timetableRule;
    }

    public void setTimetableRule(String timetableRule) {
        this.timetableRule = timetableRule == null ? null : timetableRule.trim();
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