package goclass.rpc.server.call;

import org.apache.thrift.TException;

import goclass.rpc.server.connection.Connection;
import goclass.rpc.server.source.ClassScheduleRule;
import goclass.rpc.server.source.ClassSchedulignService.Client;
import goclass.rpc.server.source.ClassStrategyModifyResult;
import goclass.rpc.server.source.ClassStrategyRule;
import goclass.rpc.server.source.ResultOfClassScheduleCreateTask;
import goclass.rpc.server.source.ResultOfClassScheduleDelTask;
import goclass.rpc.server.source.ResultOfClassScheduleGetTaskResult;
import goclass.rpc.server.source.ResultOfClassScheduleGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassScheduleRunTask;
import goclass.rpc.server.source.ResultOfClassScheduleSimulateData;
import goclass.rpc.server.source.ResultOfClassScheduleStopTask;
import goclass.rpc.server.source.ResultOfClassStrategyCreateTask;
import goclass.rpc.server.source.ResultOfClassStrategyDelTask;
import goclass.rpc.server.source.ResultOfClassStrategyGetTaskResult;
import goclass.rpc.server.source.ResultOfClassStrategyGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassStrategyModifyTaskResult;
import goclass.rpc.server.source.ResultOfClassStrategyRunTask;
import goclass.rpc.server.source.ResultOfGetClassStrategyRule;



public class CallingTool {
	Connection connection = new Connection();
	Client client = connection.getClient();
	//创建分班任务
	public ResultOfClassStrategyCreateTask createTaskForClassStrategy(ClassStrategyRule rule) {
		try {
			return this.client.createTaskForClassStrategy(rule);
		} catch (TException e) {
			// TODO: handle exception
			System.out.println("调用失败");
			e.printStackTrace();
		}
		return null;
	}
	//运行分班任务
	public ResultOfClassStrategyRunTask runTaskForClassStrategy(int taskID,int stage) {
		try {
			return this.client.runTaskForClassStrategy(taskID, stage);
		} catch (TException e) {
			// TODO: handle exception
			System.out.println("调用失败");
			e.printStackTrace();
		}
		return null;
	}
	//获取现有任务及其运行情况
	public ResultOfClassStrategyGetTasksStatus getTasksStatusForClassStrategy() {
		try {
			return this.client.getTasksStatusForClassStrategy();
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//获取任务结果
	public ResultOfClassStrategyGetTaskResult getTaskResultForClassStrategy(int taskID,int stage) {
		try {
			return this.client.getTaskResultForClassStrategy(taskID, stage);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//修改结果
	public ResultOfClassStrategyModifyTaskResult modifyTaskResultForClassStrategy(ClassStrategyModifyResult classStrategyModifyResult) {
		try {
			return this.client.modifyTaskResultForClassStrategy(classStrategyModifyResult);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//获取分班任务的现存规则
	public ResultOfGetClassStrategyRule getClassStrategyRule(int taskID) {
		try {
			return this.client.getClassStrategyRule(taskID);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//删除分班任务
	public ResultOfClassStrategyDelTask delTaskForClassStrategy(int taskID) {
		try {
			return this.client.delTaskForClassStrategy(taskID);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//模拟数据，测试用的
	public ResultOfClassScheduleSimulateData simulateDataForClassSchedule() {
		try {
			return this.client.simulateDataForClassSchedule();
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//创建排课任务
	public ResultOfClassScheduleCreateTask createTaskForClassSchedule(ClassScheduleRule rule) {
		try {
			return this.client.createTaskForClassSchedule(rule);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//删除排课任务
	public ResultOfClassScheduleDelTask delTaskForClassSchedule(int taskId) {
		try {
			return this.client.delTaskForClassSchedule(taskId);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//运行排课任务  异步的形式
	public ResultOfClassScheduleRunTask runTaskForClassSchedule(int taskId,int stage) {
		try {
			return this.client.runTaskForClassSchedule(taskId, stage);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//获取现有排课任务及其运行情况
	public ResultOfClassScheduleGetTasksStatus getTasksStatusForClassSchedule() {
		try {
			return this.client.getTasksStatusForClassSchedule();
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//停止排课任务
	public ResultOfClassScheduleStopTask stopTaskForClassSchedule(int taskId) {
		try {
			return this.client.stopTaskForClassSchedule(taskId);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//获取排课任务结果
	public ResultOfClassScheduleGetTaskResult getTaskResultForClassSchedule(int taskId,int stage) {
		try {
			return this.client.getTaskResultForClassSchedule(taskId,stage);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	public Boolean ping() {
		try {
			return this.client.ping();
		} catch (Exception e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
}
