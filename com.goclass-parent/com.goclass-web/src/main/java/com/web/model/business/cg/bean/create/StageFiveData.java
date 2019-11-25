package com.web.model.business.cg.bean.create;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class StageFiveData implements Serializable{
	Map<String, Integer> subjectDict;
	List<Map<Integer, List<Integer>>> adminclassList;
	List<Map<Integer, List<Integer>>> teachingclassList;
	List<List<Integer>> mixteachingclassList;
	List<Map<Integer, Integer>> teachingclassIndexList;
	List<List<Integer>> adminclassMixteachingclassList;
	List<List<Integer>> mixteachingclassAdminclassesList;
	public Map<String, Integer> getSubjectDict() {
		return subjectDict;
	}
	public void setSubjectDict(Map<String, Integer> subjectDict) {
		this.subjectDict = subjectDict;
	}
	public List<Map<Integer, List<Integer>>> getAdminclassList() {
		return adminclassList;
	}
	public void setAdminclassList(List<Map<Integer, List<Integer>>> adminclassList) {
		this.adminclassList = adminclassList;
	}
	public List<Map<Integer, List<Integer>>> getTeachingclassList() {
		return teachingclassList;
	}
	public void setTeachingclassList(List<Map<Integer, List<Integer>>> teachingclassList) {
		this.teachingclassList = teachingclassList;
	}
	public List<List<Integer>> getMixteachingclassList() {
		return mixteachingclassList;
	}
	public void setMixteachingclassList(List<List<Integer>> mixteachingclassList) {
		this.mixteachingclassList = mixteachingclassList;
	}
	public List<Map<Integer, Integer>> getTeachingclassIndexList() {
		return teachingclassIndexList;
	}
	public void setTeachingclassIndexList(List<Map<Integer, Integer>> teachingclassIndexList) {
		this.teachingclassIndexList = teachingclassIndexList;
	}
	public List<List<Integer>> getAdminclassMixteachingclassList() {
		return adminclassMixteachingclassList;
	}
	public void setAdminclassMixteachingclassList(List<List<Integer>> adminclassMixteachingclassList) {
		this.adminclassMixteachingclassList = adminclassMixteachingclassList;
	}
	public List<List<Integer>> getMixteachingclassAdminclassesList() {
		return mixteachingclassAdminclassesList;
	}
	public void setMixteachingclassAdminclassesList(List<List<Integer>> mixteachingclassAdminclassesList) {
		this.mixteachingclassAdminclassesList = mixteachingclassAdminclassesList;
	}
	
}