package com.web.model.global;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.goclass.pojo.TbFifthResult;
import com.web.model.business.service.FifthResultService;
import com.web.model.business.service.UserService;

import goclass.rpc.server.source.StageFiveResultOfClassStrategy;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
	
	@Autowired
	UserService userService;
	@Autowired
	FifthResultService fifthResultService;
	
	@org.junit.Test
	public void test() {
		System.out.println((TbFifthResult)fifthResultService.findOne());
	}
}
