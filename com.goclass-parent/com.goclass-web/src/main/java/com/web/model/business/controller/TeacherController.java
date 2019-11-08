package com.web.model.business.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.pojo.Teacherswill;
import com.web.model.business.service.TeacherService;
import com.web.model.global.entity.TeacherWillTime;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/admin/teacher")
@Api(tags = "教师管理")
@RequiresRoles(value = {"db_admin","admin"}, logical = Logical.OR)
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@ApiOperation("添加上课时间意愿")
	@RequestMapping(value = "/will", method = RequestMethod.POST)
	public void addTimeWill(@RequestBody TeacherWillTime teacherWillTime) {
		teacherService.addTimeWill(teacherWillTime);
	}
	
	@ApiOperation("查看上课时间意愿列表")
	@RequestMapping(value = "/wills", method = RequestMethod.GET)
	public List<Teacherswill> queryAllTimeWill() {
		return teacherService.queryAllTimeWill();
	}
	
	@ApiOperation("查看单个上课时间意愿")
	@RequestMapping(value = "/will/{willId}", method = RequestMethod.GET)
	public Teacherswill queryTimeWillByWillId(@PathVariable("willId")Long willId) {
		return teacherService.queryTimeWillByWillId(willId);
	}
	
	@ApiOperation("修改单个上课时间意愿的接受状态")
	@RequestMapping(value = "/will/status/{willId}/{accept}", method = RequestMethod.POST)
	public void isAcceptTeacherTimeWill(@PathVariable("willId")Long willId, @PathVariable("accept")Integer accept) {
		teacherService.isAcceptTeacherTimeWill(willId, accept);
	}
}
