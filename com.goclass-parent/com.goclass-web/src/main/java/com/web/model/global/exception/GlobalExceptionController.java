package com.web.model.global.exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * 
 * @ClassName: GlobalExceptionController
 * @Description: 认证授权异常处理
 * @Author pengdehe
 * @DateTime 2019年11月2日 下午3:38:23
 */
@RestController
@RequestMapping("/error")
@Api(tags = "全局异常结果")
public class GlobalExceptionController {
	
	@RequestMapping(value = "/unauthent", method = RequestMethod.GET)
	public GlobalException unauthent() {
		return new GlobalException("-1", "未登录，请先登录！", null);
	}
	
	@RequestMapping(value = "/e401", method = RequestMethod.GET)
	public GlobalException e401() {
		return new GlobalException("401", "登录失败，账户或密码异常", null);
	}
	
	@RequestMapping(value = "/e403", method = RequestMethod.GET)
	public GlobalException e403() {
		return new GlobalException("403", "未授权！无法访问", null);
	}
	@RequestMapping(value = "/e404", method = RequestMethod.GET)
	public GlobalException e404() {
		return new GlobalException("404", "你访问的资源不存在", null);
	}
	@RequestMapping(value = "/e500", method = RequestMethod.GET)
	public GlobalException e500() {
		return new GlobalException("500", "访问出错，无法访问", null);
	}

}
