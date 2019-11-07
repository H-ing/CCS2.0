package com.web.model.global;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * 
 * @ClassName: CORSAuthenticationFilter
 * @Description: options请求过滤器，解决302问题，跨域会先发起options请求，如果不配置该过滤器将导致跨域配置失效
 * @Author pengdehe
 * @DateTime 2019年10月27日 下午6:17:41
 */
@Order(0)
public class CORSAuthenticationFilter extends FormAuthenticationFilter {
	private static final Logger logger = LoggerFactory.getLogger(CORSAuthenticationFilter.class);
    public CORSAuthenticationFilter() {
        super();
    }
    
    /**
     * 对options请求直接放行，对非options请求走流程
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
    	HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin")); //标识允许哪个域到请求，直接修改成请求头的域
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");//标识允许的请求方法
        // 响应首部 Access-Control-Allow-Headers 用于 preflight request （预检请求）中，列出了将会在正式请求的 Access-Control-Expose-Headers 字段中出现的首部信息。修改为请求首部
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
        //给option请求直接返回正常状态
        System.out.println("shiro into....." + httpServletRequest.getHeader("Origin"));
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
        	httpServletResponse.setStatus(HttpStatus.OK.value());
            return true;
        }
        logger.info(((HttpServletRequest) request).getMethod());
        return super.isAccessAllowed(request, response, mappedValue);
    }
 
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
    	logger.info("into......");
//        HttpServletResponse res = (HttpServletResponse) response;
//        res.setHeader("Access-Control-Allow-Origin", "*");
//        res.setStatus(HttpServletResponse.SC_OK);
//        res.setCharacterEncoding("UTF-8");
//        res.setContentType("text/html; charset=utf-8");
//        PrintWriter writer = res.getWriter();
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("code", Result.NOTLOGIN.getCode());
//        map.put("msg", Result.NOTLOGIN.getMsg());
//        writer.write(JSON.toJSONString(map));
//        writer.close();
        return super.onAccessDenied(request, response);
    }
}

