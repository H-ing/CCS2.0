package com.web.model.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goclass.mapper.SubjectMapper;
import com.goclass.pojo.Subject;
import com.web.model.business.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	private SubjectMapper subjectMapper;

	@Override
	public void add(Subject subject) {
		subjectMapper.insert(subject);
	}

	@Override
	public List<Subject> queryAll() {
		return subjectMapper.selectByExample(null);
	}

	@Override
	public Subject queryById(Long id) {
		// TODO Auto-generated method stub
		return subjectMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delById(Long id) {
		subjectMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void delByIds(Long[] ids) {
		for (Long id : ids) {
			subjectMapper.deleteByPrimaryKey(id);
		}
	}

}
