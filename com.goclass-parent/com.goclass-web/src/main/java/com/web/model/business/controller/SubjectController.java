package com.web.model.business.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.pojo.Subject;
import com.web.model.business.service.SubjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequiresRoles(value = {"db_admin", "admin"}, logical = Logical.OR)
@RestController
@RequestMapping("/api/admin/subject")
@Api(tags = {"课程管理"})
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@ApiOperation(value = "添加课程信息")
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void add(Subject subject) {
		subjectService.add(subject);
	}
	
	@ApiOperation(value = "课程信息列表")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Subject> queryAll(){
		return subjectService.queryAll();
	}
	
	@ApiOperation(value = "课程信息详情")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Subject queryById(@PathVariable("id")Long id) {
		return subjectService.queryById(id);
	}
	
	@ApiOperation(value = "删除单条课程信息")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delById(@PathVariable("id")Long id) {
		subjectService.delById(id);
	}
	
	@ApiOperation(value = "删除多条课程信息")
	@RequestMapping(value = "/list", method = RequestMethod.DELETE)
	public void delByIds(@ApiParam(example = "2,3")@RequestParam("ids")Long[] ids) {
		subjectService.delByIds(ids);
	}
}
