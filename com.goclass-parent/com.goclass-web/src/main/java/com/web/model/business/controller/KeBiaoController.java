package com.web.model.business.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.pojo.Kebiao;
import com.web.model.business.service.KeBiaoService;

import goclass.rpc.server.source.ClassScheduleRule;
import goclass.rpc.server.source.ResultOfClassScheduleCreateTask;
import goclass.rpc.server.source.ResultOfClassScheduleGetTaskResult;
import goclass.rpc.server.source.ResultOfClassScheduleGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassScheduleRunTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "课表（排课）管理")
@RequestMapping("/api/admin/kebiao")
public class KeBiaoController {
	
	private static final Logger log = LoggerFactory.getLogger(KeBiaoController.class);

	@Autowired
	private KeBiaoService keBiaoService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation("获取所有课表")
	public List<Kebiao> queryAll() {
		return keBiaoService.queryAll();
	}

	@RequestMapping(value = "/task", method = RequestMethod.POST)
	@ApiOperation("创建排课任务")
	public ResultOfClassScheduleCreateTask createTaskForClassSchedule(@RequestBody ClassScheduleRule rule, int taskId) {
		log.info("创建排课任务,规则（rule）: " + rule.toString());
		return keBiaoService.createTaskForClassSchedule(rule, taskId);
	}

	@RequestMapping(value = "/task/run/{taskId}/{stage}", method = RequestMethod.GET)
	@ApiOperation("运行排课任务  异步的形式")
	public ResultOfClassScheduleRunTask runTaskForClassSchedule(@PathVariable("taskId") Integer taskId,
			@PathVariable("stage") Integer stage) {
		log.info("运行排课任务: taskid:" + taskId + ", stage :" +stage);
		return keBiaoService.runTaskForClassSchedule(taskId, stage);
	}

	@RequestMapping(value = "/tasks/status", method = RequestMethod.GET)
	@ApiOperation("获取现有排课任务及其运行情况")
	public ResultOfClassScheduleGetTasksStatus getTasksStatusForClassSchedule() {
		log.info("获取现有排课任务及其运行情况");
		return keBiaoService.getTasksStatusForClassSchedule();
	}

	@RequestMapping(value = "/task/result/{taskId}/{stage}", method = RequestMethod.GET)
	@ApiOperation("获取任务结果")
	public ResultOfClassScheduleGetTaskResult getTaskResultForClassSchedule(@PathVariable("taskId") Integer taskId,
			@PathVariable("stage") Integer stage) {
		log.info("获取任务结果: taskid:" + taskId + ", stage :" +stage);
		return keBiaoService.getTaskResultForClassSchedule(taskId, stage);
	}
}
