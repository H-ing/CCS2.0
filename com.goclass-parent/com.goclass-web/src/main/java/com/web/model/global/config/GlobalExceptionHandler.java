package com.web.model.global.config;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 
 * @ClassName: GlobalExceptionHandler
 * @Description:统一异常处理配置 
 * @Author pengdehe
 * @DateTime 2019年11月2日 下午3:20:10
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
 
	/**
	 * 
	 * @Title: unAuthorizationException
	 * @Description: 统一的未授权异常处理
	 * @Author pengdehe
	 * @DateTime 2019年11月2日 下午3:15:36
	 * @param request
	 * @param response
	 * @throws Exception
	 */
    @ExceptionHandler(value = AuthorizationException.class)
    public void unAuthorizationException(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	logger.info("没有权限！");
        response.sendRedirect("/error/e403");
    }
    /**
     * 
     * @Title: unAuthenticationException
     * @Description: 统一认证失败异常处理
     * @Author pengdehe
     * @DateTime 2019年11月2日 下午3:29:02
     * @param request
     * @param response
     * @throws Exception
     */
    @ExceptionHandler(value = AuthenticationException.class)
    public void unAuthenticationException(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	logger.info("认证失败！");
    	response.sendRedirect("/error/e401");
    }
    
    /**
     * 
     * @ClassName: MyErrorController
     * @Description: 处理404和500异常
     * @Author pengdehe
     * @DateTime 2019年11月2日 下午3:55:30
     */
    @Controller
    public class MyErrorController implements ErrorController {
    	/**
    	 * 
    	 * @Title: handleError
    	 * @Description:先接收判断statusCode，然后进行转发 
    	 * @Author pengdehe
    	 * @DateTime 2019年11月2日 下午3:58:55
    	 * @param request
    	 * @param response
    	 * @throws Exception
    	 */
        @RequestMapping("/error")
        public void handleError(HttpServletRequest request, HttpServletResponse response) throws Exception{
            //获取statusCode:404,500
            Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
            if(statusCode == 500){
            	response.sendRedirect("/error/e500");
            }else if(statusCode == 404){
            	response.sendRedirect("/error/e404");
            }
        }
        /**
         * 设置默认的错误处理url
         */
        @Override
        public String getErrorPath() {
            return "/error";
        }
    }
}
