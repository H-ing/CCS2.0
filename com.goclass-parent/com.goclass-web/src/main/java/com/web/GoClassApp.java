package com.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//swagger2.8后不添加该注解无法访问文档
@MapperScan("com.goclass.mapper")
public class GoClassApp {

	public static void main(String[] args) {
		SpringApplication.run(GoClassApp.class, args);
	}

}
