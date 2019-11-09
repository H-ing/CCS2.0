package com.web.model.global;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.web.model.business.service.UserService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
	
	@Autowired
	UserService userService;
	
	
	@org.junit.Test
	public void test() {
		System.out.println(userService == null);
	}
}
