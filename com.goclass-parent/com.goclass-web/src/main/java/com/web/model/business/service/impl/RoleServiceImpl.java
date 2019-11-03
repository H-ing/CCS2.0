package com.web.model.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goclass.mapper.RoleMapper;
import com.goclass.pojo.Role;
import com.web.model.business.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper roleMapper;
	@Override
	public Role queryById(Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}
}
