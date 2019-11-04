package com.web.model.business.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goclass.mapper.PopulationMapper;
import com.rpc.domain.ResultOfClassStrategyCreateTask;
import com.rpc.domain.ResultOfClassStrategyGetTasksStatus;
import com.rpc.domain.ResultOfClassStrategyRunTask;
import com.rpc.thrift.ClassStrategyRule;
import com.rpc.thrift.ResultOfClassStrategyDelTask;
import com.rpc.thrift.ResultOfClassStrategyGetTaskResult;
import com.rpc.thrift.ResultOfGetClassStrategyRule;
import com.rpc.utils.CallingTool;
import com.rpc.utils.PropertyCopyTool;
import com.web.model.business.controller.entity.CreateTaskBean;
import com.web.model.business.controller.entity.ServerMessageBean;
import com.web.model.business.service.CgService;
import com.web.model.global.utils.CreateTaskTransform;

@Service
public class CgServiceImpl implements CgService{

	@Autowired
	private PopulationMapper population;
	
	
	/**
	 * 获取科目教师人数，各组合学生人数
	 * @param object
	 * @return
	 */
	@Override
	public Map<Short, String> searchNumberOfTeacherOrStudent(String object) {
		Map<Short, String> number = new HashMap<>();
		CreateTaskTransform transformTool = new CreateTaskTransform();
		number.put((short) 1, "人数");
		if (object.equals("teacher")){
			Short[] subjectList = transformTool.getSubjectCodeList();
			for(Short temp:subjectList) {
				number.put(temp,population.selectNumberOfTeacherBySubjectId(temp)+"");
			}
		}else if (object.equals("student")){
			Short[] sectionStudentNumberTransform= transformTool.getSectionStudentNumberTransform();
			for(Short temp:sectionStudentNumberTransform) {
				number.put(temp,population.selectNumberOfStudentByCombinationId(temp)+"");
			}
		}else {
			return null;
		}
		return number;
	}

	@Override
	public ResultOfClassStrategyCreateTask createTask(CreateTaskBean createTaskData) {
		CreateTaskTransform tools = new CreateTaskTransform();
		ClassStrategyRule classStrategyRule = new ClassStrategyRule();
		//封装参数
		classStrategyRule.setSubjectTeacherNumber(tools.subjectTeacherNumberTransform(
				createTaskData.getSubjectTeacherNumber()));
		classStrategyRule.setSectionStudentNumber(tools.sectionStudentNumberTransform(
				createTaskData.getSectionStudentNumber()));
		classStrategyRule.setMaxAndMinClassStudentNumber(createTaskData.getMaxAndMinClassStudentNumber());
		classStrategyRule.setRuning_time(createTaskData.getRuningTime());
		//远程调用
		ResultOfClassStrategyCreateTask returnMessage = new ResultOfClassStrategyCreateTask();
		try {
			PropertyCopyTool.Copy(CallingTool.createTaskForClassStrategy(classStrategyRule), returnMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("复制失败");
			e.printStackTrace();
		}
		return returnMessage;
	}

	@Override
	public ResultOfClassStrategyRunTask runTask(int taskId, int stage) {
		ResultOfClassStrategyRunTask returnMessage = new ResultOfClassStrategyRunTask();
    	try {
			PropertyCopyTool.Copy(CallingTool.runTaskForClassStrategy(taskId, stage), returnMessage);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("复制失败");
			e.printStackTrace();
		}
		return returnMessage;
	}

	@Override
	public ResultOfClassStrategyGetTasksStatus getTasksStatusForClassStrategy() {
		ResultOfClassStrategyGetTasksStatus returnMessage = new ResultOfClassStrategyGetTasksStatus();
    	try {
			PropertyCopyTool.Copy(CallingTool.getTasksStatusForClassStrategy(), returnMessage);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("复制失败");
			e.printStackTrace();
		}
		return returnMessage;
	}

	@Override
	public ResultOfClassStrategyGetTaskResult getTaskResultForClassStrategy(int taskId, int stage) {
		return CallingTool.getTaskResultForClassStrategy(taskId, stage);
	}

	@Override
	public ResultOfGetClassStrategyRule getClassStrategyRule(int taskId) {
		return CallingTool.getClassStrategyRule(taskId);
	}

	@Override
	public ResultOfClassStrategyDelTask delTaskForClassStrategy(int taskId) {
		return CallingTool.delTaskForClassStrategy(taskId);
	}

	@Override
	public ServerMessageBean serverTest() {
		ServerMessageBean returnMessage = new ServerMessageBean();
		//测试rpc是否能连接
		
		if(CallingTool.ping()){
			returnMessage.setRpcService("rpc server is OK");
		}else {
			returnMessage.setRpcService("fail to connect rpc server");
		}
		
		//测试数据源是否正常   待添加
		returnMessage.setDataSource("data source is OK");
		return returnMessage;
	}

}
