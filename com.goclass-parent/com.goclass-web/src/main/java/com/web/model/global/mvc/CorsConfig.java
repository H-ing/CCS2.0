package com.web.model.global.mvc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * 
 * @ClassName: CorsConfig
 * @Description:ajax跨域配置 
 * @Author pengdehe
 * @DateTime 2019年11月7日 下午8:30:38
 */
@Configuration
public class CorsConfig {
	/**
	 * 允许ajax携带cookie的请求域
	 */
//	private static final String AJAX_ORIGIN = "http://lede.dalaomai.cn:5005";
//	
//	private CorsConfiguration buildConfig() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true); //1、允许ajax携带cookie身份验证信息，并解析相应字段AllowCredentials
//        corsConfiguration.addAllowedOrigin(AJAX_ORIGIN); //执行第1步后，此处不能设置*，选哟设置为request中的Origin
//        corsConfiguration.addAllowedHeader("*"); // 允许所有请求头
//        corsConfiguration.addAllowedMethod("*"); // 允许所有方法
//        return corsConfiguration;
//    }

	/**
	 * 
	 * @Title: corsFilter
	 * @Description:注入跨域配置bean 
	 * @Author pengdehe
	 * @DateTime 2019年11月7日 下午8:30:21
	 * @param request
	 * @param response
	 * @return
	 */
    @Bean
    public MyCorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", new CorsConfiguration()); // 所有url都经过此filter
        return new MyCorsFilter(source);
    }
}