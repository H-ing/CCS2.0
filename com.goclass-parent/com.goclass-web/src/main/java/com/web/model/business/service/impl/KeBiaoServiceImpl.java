package com.web.model.business.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.goclass.pojo.Subject;
import com.web.model.business.cg.bean.create.StageFiveData;
import com.web.model.business.service.ClassroomService;
import com.web.model.business.service.FifthResultService;
import com.web.model.business.service.KeBiaoService;
import com.web.model.business.service.SubjectService;
import com.web.model.business.service.TeacherService;
import com.web.model.global.entity.RequestRule;

import goclass.rpc.server.call.CallingTool;
import goclass.rpc.server.source.ClassScheduleRule;
import goclass.rpc.server.source.ResultOfClassScheduleCreateTask;
import goclass.rpc.server.source.ResultOfClassScheduleGetTaskResult;
import goclass.rpc.server.source.ResultOfClassScheduleGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassScheduleRunTask;
import goclass.rpc.server.source.StageFiveResultOfClassStrategy;

@Service
public class KeBiaoServiceImpl implements KeBiaoService{
	/**
	 * {科目id：科目代码}map
	 */
	private static Map<Integer, Integer> subjectNumberMap = new HashMap<>();
	/**
	 * 为每个科目设置对应的科目代码
	 * cid	cname	sn
	 *  1	语文  	64
		2	数学		128
		3	英语		256
		4	物理		2
		5	历史		1
		6	政治		8
		7	地理		4
		8	生物		16
		9	化学		32
		10	班会		4096
		11	信息与技术	1024
		12	音乐			2048
		13	体育			512
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
	 * 定义科目教师待使用集合map{教师序号:使用次数}和科目代码与待用教师集的映射关系
	 */
	static Map<Integer, Map<Integer, Integer>> TeacherUsedCountMap = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid1 = new HashMap<>(); //语文教师使用次数，Cid1表示语文，下面依次类推
	private static   Map<Integer, Integer> TeacherUsedCountCid2 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid3 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid4 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid5 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid6 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid7 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid8 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid9 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid10 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid11 = new HashMap<>();
	private static   Map<Integer, Integer> TeacherUsedCountCid12 = new HashMap<>();
	private static  Map<Integer, Integer> TeacherUsedCountCid13 = new HashMap<>();
	static {
		TeacherUsedCountMap.put(64, TeacherUsedCountCid1);
		TeacherUsedCountMap.put(128, TeacherUsedCountCid2);
		TeacherUsedCountMap.put(256, TeacherUsedCountCid3);
		TeacherUsedCountMap.put(2, TeacherUsedCountCid4);
		TeacherUsedCountMap.put(1, TeacherUsedCountCid5);
		TeacherUsedCountMap.put(8, TeacherUsedCountCid6);
		TeacherUsedCountMap.put(4, TeacherUsedCountCid7);
		TeacherUsedCountMap.put(16, TeacherUsedCountCid8);
		TeacherUsedCountMap.put(32, TeacherUsedCountCid9);
		TeacherUsedCountMap.put(4096, TeacherUsedCountCid10);
		TeacherUsedCountMap.put(1024, TeacherUsedCountCid11);
		TeacherUsedCountMap.put(2048, TeacherUsedCountCid12);
		TeacherUsedCountMap.put(512, TeacherUsedCountCid13);
	}
	/**
	 * 定义默认当前一个科目教师使用最大次数和映射关系
	 */
	static Map<Integer, Integer> maxTimesMap = new HashMap<>();
	private static  int maxTimesCid1 = 1; //Cid1表示语文教师，下面类推
	private static  int maxTimesCid2 = 1;
	private static  int maxTimesCid3 = 1;
	private static  int maxTimesCid4 = 1;
	private static  int maxTimesCid5 = 1;
	private static  int maxTimesCid6 = 1;
	private static  int maxTimesCid7 = 1;
	private static  int maxTimesCid8 = 1;
	private static  int maxTimesCid9 = 1;
	private static  int maxTimesCid10 = 1;
	private static  int maxTimesCid11 = 1;
	private static  int maxTimesCid12 = 1;
	private static int maxTimesCid13 = 1;
	static {
		maxTimesMap.put(64, maxTimesCid1);
		maxTimesMap.put(128, maxTimesCid2);
		maxTimesMap.put(256, maxTimesCid3);
		maxTimesMap.put(2, maxTimesCid4);
		maxTimesMap.put(1, maxTimesCid5);
		maxTimesMap.put(8, maxTimesCid6);
		maxTimesMap.put(4, maxTimesCid7);
		maxTimesMap.put(16, maxTimesCid8);
		maxTimesMap.put(32, maxTimesCid9);
		maxTimesMap.put(4096, maxTimesCid10);
		maxTimesMap.put(1024, maxTimesCid11);
		maxTimesMap.put(2048, maxTimesCid12);
		maxTimesMap.put(512, maxTimesCid13);
	}
	@Autowired
	private ClassroomService classroomService;
	@Autowired
	private SubjectService subjectService;
	@Autowired 
	private TeacherService teacherService;
//	@Autowired
//	private RedisTemplate<String, Object> redisTemplate;
	@Autowired
	private FifthResultService fifthResultService;

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
	 * 获取第五阶段数据并解析，为每个教学班分配老师，然后添加进规则
	 * @param rule
	 */
	public void setTeachingclassTeacherList(ClassScheduleRule rule) {
		//获取分班第五阶段结果
		StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = getStageFiveResultOfClassStrategy();
		//获取教学班索引集，其中的map含义{科目代码:班级序号}
		List<Map<Integer,Integer>> teachingclassIndexList = stageFiveResultOfClassStrategy.getTeachingclassIndexList();
		//教学班*教师序号规则，需要同上面的teachingclassIndexList对应
		List<Integer> teachingclassTeacherList = new ArrayList<>();
		for (Map<Integer, Integer> idxMap : teachingclassIndexList) {
			//获取每个教学班的科目代码
			Set<Integer> keySet = idxMap.keySet();
			for (Integer subjectNum : keySet) {
				//map含意：{教师序号:使用次数}
				Map<Integer, Integer> teacherUsedCount = getTeacherUsedCount(subjectNum);
				//获取教师序号
				Set<Integer> teaOrder = teacherUsedCount.keySet();
				//更新最大使用次数标记
				boolean updateMaxUseTimes = true;
				for (Integer order : teaOrder) {
					//判断当前教师使用次数是否大于等于该科目当前最大的使用次数，是则部对其进行分配
					if (teacherUsedCount.get(order) >= getMaxUseTimes(subjectNum)) {
						continue;
					}else {
						//将该老师分配进当前教学班
						teachingclassTeacherList.add(order);
						//增加该教师的使用次数
						teacherUsedCount.put(order, teacherUsedCount.get(order) + 1);
						//修改更新标记
						updateMaxUseTimes = false;
						break;
					}
				}
				//当所有老师都超过当前最大使用次数，则对最大使用次数更新，并在更新后对教学班进行分配老师
				if (updateMaxUseTimes) {
					updateMaxUseTimes(subjectNum);
					//随机一个该科目的教师分配进这个教学班
					for (Integer order : teaOrder) {
						//将一个教师分配进当前教学班
						teachingclassTeacherList.add(order);
						//增加该教师的使用次数
						teacherUsedCount.put(order, teacherUsedCount.get(order) + 1);
						break;
					}
				}
			}
		}
		//设置规则
		rule.setTeachingclassTeacherList(teachingclassTeacherList);
	}
	/**
	 * 根据科目代码获取对应待用教师集
	 * @param subjectNum
	 */
	public Map<Integer, Integer> getTeacherUsedCount(int subjectNum) {
		return TeacherUsedCountMap.get(subjectNum);
	}
	/**
	 * 根据科目代码，获取该科目一个教师使用次数的上限
	 * @param subjectNum
	 * @return
	 */
	public int getMaxUseTimes(int subjectNum) {
		return getMaxUseTimesMap().get(subjectNum);
	}
	/**
	 * 根据科目代码更新教师最大使用次数
	 * @param subjectNum
	 */
	public void updateMaxUseTimes(int subjectNum) {
		Integer curMax = getMaxUseTimesMap().get(subjectNum) + 1;
		//更新
		getMaxUseTimesMap().put(subjectNum, curMax);
	}
	/**
	 * 获取教学科目代码映射科目教师使用最大次数map
	 * @return
	 */
	public Map<Integer, Integer> getMaxUseTimesMap() {
		return maxTimesMap;
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
	 * 获取第五阶段结果
	 * @return
	 */
	public StageFiveResultOfClassStrategy getStageFiveResultOfClassStrategy() {
		StageFiveData stageFiveData = (StageFiveData)fifthResultService.findOne();
		StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = new StageFiveResultOfClassStrategy();
		stageFiveResultOfClassStrategy.setAdminclassList(stageFiveData.getAdminclassList());
		stageFiveResultOfClassStrategy.setAdminclassMixteachingclassList(stageFiveData.getAdminclassMixteachingclassList());
		stageFiveResultOfClassStrategy.setMixteachingclassAdminclassesList(stageFiveData.getMixteachingclassAdminclassesList());
		stageFiveResultOfClassStrategy.setMixteachingclassList(stageFiveData.getMixteachingclassList());
		stageFiveResultOfClassStrategy.setSubjectDict(stageFiveData.getSubjectDict());
		stageFiveResultOfClassStrategy.setTeachingclassIndexList(stageFiveData.getTeachingclassIndexList());
		stageFiveResultOfClassStrategy.setTeachingclassList(stageFiveData.getTeachingclassList());
		return stageFiveResultOfClassStrategy;
	}
	/**
	 * 为每个行政班分配对应的教室索引,然后添加进规则
	 * @param size 行政班数
	 */
	public void setTeachingclassClassroomList(ClassScheduleRule rule, int size) {
		List<Long> classroomIds = classroomService.queryAllId();
		List<Integer> teachingclassClassroomList = new ArrayList<>();
		//计数添加多少个教室
		int i = 0;
		for (Long id : classroomIds) {
			teachingclassClassroomList.add(id.intValue());
			i++;
			//当行政班数小于等于教室数时，计数到达行政班数时停止分配
			if (i == size) {
				break;
			}
		}
		//当教室数小于行政班数时，继续分配序号直到分完所有行政班
		while (size > i) {
			teachingclassClassroomList.add(i++);
		}
		rule.setTeachingclassClassroomList(teachingclassClassroomList);
	}
	
	/**
	 * 创建排课任务
	 */
	@Override
	public ResultOfClassScheduleCreateTask createTaskForClassSchedule(RequestRule rule, int taskId) {
		//创建排课规则
		ClassScheduleRule classScheduleRule = new ClassScheduleRule();
		//设置第五阶段结果
		StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = getStageFiveResultOfClassStrategy();
		classScheduleRule.setStageFiveResultOfClassStrategy(stageFiveResultOfClassStrategy);
		//设置teachingclassClassroomList
		int size = stageFiveResultOfClassStrategy.getAdminclassList().size();
		setTeachingclassClassroomList(classScheduleRule, size);
		//设置TeacherList
		setTeacherList(classScheduleRule);
		//设置classroomList
		setClassroomList(classScheduleRule);
		//设置teachingclassTeacherList
		setTeachingclassTeacherList(classScheduleRule);
		//设置每个科目每周的节次subjectSubjectcount
		classScheduleRule.setSubjectSubjectcount(rule.getSubjectSubjectcount());
		//设置一天的节次onedaySession
		classScheduleRule.setOnedaySession(rule.getOnedaySession());
		//设置固排课表positiveClassSchedule
		classScheduleRule.setPositiveClassSchedule(rule.getPositiveClassSchedule());
		//设置禁排课表negativeClassSchedule
		classScheduleRule.setNegativeClassSchedule(rule.getNegativeClassSchedule());
		//设置连排connectClass
		classScheduleRule.setConnectClass(rule.getConnectClass());
		
		return callingTool.createTaskForClassSchedule(classScheduleRule);
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
