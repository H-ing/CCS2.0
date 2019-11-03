package com.web.model.business.service;

import org.apache.shiro.authc.UsernamePasswordToken;

import com.goclass.pojo.User;
import com.web.model.global.entity.LoginUser;

public interface UserService {
	public User queryByAccounts(String accounts);
	
	public void add(User user);
	
	public LoginUser login(UsernamePasswordToken token);

	public User queryUserById(Long id);
}
