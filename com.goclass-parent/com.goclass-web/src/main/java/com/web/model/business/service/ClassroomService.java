package com.web.model.business.service;

import java.util.List;

import com.goclass.pojo.Classroom;
/**
 * 教室管理接口
 * @author Administrator
 *
 */
public interface ClassroomService {
	public void add(Classroom classroom);
	
	public List<Classroom> queryAll();
	
	public Classroom queryById(Long id);
	
	public void delById(Long id);
	
	public void delByIds(Long[] ids);
	
	public List<Long> queryAllId();
}

