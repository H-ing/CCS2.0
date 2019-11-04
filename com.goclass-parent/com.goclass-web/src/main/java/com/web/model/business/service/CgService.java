package com.web.model.business.service;

import java.util.Map;

import com.rpc.domain.ResultOfClassStrategyCreateTask;
import com.rpc.domain.ResultOfClassStrategyGetTasksStatus;
import com.rpc.domain.ResultOfClassStrategyRunTask;
import com.rpc.thrift.ResultOfClassStrategyDelTask;
import com.rpc.thrift.ResultOfClassStrategyGetTaskResult;
import com.rpc.thrift.ResultOfGetClassStrategyRule;
import com.web.model.business.controller.entity.CreateTaskBean;
import com.web.model.business.controller.entity.ServerMessageBean;

/**
 * 分班服务接口
 * @author Administrator
 *
 */
public interface CgService {
	public Map<Short, String> searchNumberOfTeacherOrStudent(String object);
	
	public ResultOfClassStrategyCreateTask createTask(CreateTaskBean createTaskData);
	
	public ResultOfClassStrategyRunTask runTask(int taskId, int stage);
	
	public ResultOfClassStrategyGetTasksStatus getTasksStatusForClassStrategy();
	
	public ResultOfClassStrategyGetTaskResult getTaskResultForClassStrategy(int taskId, int stage);
	
	public ResultOfGetClassStrategyRule getClassStrategyRule(int taskId);
	
	public ResultOfClassStrategyDelTask delTaskForClassStrategy(int taskId);
	
	public ServerMessageBean serverTest();
}
