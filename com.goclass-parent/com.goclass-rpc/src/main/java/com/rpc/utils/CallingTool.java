package com.rpc.utils;

import org.apache.thrift.TException;

import com.rpc.thrift.ClassSchedulignService.Client;
import com.rpc.thrift.ClassStrategyModifyResult;
import com.rpc.thrift.ClassStrategyRule;
import com.rpc.thrift.ResultOfClassStrategyCreateTask;
import com.rpc.thrift.ResultOfClassStrategyDelTask;
import com.rpc.thrift.ResultOfClassStrategyGetTaskResult;
import com.rpc.thrift.ResultOfClassStrategyGetTasksStatus;
import com.rpc.thrift.ResultOfClassStrategyModifyTaskResult;
import com.rpc.thrift.ResultOfClassStrategyRunTask;
import com.rpc.thrift.ResultOfGetClassStrategyRule;

/**
 * 分班结果工具类
 * @author Administrator
 *
 */
public class CallingTool {
	static Connection connection = new Connection();
	static Client client = connection.getClient();
	//创建分班任务
	public static ResultOfClassStrategyCreateTask createTaskForClassStrategy(ClassStrategyRule rule) {
		try {
			return client.createTaskForClassStrategy(rule);
		} catch (TException e) {
			// TODO: handle exception
			System.out.println("调用失败");
			e.printStackTrace();
		}
		return null;
	}
	//运行分班任务
	public static ResultOfClassStrategyRunTask runTaskForClassStrategy(int taskID,int stage) {
		try {
			return client.runTaskForClassStrategy(taskID, stage);
		} catch (TException e) {
			// TODO: handle exception
			System.out.println("调用失败");
			e.printStackTrace();
		}
		return null;
	}
	//获取现有任务及其运行情况
	public static ResultOfClassStrategyGetTasksStatus getTasksStatusForClassStrategy() {
		try {
			return client.getTasksStatusForClassStrategy();
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//获取任务结果
	public static ResultOfClassStrategyGetTaskResult getTaskResultForClassStrategy(int taskID,int stage) {
		try {
			return client.getTaskResultForClassStrategy(taskID, stage);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//修改结果
	public static ResultOfClassStrategyModifyTaskResult modifyTaskResultForClassStrategy(ClassStrategyModifyResult classStrategyModifyResult) {
		try {
			return client.modifyTaskResultForClassStrategy(classStrategyModifyResult);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//获取分班任务的现存规则
	public static ResultOfGetClassStrategyRule getClassStrategyRule(int taskID) {
		try {
			return client.getClassStrategyRule(taskID);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	//删除分班任务
	public static ResultOfClassStrategyDelTask delTaskForClassStrategy(int taskID) {
		try {
			return client.delTaskForClassStrategy(taskID);
		} catch (TException e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	public static Boolean ping() {
		try {
			return client.ping();
		} catch (Exception e) {
			System.out.println("调用失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
}
