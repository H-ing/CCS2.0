package com.web.model.business.service;

import java.util.List;

import com.goclass.pojo.Subject;

/**
 * 课程信息管理接口
 * @author Administrator
 *
 */
public interface SubjectService {
	public void add(Subject subject);
	
	public List<Subject> queryAll();
	
	public Subject queryById(Long id);
	
	public void delById(Long id);
	
	public void delByIds(Long[] ids);
}