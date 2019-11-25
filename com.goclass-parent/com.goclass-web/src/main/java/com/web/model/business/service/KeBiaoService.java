package com.web.model.business.service;

<<<<<<< HEAD
import java.util.List;

import com.goclass.pojo.Kebiao;
=======
import com.web.model.global.entity.RequestRule;
>>>>>>> 9cccb039f5942c4e26fd0138a2b17a1a47e60d1b

import goclass.rpc.server.source.ClassScheduleRule;
import goclass.rpc.server.source.ResultOfClassScheduleCreateTask;
import goclass.rpc.server.source.ResultOfClassScheduleDelTask;
import goclass.rpc.server.source.ResultOfClassScheduleGetTaskResult;
import goclass.rpc.server.source.ResultOfClassScheduleGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassScheduleRunTask;
import goclass.rpc.server.source.ResultOfClassScheduleSimulateData;
import goclass.rpc.server.source.ResultOfClassScheduleStopTask;
/**
 * 排课服务
 * @author Administrator
 *
 */
public interface KeBiaoService {
	/**
	 * 
	 * @Title: queryAll
	 * @Description:获取所有课表 
	 * @Author pengdehe
	 * @DateTime 2019年11月12日 上午9:44:41
	 * @return
	 */
	public List<Kebiao> queryAll();
	/**
	 * 创建排课任务
	 * @param rule
	 * @return
	 */
	public ResultOfClassScheduleCreateTask createTaskForClassSchedule(RequestRule rule, int taskId);
	/**
	 * 运行排课任务  异步的形式
	 * @param taskId 任务id
	 * @param stage 阶段
	 * @return
	 */
	public ResultOfClassScheduleRunTask runTaskForClassSchedule(Integer taskId, Integer stage);
	/**
	 * 获取现有排课任务及其运行情况
	 * @return
	 */
	public ResultOfClassScheduleGetTasksStatus getTasksStatusForClassSchedule();
	/**
	 * 获取任务结果
	 * @param taskId
	 * @param stage
	 * @return
	 */
	public ResultOfClassScheduleGetTaskResult getTaskResultForClassSchedule(Integer taskId, Integer stage);
	
	public ResultOfClassScheduleStopTask stop(int taskId);
	
	public ResultOfClassScheduleSimulateData getSimulateData();
	
	public ResultOfClassScheduleDelTask delTaskForClassSchedule(int taskId);
}
