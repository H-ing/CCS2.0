package com.goclass.pojo;

public class Teaclass {
    private Long teaclassId;

    private Integer subjectNum;

    private String teaclassName;

    public Long getTeaclassId() {
        return teaclassId;
    }

    public void setTeaclassId(Long teaclassId) {
        this.teaclassId = teaclassId;
    }

    public Integer getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(Integer subjectNum) {
        this.subjectNum = subjectNum;
    }

    public String getTeaclassName() {
        return teaclassName;
    }

    public void setTeaclassName(String teaclassName) {
        this.teaclassName = teaclassName == null ? null : teaclassName.trim();
    }
}