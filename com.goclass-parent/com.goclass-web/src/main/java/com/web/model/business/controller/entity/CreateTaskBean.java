package com.web.model.business.controller.entity;

import java.util.List;

public class CreateTaskBean {
	private int taskName;
	private String grade;
	private int[] subjectTeacherNumber;
	private int[] sectionStudentNumber;
	private List<Integer> maxAndMinClassStudentNumber;
	private int runingTime=50;
	
	public int getRuningTime() {
		return runingTime;
	}
	public void setRuningTime(int runingTime) {
		this.runingTime = runingTime;
	}
	public int getTaskName() {
		return taskName;
	}
	public void setTaskName(int taskName) {
		this.taskName = taskName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int[] getSubjectTeacherNumber() {
		return subjectTeacherNumber;
	}
	public void setSubjectTeacherNumber(int[] subjectTeacherNumber) {
		this.subjectTeacherNumber = subjectTeacherNumber;
	}
	public int[] getSectionStudentNumber() {
		return sectionStudentNumber;
	}
	public void setSectionStudentNumber(int[] sectionStudentNumber) {
		this.sectionStudentNumber = sectionStudentNumber;
	}
	public List<Integer> getMaxAndMinClassStudentNumber() {
		return maxAndMinClassStudentNumber;
	}
	public void setMaxAndMinClassStudentNumber(List<Integer> maxAndMinClassStudentNumber) {
		this.maxAndMinClassStudentNumber = maxAndMinClassStudentNumber;
	}
	
	

}
