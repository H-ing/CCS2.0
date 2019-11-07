package com.web.model.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.pojo.User;
import com.web.model.business.service.UserService;
import com.web.model.global.entity.GlobalResult;
import com.web.model.global.entity.LoginParam;
import com.web.model.global.entity.LoginUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user")
@Api(tags = {"用户管理"})
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "用户登录")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public GlobalResult login(@RequestBody LoginParam loginParam) {
		String accounts = loginParam.getAccounts();
		String password = loginParam.getPassword();
		log.info("accounts:" + accounts + " ,password:" + password);
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
