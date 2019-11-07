package com.web.model.global.mvc;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

public class MyCorsFilter extends CorsFilter {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyCorsFilter.class);

	public MyCorsFilter(CorsConfigurationSource configSource) {
		super(configSource);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		log.info("跨域过滤器开启。。。。");
		log.info("支持cookie携带身份验证。。。。");
		response.setHeader("Access-Control-Allow-Credentials", "true");// 标识允许ajax携带cookie认证信息
		log.info("允许的origin：" + request.getHeader("Origin"));
		response.setHeader("Access-control-Allow-Origin", request.getHeader("Origin")); // 标识允许哪个域到请求，直接修改成请求头的域
		response.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");// 标识允许的请求方法
		log.info("允许的method：*");
		// 响应首部 Access-Control-Allow-Headers 用于 preflight request （预检请求）中，列出了将会在正式请求的
		// Access-Control-Expose-Headers 字段中出现的首部信息。修改为请求首部
		response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
		
		
		
		super.doFilterInternal(request, response, filterChain);
	}

}
