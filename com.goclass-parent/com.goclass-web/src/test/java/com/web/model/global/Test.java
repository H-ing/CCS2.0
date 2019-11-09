package com.web.model.global;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.goclass.pojo.TbFifthResult;
import com.web.model.business.cg.bean.create.StageFiveData;
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
		StageFiveData stageFiveData = (StageFiveData)fifthResultService.findOne();
		StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = new StageFiveResultOfClassStrategy();
		stageFiveResultOfClassStrategy.setAdminclassList(stageFiveData.getAdminclassList());
		stageFiveResultOfClassStrategy.setAdminclassMixteachingclassList(stageFiveData.getAdminclassMixteachingclassList());
		stageFiveResultOfClassStrategy.setMixteachingclassAdminclassesList(stageFiveData.getMixteachingclassAdminclassesList());
		stageFiveResultOfClassStrategy.setMixteachingclassList(stageFiveData.getMixteachingclassList());
		stageFiveResultOfClassStrategy.setSubjectDict(stageFiveData.getSubjectDict());
		stageFiveResultOfClassStrategy.setTeachingclassIndexList(stageFiveData.getTeachingclassIndexList());
		stageFiveResultOfClassStrategy.setTeachingclassList(stageFiveData.getTeachingclassList());
		
		System.out.println(stageFiveResultOfClassStrategy.toString());
	}
}
