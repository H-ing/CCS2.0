package com.web.model.business.service;

import java.util.List;

import com.goclass.pojo.Teacherswill;
import com.web.model.global.entity.TeacherWillTime;

public interface TeacherService {
	public void addTimeWill(TeacherWillTime teacherWillTime);
	
	public List<Teacherswill> queryAllTimeWill();
	
	public Teacherswill queryTimeWillByWillId(Long willId);
	
	public void isAcceptTeacherTimeWill(Long willId, Integer accept);
}
