package com.web.model.global.security;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.web.model.global.config.CORSAuthenticationFilter;
import com.web.model.global.utils.ShiroEncryptionProperties;


@Configuration
public class ShiroConfig {

	// 下面两个方法对 注解权限起作用有很大的关系，请把这两个方法，放在配置的最上面
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
		return authorizationAttributeSourceAdvisor;

	}
	@Bean
	@ConditionalOnMissingBean
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator autoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		autoProxyCreator.setProxyTargetClass(true);
		return autoProxyCreator;
	}

	/**
	 * 创建ShiroFilterFactory
	 */
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(
			@Qualifier("securityManager") SecurityManager securityManager) {
		ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
		// 设置SecurityManager
		factoryBean.setSecurityManager(securityManager);
		//自定义过滤器
//		Map<String, Filter> filterMap = new LinkedHashMap<>();
//		filterMap.put("shiroCorsFilter", getCorsFilter());
//		//添加自定义过滤器
//		factoryBean.setFilters(filterMap);
		
		// 过滤配置，按照顺序进行过滤
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
		filterChainDefinitionMap.put("/error/*", "anon");
		filterChainDefinitionMap.put("/api/user/login", "anon");
		filterChainDefinitionMap.put("/login", "anon");
		
		/**
		 * 数据库监测系统权限
		 */
		filterChainDefinitionMap.put("/druid/**", "roles[db_admin]");
		
		filterChainDefinitionMap.put("/unauthent", "anon");
		filterChainDefinitionMap.put("/swagger-ui.html", "anon");
		filterChainDefinitionMap.put("/swagger-resources", "anon");
		filterChainDefinitionMap.put("/swagger-resources/configuration/security", "anon");
		filterChainDefinitionMap.put("/swagger-resources/configuration/ui", "anon");
		filterChainDefinitionMap.put("/v2/api-docs", "anon");
		filterChainDefinitionMap.put("/webjars/springfox-swagger-ui/**", "anon");
		filterChainDefinitionMap.put("/static/**", "anon");
//		filterChainDefinitionMap.put("/**", "shiroCorsFilter");
		filterChainDefinitionMap.put("/**", "authc");
		
		//设置未认证时跳转的登录界面url，前后端分离则不跳转页面，直接返回未认证数据
		factoryBean.setLoginUrl("/error/unauthent");
		factoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

		return factoryBean;
	}

	/**
	 * 创建SecurityManager
	 */
	@Bean(name = "securityManager")
	public SecurityManager getSecurityManager(@Qualifier("realm") MyRealm realm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm);
		return securityManager;
	}

	/**
	 * 创建Realm
	 */
	@Bean(name = "realm")
	public MyRealm getMyRealm(@Qualifier("credentialsMatcher")HashedCredentialsMatcher credentialsMatcher) {
		MyRealm myRealm = new MyRealm();
		myRealm.setCredentialsMatcher(credentialsMatcher);
		return myRealm;
	}
	/**
	 * 
	 * @Title: hashedCredentialsMatcher
	 * @Description:创建加密验证 
	 * @Author pengdehe
	 * @DateTime 2019年11月3日 上午11:22:10
	 * @return
	 */
	@Bean("credentialsMatcher")
	public HashedCredentialsMatcher hashedCredentialsMatcher() {
		RetryLimitHashedCredentialsMatcher hashedCredentialsMatcher = new RetryLimitHashedCredentialsMatcher();
		// 散列算法:这里使用MD5算法;
		hashedCredentialsMatcher.setHashAlgorithmName(ShiroEncryptionProperties.ALGORITHM_NAME);
		// 散列的次数
		hashedCredentialsMatcher.setHashIterations(ShiroEncryptionProperties.TIMES);
		// 表示是否存储散列后的密码为16进制，需要和生成密码时的一样，默认是base64；
		hashedCredentialsMatcher.setStoredCredentialsHexEncoded(false);
		return hashedCredentialsMatcher;
	}
	/**
	 * 
	 * @Title: getCorsFilter
	 * @Description:创建shiro的跨域过滤器 
	 * @Author pengdehe
	 * @DateTime 2019年11月3日 下午3:23:58
	 * @return
	 */
//	@Bean
//	public CORSAuthenticationFilter getCorsFilter() {
//		return new CORSAuthenticationFilter();
//	}

}
