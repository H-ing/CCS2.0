package com.web.model.business.controller;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.pojo.User;
import com.web.model.business.service.UserService;
import com.web.model.global.entity.GlobalResult;
import com.web.model.global.entity.LoginUser;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public GlobalResult login(String accounts, String password) {
		UsernamePasswordToken token = new UsernamePasswordToken(accounts, password);
		LoginUser loginUser = userService.login(token);
		return GlobalResult.successResult(loginUser);
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void add(User user) {
		userService.add(user);
	}
	
	@RequiresRoles("db_admina")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User queryUserById(@PathVariable("id")Long id) {
		return userService.queryUserById(id);
	}
}
