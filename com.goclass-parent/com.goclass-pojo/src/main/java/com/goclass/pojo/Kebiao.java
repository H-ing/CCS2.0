package com.goclass.pojo;

public class Kebiao {
    private Long schedulId;

    private Long adminId;

    private String schedul;

    public Long getSchedulId() {
        return schedulId;
    }

    public void setSchedulId(Long schedulId) {
        this.schedulId = schedulId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getSchedul() {
        return schedul;
    }

    public void setSchedul(String schedul) {
        this.schedul = schedul == null ? null : schedul.trim();
    }
}