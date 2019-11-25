package com.web.model.global;

import static org.assertj.core.api.Assertions.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

<<<<<<< HEAD
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.goclass.mapper.KebiaoMapper;
import com.goclass.mapper.MixadminMapper;
import com.goclass.mapper.TeaclassMapper;
import com.goclass.mapper.TeamixMapper;
import com.goclass.pojo.Kebiao;
import com.goclass.pojo.KebiaoExample;
import com.goclass.pojo.KebiaoExample.Criteria;
import com.goclass.pojo.Mixadmin;
import com.goclass.pojo.MixadminExample;
import com.goclass.pojo.TbFifthResult;
import com.goclass.pojo.Teaclass;
import com.goclass.pojo.TeaclassExample;
import com.goclass.pojo.Teamix;
import com.goclass.pojo.TeamixExample;
import com.web.model.business.cg.bean.create.StageFiveData;
import com.web.model.business.service.FifthResultService;
import com.web.model.business.service.KeBiaoService;
import com.web.model.business.service.UserService;

import goclass.rpc.server.source.ClassScheduleRule;
import goclass.rpc.server.source.ResultOfClassScheduleCreateTask;
import goclass.rpc.server.source.ResultOfClassScheduleDelTask;
import goclass.rpc.server.source.ResultOfClassScheduleGetTaskResult;
import goclass.rpc.server.source.ResultOfClassScheduleGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassScheduleRunTask;
import goclass.rpc.server.source.ResultOfClassScheduleSimulateData;
import goclass.rpc.server.source.ResultOfClassScheduleStopTask;
import goclass.rpc.server.source.StageFiveResultOfClassStrategy;
import goclass.rpc.server.source.StageTwoResultOfClassSchedule;
=======
import com.goclass.pojo.TbFifthResult;
import com.web.model.business.cg.bean.create.StageFiveData;
import com.web.model.business.service.FifthResultService;
import com.web.model.business.service.UserService;

import goclass.rpc.server.source.StageFiveResultOfClassStrategy;
>>>>>>> 9cccb039f5942c4e26fd0138a2b17a1a47e60d1b

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
	/**
	 * {科目id：科目代码}map
	 */
	private static Map<Integer, String> subjectNumberMap = new HashMap<>();
	/**
	 * 为每个科目设置对应的科目代码 cid cname 1 语文 2 数学 3 英语 4 物理 5 历史 6 政治 7 地理 8 生物 9 化学 10 班会
	 * 11 信息与技术 12 音乐 13 体育
	 */
	static {
		subjectNumberMap.put(64, "语文");
		subjectNumberMap.put(128, "数学");
		subjectNumberMap.put(256, "英语");
		subjectNumberMap.put(2, "物理");
		subjectNumberMap.put(1, "历史");
		subjectNumberMap.put(8, "政治");
		subjectNumberMap.put(4, "地理");
		subjectNumberMap.put(16, "生物");
		subjectNumberMap.put(32, "化学");
		subjectNumberMap.put(4096, "班会");
		subjectNumberMap.put(1024, "信息与技术");
		subjectNumberMap.put(2048, "音乐");
		subjectNumberMap.put(512, "体育");
	}

	@Autowired
<<<<<<< HEAD
	KeBiaoService keBiaoService;
	@Autowired
	FifthResultService fifthResultService;
	@Autowired
	MixadminMapper mixadminMapper;
	@Autowired
	TeamixMapper teamixMapper;
	@Autowired
	TeaclassMapper teaclassMapper;
	@Autowired
	KebiaoMapper kebiaoMapper;
=======
	UserService userService;
	@Autowired
	FifthResultService fifthResultService;
>>>>>>> 9cccb039f5942c4e26fd0138a2b17a1a47e60d1b
	
	@org.junit.Test
	public void teachingclassClassroomList() {
		ResultOfClassScheduleSimulateData simulateData = keBiaoService.getSimulateData();
		ClassScheduleRule scheduleRule = simulateData.getClassScheduleRule();
		
		//教师集
		List<Map<Integer,Short>> teacherList = scheduleRule.getTeacherList();
		//教学班与老师的映射
		List<Integer> teachingclassTeacherList = scheduleRule.getTeachingclassTeacherList();
		//教学班与教室的映射
		List<Integer> teachingclassClassroomList = scheduleRule.getTeachingclassClassroomList();
		//计数教学班id
		int teaclassId = 0;
		for (Integer teacherId : teachingclassTeacherList) {
			//根据教师索引对应教师
			Map<Integer, Short> map = teacherList.get(teacherId);
			String subjectName = null; //科目名称
			Short teaOrder = null;	//老师序号
			Set<Integer> keySet = map.keySet();
			for (Integer subNum : keySet) {
				subjectName = subjectNumberMap.get(subNum);
				teaOrder = map.get(subNum);
			}
			//构造老师名
			String teaName = subjectName + teaOrder;
			//根据教学班id获取教室id
			Integer classroomId = teachingclassClassroomList.get(teaclassId);
			System.out.println("教学班id：" + teaclassId + ", 上课老师:" + teaName + "，上课地点：" + classroomId);
			teaclassId++;
		}
//		for (Integer classroomId : teachingclassClassroomList) {
//			System.out.println("classroomId: " + classroomId);
//		}
	}

	@org.junit.Test
	public void mixteachingclassAdminclassesList() {
		StageFiveData findOne = (StageFiveData) fifthResultService.findOne();
		List<List<Integer>> mixteachingclassAdminclassesList = findOne.getMixteachingclassAdminclassesList();
		int idx = 0;
		for (List<Integer> list : mixteachingclassAdminclassesList) {
			for (Integer admin_id : list) {
				System.out.println("混合教学班索引：" + idx + ", 行政班索引：" + admin_id);
			}
			idx++;
		}

	}

	@org.junit.Test
	public void adminclassMixteachingclassList() {
		StageFiveData findOne = (StageFiveData) fifthResultService.findOne();
		List<List<Integer>> adminclassMixteachingclassList = findOne.getAdminclassMixteachingclassList();
		Long adminIndex = 0L;
		// 每个行政班含有的混合教学班
		for (List<Integer> mixList : adminclassMixteachingclassList) {
			Kebiao kebiao = new Kebiao();
			kebiao.setAdminId(adminIndex);
			kebiaoMapper.insert(kebiao);
			for (Integer integer : mixList) {
				System.out.println("行政班索引：" + adminIndex + ", 混合教学班索引：" + integer);
				Mixadmin mixadmin = new Mixadmin();
				mixadmin.setAdminId(adminIndex);
				mixadmin.setMixId(integer.longValue());
				mixadminMapper.insert(mixadmin);
			}
			adminIndex++;
		}
	}

	@org.junit.Test
	public void get5StageData() {
		Object findOne = fifthResultService.findOne();
		if (findOne instanceof StageFiveData) {
			StageFiveData fiveResult = (StageFiveData) findOne;
			System.out.println(fiveResult.toString());
			// 混合教学班*锁包含的教学班序号
			List<List<Integer>> mixteachingclassList = fiveResult.getMixteachingclassList();
			Long i = 0L;
			for (List<Integer> list : mixteachingclassList) {
				System.out.println("混合教学班" + i + "，包含的教学班：" + list.toString());
				for (Integer teaclassId : list) {
					Teamix teamix = new Teamix();
					teamix.setMixId(i);
					teamix.setTeaclassId(teaclassId.longValue());
					teamixMapper.insert(teamix);
				}

				i++;
			}
			System.out.println("================================================================");
			// 教学班数*{科目代码:序号}
			List<Map<Integer, Integer>> teachingclassIndexList = fiveResult.getTeachingclassIndexList();
			Long j = 0L;
			for (Map<Integer, Integer> teaclasses : teachingclassIndexList) {
				Set<Integer> subjectNum = teaclasses.keySet();
				for (Integer integer : subjectNum) {
					System.out.println(subjectNumberMap.get(integer) + "教学班" + teaclasses.get(integer) + "，教学班索引：" + j);
					Teaclass teaclass = new Teaclass();
					teaclass.setSubjectNum(integer);
					teaclass.setTeaclassId(j);
					teaclass.setTeaclassName(subjectNumberMap.get(integer) + teaclasses.get(integer));
					teaclassMapper.insert(teaclass);
				}
				j++;
			}
		}
	}

	/**
	 * 课表作业
	 * 
	 * @Title: sessionClassSchedule
	 * @Description:
	 * @Author pengdehe
	 * @DateTime 2019年11月12日 上午9:19:25
	 */
	@org.junit.Test
	public void sessionClassSchedule() {
		Object object = fifthResultService.getKeBiao();
		if (object instanceof StageTwoResultOfClassSchedule) {
			StageTwoResultOfClassSchedule schedule = (StageTwoResultOfClassSchedule) object;
			// 一周总节课次数*每节课上课的混合教学班，如总节课数位35，即有第0节到第34节，第0节课有n个混合班上课，混合班中分出具体科目教学班，
			// 即课知道该混合班对应的行政班这一节课包含的所有教学班，从而得出该行政班的课表
			List<List<Integer>> sessionClassSchedule = schedule.getSessionClassSchedule();
			int count = 0; // 技术遍历了多少节课
			// 每节课上课的混合教学班
			for (List<Integer> list : sessionClassSchedule) {
				int day = count / 7 + 1; // 计算第几天，1~5
				// 遍历混合教学班id集
				for (Integer mixId : list) {
					// 取得混合教学班
					MixadminExample mixadminExample = new MixadminExample();
					com.goclass.pojo.MixadminExample.Criteria criteria4 = mixadminExample.createCriteria();
					criteria4.andMixIdEqualTo(mixId.longValue());
					// 混合教学班和行政班是多对多的关系
					List<Mixadmin> mixAdminList = mixadminMapper.selectByExample(mixadminExample);
					for (Mixadmin mixadmin : mixAdminList) {
						if (mixadmin == null) {
							System.out.println("mixId:" + mixId + "不存在，跳过");
							continue;
						}
						// 对应行政班id
						Long adminId = mixadmin.getAdminId();
						// 拿到对应行政班的课表
						KebiaoExample example = new KebiaoExample();
						Criteria criteria = example.createCriteria();
						criteria.andAdminIdEqualTo(adminId);
						Kebiao kebiao = kebiaoMapper.selectByExample(example).get(0);
						System.out.println("课表id：" + kebiao.getSchedulId() + ", 行政班id：" + kebiao.getAdminId() + ", 课表："
								+ kebiao.getSchedul());

						/**
						 * 开始构造课表
						 */
						// 查询出该混合教学班中包含的教学班
						TeamixExample teaMixExample = new TeamixExample();
						com.goclass.pojo.TeamixExample.Criteria criteria2 = teaMixExample.createCriteria();
						criteria2.andMixIdEqualTo(mixId.longValue());
						List<Teamix> teamixList = teamixMapper.selectByExample(teaMixExample);
						System.out.println("混合教学班" + mixadmin.getMixId() + "的教学班集：" + teamixList.toString());
						// 获取当前行政班课表中这一节课的所有教学班
						List<DaySchedul> schTeaList;
						if (kebiao.getSchedul() == null || kebiao.getSchedul().length() == 0
								|| JSON.parseArray(kebiao.getSchedul(), DaySchedul.class).size() == 0) {
							schTeaList = new ArrayList<>();
							for (int i = 0; i < 5; i++) {
								schTeaList.add(new DaySchedul());
							}
							System.out.println("new list " + schTeaList.size());
						} else {
							schTeaList = JSON.parseArray(kebiao.getSchedul(), DaySchedul.class);
						}
						System.out.println("当前行政班课表中这一节课的所有教学班:" + schTeaList.toString());
						// 获取第day天的课表
						DaySchedul daySchedul = schTeaList.get(day - 1);
						daySchedul.setDayId(day);
						// 先移除出列表，后面再加进去
						// schTeaList.remove(day - 1);
						// 获取这天的每一节课取上课的教学班名称，索引表示第几节课
						String[] teaClassNamesList = daySchedul.getTeaClassNamesList();
						// 判断schTeaList中是否已经包含下面的教学班，没有则添加进去，否则不添加
						for (Teamix teamix : teamixList) {
							TeaclassExample teaclassExample = new TeaclassExample();
							com.goclass.pojo.TeaclassExample.Criteria criteria3 = teaclassExample.createCriteria();
							criteria3.andTeaclassIdEqualTo(teamix.getTeaclassId());
							Teaclass teaclass = teaclassMapper.selectByExample(teaclassExample).get(0);
							System.out.println("教学班：" + teaclass.getTeaclassName());
							// 根据count对7取模得出当前是第几节课
							int i = count % 7;
							// 判断该节课是否已包含这个教学班，没有则加入
							teaClassNamesList[i] = teaClassNamesList[i] == null ? "" : teaClassNamesList[i];
							if (!teaClassNamesList[i].contains(teaclass.getTeaclassName())) {
								teaClassNamesList[i] += teaclass.getTeaclassName();
							}
						}
						// 更新这一天的课表
						daySchedul.setTeaClassNamesList(teaClassNamesList);
						// schTeaList.add(day - 1, daySchedul);
						// 重新设置课表
						kebiao.setSchedul(JSON.toJSONString(schTeaList));
						System.out.println("更新后，课表id：" + kebiao.getSchedulId() + ", 行政班id：" + kebiao.getAdminId()
								+ ", 课表：" + kebiao.getSchedul());
						// 更新到数据库
						kebiaoMapper.updateByPrimaryKey(kebiao);

					}
				}
				count++;
			}
			System.out.println("排课结束。。。。。。");
		}
	}

	@org.junit.Test
	public void dowork() {
		Object keBiao = fifthResultService.getKeBiao();
		if (keBiao instanceof StageTwoResultOfClassSchedule) {
			StageTwoResultOfClassSchedule schedule = (StageTwoResultOfClassSchedule) keBiao;
			System.out.println(schedule.toString());

			List<List<Integer>> sessionClassSchedule = schedule.getSessionClassSchedule();
			int i = 0;
			for (List<Integer> list : sessionClassSchedule) {
				System.out.println("第" + i + "节课上课的混合教学班：" + list.toString());
				i++;
			}

			System.out.println("===================================================================");
			List<List<List<Integer>>> dayAdminclassClassSchedule = schedule.getDayAdminclassClassSchedule();
			int day = 0;
			for (List<List<Integer>> days : dayAdminclassClassSchedule) {
				int admin = 0;
				for (List<Integer> admins : days) {
					System.out.println("第" + day + "天，第" + admin + "个行政班中包含的教学班：" + admins.toString());
					admin++;
				}
				day++;
			}
		}
	}

	@org.junit.Test
	public void test() {
<<<<<<< HEAD
		// ResultOfClassScheduleCreateTask createTaskForClassSchedule =
		// keBiaoService.createTaskForClassSchedule(null, 0);
		// System.out.println(createTaskForClassSchedule.toString());
		// int taskId = createTaskForClassSchedule.getTaskId();
		// ResultOfClassScheduleRunTask runTaskForClassSchedule =
		// keBiaoService.runTaskForClassSchedule(9, 2);
		// System.out.println(runTaskForClassSchedule.toString());
		ResultOfClassScheduleGetTasksStatus tasksStatusForClassSchedule = keBiaoService
				.getTasksStatusForClassSchedule();
		Map<Integer, Short> tasksStatusMap = tasksStatusForClassSchedule.getTasksStatusMap();
		Set<Integer> keySet = tasksStatusMap.keySet();
		for (Integer integer : keySet) {
			System.out.println("taskId:" + integer + ", status:" + tasksStatusMap.get(integer));
			ResultOfClassScheduleGetTaskResult taskResultForClassSchedule = keBiaoService
					.getTaskResultForClassSchedule(integer, 2);
			System.out.println(taskResultForClassSchedule.toString());
			fifthResultService.setKeBiao(taskResultForClassSchedule.getStageTwoResultOfClassSchedule());
			// if (tasksStatusMap.get(integer) == 1) {
			// ResultOfClassScheduleStopTask stop = keBiaoService.stop(integer);
			// System.out.println("taskId:" + integer + ", stop status:" +
			// stop.getStatusCode());
			// ResultOfClassScheduleDelTask delTaskForClassSchedule =
			// keBiaoService.delTaskForClassSchedule(integer);
			// System.out.println("taskId:" + integer + ", del status:" +
			// delTaskForClassSchedule.getStatusCode());
			// }
		}
		Map<Integer, Short> tasksStageMap = tasksStatusForClassSchedule.getTasksStageMap();
		Set<Integer> keySet2 = tasksStageMap.keySet();
		for (Integer integer : keySet2) {
			System.out.println("taskId:" + integer + ", stage:" + tasksStageMap.get(integer));
		}
		// ResultOfClassScheduleRunTask runTaskForClassSchedule =
		// keBiaoService.runTaskForClassSchedule(7, 2);
		// System.out.println();
		// ResultOfClassScheduleGetTaskResult taskResultForClassSchedule =
		// keBiaoService.getTaskResultForClassSchedule(7, 2);
		// System.out.println(taskResultForClassSchedule.toString());
=======
		StageFiveData stageFiveData = (StageFiveData)fifthResultService.findOne();
		StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = new StageFiveResultOfClassStrategy();
		stageFiveResultOfClassStrategy.setAdminclassList(stageFiveData.getAdminclassList());
		stageFiveResultOfClassStrategy.setAdminclassMixteachingclassList(stageFiveData.getAdminclassMixteachingclassList());
		stageFiveResultOfClassStrategy.setMixteachingclassAdminclassesList(stageFiveData.getMixteachingclassAdminclassesList());
		stageFiveResultOfClassStrategy.setMixteachingclassList(stageFiveData.getMixteachingclassList());
		stageFiveResultOfClassStrategy.setSubjectDict(stageFiveData.getSubjectDict());
		stageFiveResultOfClassStrategy.setTeachingclassIndexList(stageFiveData.getTeachingclassIndexList());
		stageFiveResultOfClassStrategy.setTeachingclassList(stageFiveData.getTeachingclassList());
		
		System.out.println(stageFiveResultOfClassStrategy.toString());
>>>>>>> 9cccb039f5942c4e26fd0138a2b17a1a47e60d1b
	}
}
