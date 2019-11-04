package com.web.model.business.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goclass.mapper.UserMapper;
import com.goclass.pojo.Role;
import com.goclass.pojo.User;
import com.goclass.pojo.UserExample;
import com.goclass.pojo.UserExample.Criteria;
import com.web.model.business.service.RoleService;
import com.web.model.business.service.UserService;
import com.web.model.global.entity.LoginUser;
import com.web.model.global.utils.ShiroEncryption;

@Service
public class UserServiceImpl implements UserService {
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleService roleService;

	@Override
	public User queryByAccounts(String accounts) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountsEqualTo(accounts);
		/**
		 * 此处查询可以优化，修改mybatis逆向工程中的UserExample文件，为其添加limt分页属性， 仅查询一条记录，提高性能
		 */
		List<User> list = userMapper.selectByExample(example);
		return list == null ? null : list.get(0);
	}

	@Override
	public void add(User user) {
		String salt = ShiroEncryption.getSalt();
		user.setSalt(salt);
		user.setPassword(ShiroEncryption.shiroEncryption(user.getPassword(), salt));
		user.setGmtCreate(new Date());
		user.setGmtModified(new Date());
		userMapper.insert(user);
	}
	
	@Override
	public LoginUser login(UsernamePasswordToken token) {
		Subject subject = SecurityUtils.getSubject();
		// 开始认证，认证失败将会抛出异常，重定向到错误处理页
		subject.login(token);
		logger.info(",登录成功。。。" +subject.getSession(true).getId());
		
		// 未抛出异常，则认证通过，进行结果输出
		PrincipalCollection principals = subject.getPrincipals();
		User user = (User) principals.getPrimaryPrincipal();
		LoginUser loginUser = new LoginUser();
		loginUser.setLoginDate(new Date());
		
		Role role = roleService.queryOneById(user.getRoleId());
		loginUser.setRoleName(role.getRoleName());
		loginUser.setStatus(user.getStatus());
		loginUser.setUserId(user.getUserId());
		loginUser.setUsername(user.getUsername());
		loginUser.setAccounts(user.getAccounts());
		return loginUser;
	}

	@Override
	public User queryUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
