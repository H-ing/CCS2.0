package com.web.model.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerAutoConfiguration{
 
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.web"))
                .paths(PathSelectors.any())
                .build();
    }
 
 
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("新高考走班排课系统前后联调api")
                .description("1.提供后台使用的接口 2.提供对其他服务调用的服务")
                .contact(new Contact("pdh", "https://me.csdn.net/HardToFindName", "617420449@qq.com"))
                .version("1.0")
                .build();
    }
 
 
}
