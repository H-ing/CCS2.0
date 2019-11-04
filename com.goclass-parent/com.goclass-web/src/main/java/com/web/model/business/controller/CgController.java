package com.web.model.business.controller;

import java.util.Map;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.rpc.domain.ResultOfClassStrategyCreateTask;
import com.rpc.domain.ResultOfClassStrategyGetTasksStatus;
import com.rpc.domain.ResultOfClassStrategyRunTask;
import com.rpc.thrift.ResultOfClassStrategyDelTask;
import com.rpc.thrift.ResultOfClassStrategyGetTaskResult;
import com.rpc.thrift.ResultOfGetClassStrategyRule;
import com.web.model.business.controller.entity.CreateTaskBean;
import com.web.model.business.controller.entity.ServerMessageBean;
import com.web.model.business.service.CgService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 排课Controller
 * @author Administrator
 *
 */
@RequiresRoles(value = {"db_admin", "admin"}, logical = Logical.OR)
@RestController
@RequestMapping("/api/admin/class/grouping")
@Api(tags = {"排课管理"})
public class CgController {
	
	@Autowired
	private CgService cgService;
	
	@ApiOperation(value = "获取科目教师人数，各组合学生人数")
	@RequestMapping(value = "/data",method = RequestMethod.GET)
	public Map<Short, String> searchNumberOfTeacherOrStudent(
			@RequestParam(value = "object") String object) {
		return cgService.searchNumberOfTeacherOrStudent(object);
	}
	
	@ApiOperation(value = "创建分班任务")
	@RequestMapping(value = "/createtask" , method = RequestMethod.POST)
	public ResultOfClassStrategyCreateTask createTask(
			@RequestBody CreateTaskBean createTaskData) {
		return cgService.createTask(createTaskData);
	}
	
	
	@ApiOperation(value = "运行分班任务")
	@RequestMapping(value = "/runtask" , method = RequestMethod.POST)
	public ResultOfClassStrategyRunTask runTask(
			@RequestParam(value = "taskId") int taskId,
			@RequestParam(value = "stage") int stage){
    	return cgService.runTask(taskId, stage);
	}
	
	
 	@ApiOperation(value = "获取现有任务及其运行情况")
	@RequestMapping(value = "/taskstatus" , method = RequestMethod.GET)
	public ResultOfClassStrategyGetTasksStatus getTasksStatusForClassStrategy() {
    	return cgService.getTasksStatusForClassStrategy();
	}
	
	
 	@ApiOperation(value = "获取任务结果")
	@RequestMapping(value = "/result" , method = RequestMethod.GET)
	public ResultOfClassStrategyGetTaskResult getTaskResultForClassStrategy(
			@RequestParam(value = "taskId") int taskId,
			@RequestParam(value = "stage") int stage
			) {
		return cgService.getTaskResultForClassStrategy(taskId, stage);
	}
	
	
 	@ApiOperation(value = "获取分班任务的现存规则")
	@RequestMapping(value = "/rule" , method = RequestMethod.GET)
	public ResultOfGetClassStrategyRule getClassStrategyRule(
			@RequestParam(value = "taskId") int taskId) {
		return cgService.getClassStrategyRule(taskId);
	}
	
	
 	@ApiOperation(value = "删除分班任务")
	@RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
	public ResultOfClassStrategyDelTask delTaskForClassStrategy(
			@RequestParam(value = "taskId") int taskId
			) {
		return cgService.delTaskForClassStrategy(taskId);
	}
	
 	@ApiOperation(value = "测试 服务是否正常")
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public ServerMessageBean serverTest() {
		return cgService.serverTest();
	}
}
