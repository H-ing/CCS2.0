package com.web.model.global.security;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.goclass.pojo.Role;
import com.goclass.pojo.User;
import com.web.model.business.service.RoleService;
import com.web.model.business.service.UserService;
import com.web.model.global.utils.ShiroEncryption;

@Configuration
public class MyRealm extends AuthorizingRealm {
	private static Logger logger = LoggerFactory.getLogger(MyRealm.class);

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	/**
	 * 用于认证
	 *
	 * @param authenticationToken
	 * @return
	 * @throws AuthenticationException
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		logger.info("执行认证。。。");

		// 取出登录用户账号
		String accounts = (String) authenticationToken.getPrincipal();
		//取出登录用户的密码
		char[] credentials = (char[]) authenticationToken.getCredentials();
		String password = String.valueOf(credentials);
		
		// 根据名字查询数据库得到用户实体
		User user = userService.queryByAccounts(accounts);
		// 如果查询为空就返回空 抛出org.apache.shiro.authc.UnknownAccountException
		if (null == user) {
			return null;
		}
		//验证密码是否正确
		if (null != password && !ShiroEncryption.shiroEncryption(password, user.getSalt()).equals(user.getPassword())) {
			return null;
		}
		//账户不可用，直接返回空
		if ("1".equals(user.getStatus())) {
			return null;
		}
		// 这里不知道为什么没有进行密码校验，所以上面手动做了波密码对比
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(),
				ByteSource.Util.bytes(user.getSalt()), getName());

		return info;
	}

	/**
	 * 用于授权
	 *
	 * @param principalCollection
	 * @return
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		logger.info("执行授权。。。。");
		// 取出身份信息
		User user = (User) principalCollection.getPrimaryPrincipal();

		// 查询数据库获取该用户的权限信息
		List<String> permiss = getPermiss(user.getUsername());
		// 查询用户的角色信息
		Role role = roleService.queryById(user.getRoleId());

		// 组装授权信息 没有权限抛出:org.apache.shiro.authc.IncorrectCredentialsException
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

		// 添加角色
		info.addRole(role.getRoleName());
		// 添加权限
		info.addStringPermissions(permiss);

		return info;
	}

	/**
	 * 模拟数据库查询授权信息
	 *
	 * @param username
	 * @return
	 */
	private List<String> getPermiss(String username) {
		List<String> permis = new ArrayList<String>();
		permis.add("user:create");
		permis.add("user:query");
		return permis;
	}

}
