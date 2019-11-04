package com.web.model.business.service;

import java.util.List;

import com.goclass.pojo.Role;

public interface RoleService {
	public Role queryOneById(Integer id);

	public List<Role> queryAllById(Integer id);
}
