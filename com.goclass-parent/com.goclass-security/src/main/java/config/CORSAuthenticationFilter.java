package config;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

import entity.Result;

/**
 * 
 * @ClassName: CORSAuthenticationFilter
 * @Description: options请求过滤器，解决302问题，跨域会先发起options请求，如果不配置该过滤器将导致跨域配置失效
 * @Author pengdehe
 * @DateTime 2019年10月27日 下午6:17:41
 */
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
        if(request instanceof HttpServletRequest){
            if (((HttpServletRequest) request).getMethod().toUpperCase().equals("OPTIONS")){
                System.out.println("OPTIONS请求");
                return true;
            }
        }
        return super.isAccessAllowed(request, response, mappedValue);
    }
 
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
    	logger.info("into......");
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setStatus(HttpServletResponse.SC_OK);
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=utf-8");
        PrintWriter writer = res.getWriter();
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", Result.NOTLOGIN.getCode());
        map.put("msg", Result.NOTLOGIN.getMsg());
        writer.write(JSON.toJSONString(map));
        writer.close();
        return false;
    }
}

