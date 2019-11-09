package com.web.model.business.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.goclass.pojo.Subject;
import com.web.model.business.service.ClassroomService;
import com.web.model.business.service.KeBiaoService;
import com.web.model.business.service.SubjectService;
import com.web.model.business.service.TeacherService;

import goclass.rpc.server.call.CallingTool;
import goclass.rpc.server.source.ClassScheduleRule;
import goclass.rpc.server.source.ResultOfClassScheduleCreateTask;
import goclass.rpc.server.source.ResultOfClassScheduleGetTaskResult;
import goclass.rpc.server.source.ResultOfClassScheduleGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassScheduleRunTask;

@Service
public class KeBiaoServiceImpl implements KeBiaoService{
	/**
	 * {科目id：科目代码}map
	 */
	private static Map<Integer, Integer> subjectNumberMap = new HashMap<>();
	/**
	 * 为每个科目设置对应的科目代码
	 * cid	cname
	 *  1	语文
		2	数学
		3	英语
		4	物理
		5	历史
		6	政治
		7	地理
		8	生物
		9	化学
		10	班会
		11	信息与技术
		12	音乐
		13	体育
	 */
	static {
		subjectNumberMap.put(1, 64);
		subjectNumberMap.put(2, 128);
		subjectNumberMap.put(3, 256);
		subjectNumberMap.put(4, 2);
		subjectNumberMap.put(5, 1);
		subjectNumberMap.put(6, 8);
		subjectNumberMap.put(7, 4);
		subjectNumberMap.put(8, 16);
		subjectNumberMap.put(9, 32);
		subjectNumberMap.put(10, 4096);
		subjectNumberMap.put(11, 1024);
		subjectNumberMap.put(12, 2048);
		subjectNumberMap.put(13, 512);
	}
	/**
	 * 科目教师待使用集合，map{教师序号:使用次数}
	 */
	private Map<Integer, Integer> TeacherUsedCountCid1 = new HashMap<>(); //语文教师使用次数，Cid1表示语文，下面依次类推
	private Map<Integer, Integer> TeacherUsedCountCid2 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid3 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid4 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid5 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid6 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid7 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid8 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid9 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid10 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid11 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid12 = new HashMap<>();
	private Map<Integer, Integer> TeacherUsedCountCid13 = new HashMap<>();
	
	@Autowired
	private ClassroomService classroomService;
	@Autowired
	private SubjectService subjectService;
	@Autowired 
	private TeacherService teacherService;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	private CallingTool callingTool = new CallingTool();
	
	/**
	 * 获取所有科目的老师并为不同科目老师进行编序，如{科目代码0,教师0}，{科目代码0,教师1}，然后添加进规则
	 */
	public void setTeacherList(ClassScheduleRule rule) {
		/**
		 * 计算每个科目id使用过的次数，用于给老师编序号
		 */
		Map<Integer, Short> countMap = new HashMap<>();
		/**
		 * 获取所有教师对应的course_id
		 */
		List<Integer> queryAllCourseIds = teacherService.queryAllCourseIds();
		
		List<Map<Integer, Short>> teacherList = new ArrayList<>();
		
		for (Integer cid : queryAllCourseIds) {
			//一个教师对应一个map：{科目代码，教师序号}
			Map<Integer, Short> map = new HashMap<>();
			//初始化科目id使用过的次数
			if (!countMap.containsKey(cid)) {
				countMap.put(cid, (short) 0);
			}
			short teaOrder = countMap.get(cid);
			//设置科目代码及序号
			map.put(subjectNumberMap.get(cid), teaOrder);
			//增加使用过的科目id的次数
			countMap.put(cid, (short) (countMap.get(cid) + 1));
			//加入teacherList
			teacherList.add(map);
			//将该教师加入待使用集合
			initTeacherUsedCount(cid, teaOrder);
		}
		rule.setTeacherList(teacherList);
	}
	/**
	 * 初始化每个科目教师的使用次数
	 * @param cid 科目id
	 * @param teaOrder 教师序号
	 */
	public void initTeacherUsedCount(int cid, int teaOrder) {
		switch (cid) {
		case 1:
			if (!TeacherUsedCountCid1.containsKey(teaOrder)) {
				TeacherUsedCountCid1.put(teaOrder, 0);
			}
			break;
		case 2:
			if (!TeacherUsedCountCid2.containsKey(teaOrder)) {
				TeacherUsedCountCid2.put(teaOrder, 0);
			}
			break;
		case 3:
			if (!TeacherUsedCountCid3.containsKey(teaOrder)) {
				TeacherUsedCountCid3.put(teaOrder, 0);
			}
			break;
		case 4:
			if (!TeacherUsedCountCid4.containsKey(teaOrder)) {
				TeacherUsedCountCid4.put(teaOrder, 0);
			}
			break;
		case 5:
			if (!TeacherUsedCountCid5.containsKey(cid)) {
				TeacherUsedCountCid5.put(teaOrder, 0);
			}
			break;
		case 6:
			if (!TeacherUsedCountCid6.containsKey(teaOrder)) {
				TeacherUsedCountCid6.put(teaOrder, 0);
			}
			break;
		case 7:
			if (!TeacherUsedCountCid7.containsKey(teaOrder)) {
				TeacherUsedCountCid7.put(teaOrder, 0);
			}
			break;
		case 8:
			if (!TeacherUsedCountCid8.containsKey(teaOrder)) {
				TeacherUsedCountCid8.put(teaOrder, 0);
			}
			break;
		case 9:
			if (!TeacherUsedCountCid9.containsKey(teaOrder)) {
				TeacherUsedCountCid9.put(teaOrder, 0);
			}
			break;
		case 10:
			if (!TeacherUsedCountCid10.containsKey(teaOrder)) {
				TeacherUsedCountCid10.put(teaOrder, 0);
			}
			break;
		case 11:
			if (!TeacherUsedCountCid11.containsKey(teaOrder)) {
				TeacherUsedCountCid11.put(teaOrder, 0);
			}
			break;
		case 12:
			if (!TeacherUsedCountCid12.containsKey(teaOrder)) {
				TeacherUsedCountCid12.put(teaOrder, 0);
			}
			break;
		case 13:
			if (!TeacherUsedCountCid13.containsKey(teaOrder)) {
				TeacherUsedCountCid13.put(teaOrder, 0);
			}
			break;
		default:
			break;
		}
	}
	
	
	
	/**
	 * 获取教室集并添加进规则
	 */
	public void setClassroomList(ClassScheduleRule rule) {
		List<Long> classroomIds = classroomService.queryAllId();
		List<Integer> classroomList = new ArrayList<Integer>();
		for (Long id : classroomIds) {
			classroomList.add(id.intValue());
		}
		rule.setClassroomList(classroomList);
	}
	/**
	 * 获取第五阶段分班后行政班对应结果集，并解析出行政班个数，为行政班分配教室，然后添加进规则
	 */
	public void setTeachingclassClassroomList(ClassScheduleRule rule, int taskId) {
		redisTemplate.boundHashOps(taskId + "_" );
	}
	public void name() {
		
	}
	@Override
	public ResultOfClassScheduleCreateTask createTaskForClassSchedule(ClassScheduleRule rule, int taskId) {
		//设置TeacherList
		setTeacherList(rule);
		//设置classroomList
		setClassroomList(rule);
		
		
		return callingTool.createTaskForClassSchedule(rule);
	}

	@Override
	public ResultOfClassScheduleRunTask runTaskForClassSchedule(Integer taskId, Integer stage) {
		return callingTool.runTaskForClassSchedule(taskId, stage);
	}

	@Override
	public ResultOfClassScheduleGetTasksStatus getTasksStatusForClassSchedule() {
		return callingTool.getTasksStatusForClassSchedule();
	}

	@Override
	public ResultOfClassScheduleGetTaskResult getTaskResultForClassSchedule(Integer taskId, Integer stage) {
		return callingTool.getTaskResultForClassSchedule(taskId, stage);
	}

}
