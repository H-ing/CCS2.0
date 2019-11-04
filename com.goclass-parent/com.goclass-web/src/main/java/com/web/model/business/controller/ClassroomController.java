package com.web.model.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.pojo.Classroom;
import com.web.model.business.service.ClassroomService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 教室信息Controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/api/admin/classroom")
//@RequiresRoles("admin")
@Api(tags = {"教室管理"})
public class ClassroomController {
	
	@Autowired
	private ClassroomService classroomService;
	
	@ApiOperation(value = "添加教室信息")
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void add(Classroom classroom) {
		classroomService.add(classroom);
	}
	
	@ApiOperation(value = "教室信息列表")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Classroom> queryAll(){
		return classroomService.queryAll();
	}
	
	@ApiOperation(value = "教室信息详情")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Classroom queryById(@PathVariable("id")Long id) {
		return classroomService.queryById(id);
	}
	
	@ApiOperation(value = "删除单条教室信息")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delById(@PathVariable("id")Long id) {
		classroomService.delById(id);
	}
	
	@ApiOperation(value = "删除多条教室信息")
	@RequestMapping(value = "/list", method = RequestMethod.DELETE)
	public void delByIds(@ApiParam(example = "2,3")@RequestParam("ids")Long[] ids) {
		classroomService.delByIds(ids);
	}
}
