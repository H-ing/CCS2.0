package com.web.model.business.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goclass.mapper.ClassroomMapper;
import com.goclass.pojo.Classroom;
import com.web.model.business.service.ClassroomService;

/**
 * 教室管理接口实现
 * @author Administrator
 *
 */
@Service
public class ClassroomServiceImpl implements ClassroomService{
	
	@Autowired
	private ClassroomMapper classroomMapper;

	/**
	 * 添加教室信息
	 */
	@Override
	public void add(Classroom classroom) {
		/**
		 * 教室是否留空，默认不留空,1表示不留空，0表示留空
		 */
		classroom.setIsEmpty(classroom.getIsEmpty() == null ? 1 : classroom.getIsEmpty());
		classroom.setGmtCreate(new Date());
		classroom.setGmtModified(new Date());
		classroomMapper.insert(classroom);
	}

	@Override
	public List<Classroom> queryAll() {
		return classroomMapper.selectByExample(null);
	}

	@Override
	public Classroom queryById(Long id) {
		return classroomMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delById(Long id) {
		classroomMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void delByIds(Long[] ids) {
		for (Long id : ids) {
			classroomMapper.deleteByPrimaryKey(id);
		}
	}

}
