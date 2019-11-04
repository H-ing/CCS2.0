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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user")
@Api(tags = {"用户管理"})
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "用户登录")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public GlobalResult login(String accounts, String password) {
		UsernamePasswordToken token = new UsernamePasswordToken(accounts, password);
		LoginUser loginUser = userService.login(token);
		return GlobalResult.successResult(loginUser);
	}
	
	
	@ApiOperation(value = "添加用户")
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void add(User user) {
		userService.add(user);
	}
	
	@ApiOperation(value = "查找用户")
	@RequiresRoles("db_admin")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User queryUserById(@PathVariable("id")Long id) {
		return userService.queryUserById(id);
	}
}
