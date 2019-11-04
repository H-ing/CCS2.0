package com.web.model.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goclass.mapper.RoleMapper;
import com.goclass.pojo.Role;
import com.goclass.pojo.RoleExample;
import com.goclass.pojo.RoleExample.Criteria;
import com.web.model.business.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper roleMapper;
	@Override
	public Role queryOneById(Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Role> queryAllById(Integer id) {
		RoleExample example = new RoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdLessThanOrEqualTo(id);
		return roleMapper.selectByExample(example);
	}
}
