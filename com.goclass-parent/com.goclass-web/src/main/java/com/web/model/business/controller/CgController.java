package com.web.model.business.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goclass.mapper.PopulationMapper;
import com.web.model.cg.bean.CreateTaskBean;
import com.web.model.cg.bean.ServerMessageBean;
import com.web.model.global.utils.CreateTaskTransform;
import goclass.rpc.server.call.PropertyCopyTool;
import goclass.rpc.server.source.ClassStrategyRule;
import goclass.rpc.server.source.ResultOfClassStrategyCreateTask;
import goclass.rpc.server.source.ResultOfClassStrategyDelTask;
import goclass.rpc.server.source.ResultOfClassStrategyGetTaskResult;
import goclass.rpc.server.source.ResultOfClassStrategyGetTasksStatus;
import goclass.rpc.server.source.ResultOfClassStrategyRunTask;
import goclass.rpc.server.source.ResultOfGetClassStrategyRule;
import goclass.rpc.server.source.StageFiveResultOfClassStrategy;
import goclass.rpc.server.source.StageFourResultOfClassStrategy;
import goclass.rpc.server.source.StageOneResultOfClassStrategy;
import goclass.rpc.server.source.StageThreeResultOfClassStrategy;
import goclass.rpc.server.source.StageTwoResultOfClassStrategy;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import goclass.rpc.server.call.CallingTool;
@RestController
@RequestMapping("/api/admin")
@Api(tags = "分班管理")
@RequiresRoles(value = {"db_admin", "admin"}, logical = Logical.OR)
@CrossOrigin
public class CgController {
	CallingTool globalCallingTool = new CallingTool();
	
	@Autowired
    StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	PopulationMapper population;

	@ApiOperation("获取科目教师人数，各组合学生人数")
	@RequestMapping(value = "/class/grouping/data",method = RequestMethod.GET)
	public Map<String, String> searchNumberOfTeacherOrStudent(
			@RequestParam(value = "object") String object) {
		Map<String, String> number = new HashMap<>();
		number.put("1", "人数");
		int sumOfPeoples = 0 , tempData = 0;
		CreateTaskTransform transformTool = new CreateTaskTransform();
		if (object.equals("teacher")){
			Short[] subjectList = transformTool.getSubjectCodeList();
			for(Short temp:subjectList) {
				tempData = population.selectNumberOfTeacherBySubjectId(temp);
				number.put(temp+"",tempData+"");
				sumOfPeoples += tempData;
			}
		}else if (object.equals("student")){
			Short[] sectionStudentNumberTransform= transformTool.getSectionStudentNumberTransform();
			for(Short temp:sectionStudentNumberTransform) {
				tempData = population.selectNumberOfStudentByCombinationId(temp);
				number.put(temp+"",tempData+"");
				sumOfPeoples += tempData;
			}
		}else {
			return null;
		}
		number.put("sum", sumOfPeoples + "");
		System.out.println(number.toString());
		return number;
	}
	
	@ApiOperation("创建分班任务")
	@RequestMapping(value = "/class/grouping/createtask" , method = RequestMethod.POST)
	public ResultOfClassStrategyCreateTask createTask(
			@RequestBody CreateTaskBean createTaskData) {
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
			PropertyCopyTool.Copy(globalCallingTool.createTaskForClassStrategy(classStrategyRule), returnMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("复制失败");
			e.printStackTrace();
		}
		return returnMessage;
	}
	
	@ApiOperation("运行分班任务")
	@RequestMapping(value = "/class/grouping/runtask" , method = RequestMethod.POST)
	public ResultOfClassStrategyRunTask runTask(
			@RequestParam(value = "taskId") int taskId,
			@RequestParam(value = "stage") int stage){
    	ResultOfClassStrategyRunTask returnMessage = new ResultOfClassStrategyRunTask();
    	try {
			PropertyCopyTool.Copy(globalCallingTool.runTaskForClassStrategy(taskId, stage), returnMessage);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("复制失败");
			e.printStackTrace();
		}
		return returnMessage;
	}
	
	
	@ApiOperation("获取现有任务及其运行情况")
	@RequestMapping(value = "/class/grouping/taskstatus" , method = RequestMethod.GET)
	public ResultOfClassStrategyGetTasksStatus getTasksStatusForClassStrategy() {
    	ResultOfClassStrategyGetTasksStatus returnMessage = new ResultOfClassStrategyGetTasksStatus();
    	try {
			PropertyCopyTool.Copy(globalCallingTool.getTasksStatusForClassStrategy(), returnMessage);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("复制失败");
			e.printStackTrace();
		}
		return returnMessage;
	}
	
	@RequestMapping(value = "/class/grouping/unhandle" , method = RequestMethod.GET)
	public Map getUnhandleData(
			@RequestParam(value = "taskId") int taskId,
			@RequestParam(value = "stage") int stage) {
		ResultOfClassStrategyGetTaskResult result = globalCallingTool.getTaskResultForClassStrategy(
				taskId, stage);
		Map returnMessage = new HashMap<>();
		if (stage==1) {
			returnMessage.put("data", result.getStageOneResultOfClassStrategy());
		}else if(stage==2){
			returnMessage.put("data", result.getStageTwoResultOfClassStrategy());
		}else if(stage==3) {
			returnMessage.put("data", result.getStageThreeResultOfClassStrategy());
		}else if(stage==4) {
			returnMessage.put("data", result.getStageFourResultOfClassStrategy());
		}else {
			returnMessage.put("data", result.getStageFiveResultOfClassStrategy());
		}
		return returnMessage;
	}
	
	@ApiOperation("获取任务结果")
	@RequestMapping(value = "/class/grouping/result" , method = RequestMethod.GET)
	public Map getTaskResultForClassStrategy(
			@RequestParam(value = "taskId") int taskId,
			@RequestParam(value = "stage") int stage,
			@RequestParam(value = "distribution") int distribution
			) {
		ResultOfClassStrategyGetTaskResult result = globalCallingTool.getTaskResultForClassStrategy(
				taskId, stage);
		Map<String, String> subjectMapTool = CreateTaskTransform.getSubjectSelectionStringMap();
		if(result==null) {
			Map<String, String> returnMessage = new HashMap<String, String>() {{
				put("message","远程调用出现错误");
			}};
			return returnMessage;
		}
//		System.out.println("返回结果"+result.message);
		if (result.getMessage().equals("ok")) {
			// 第一阶段
			if (stage==1) {
				// 生成结果表 数据处理
				StageOneResultOfClassStrategy stageOneResultOfClassStrategy = 
						result.getStageOneResultOfClassStrategy();	
				
				List<List<List<Integer>>> walkingclassCombinationSolution = 
						stageOneResultOfClassStrategy.getWalkingclassCombinationSolution();
				List<List<List<Integer>>> walkingclassCombinationSelection = 
						stageOneResultOfClassStrategy.getWalkingclassCombinationSelection();
				Map<String, List> totalTable = new HashMap<>();
				List<Map> groupTable = new ArrayList<>();
				Map subjectTable = new LinkedHashMap<>();
				
				int i = 0,j = 0,k = 0;
				for(;i<walkingclassCombinationSolution.get(0).size();i++) {
					for(;j<walkingclassCombinationSolution.size();j++) {
						for(;k<walkingclassCombinationSolution.get(j).get(i).size();k++) {
							subjectTable.put("comColumn",subjectMapTool.get(walkingclassCombinationSelection.get(j).get(i).get(k)+""));
							subjectTable.put("numColumn", walkingclassCombinationSolution.get(j).get(i).get(k)+"");
							subjectTable.put("edit", false);
							
							Map temp = new HashMap<>();
							temp.putAll(subjectTable);
							groupTable.add(temp);
							subjectTable.clear();
						}
						k = 0;
					}
					j = 0;
					List<Map> tempGroup = new ArrayList<>();
					tempGroup.addAll(groupTable);
					totalTable.put("第"+(i+1)+"组",tempGroup);
					
					groupTable.clear();
				}
				//评分表 数据格式处理
				List<List<Double>> walkingclassCombinationStudentAverageNumner = 
						stageOneResultOfClassStrategy.getWalkingclassCombinationStudentAverageNumner();
				List<List<Integer>> walkingclassCombinationClassNumber = 
						stageOneResultOfClassStrategy.getWalkingclassCombinationClassNumber();
				List<Integer> minClassNumber = 
						stageOneResultOfClassStrategy.getMinClassNumber();
				List<Integer> walkingclassSubject = 
						stageOneResultOfClassStrategy.getWalkingclassSubject();
				
				List<Map> resultTable = new ArrayList<>();
				Map<String, String> subjectResult = new LinkedHashMap<>();
				Map<String,Double> sumOfSubjectClassNumber = new HashMap<>();
				//化学 生物 地理 政治  4,8,16,32
				sumOfSubjectClassNumber.put("32", 0.0);
				sumOfSubjectClassNumber.put("16", 0.0);
				sumOfSubjectClassNumber.put("4", 0.0);
				sumOfSubjectClassNumber.put("8", 0.0);
				int groupNumber = 0,q = 0, subjectCode = 0;
				for(;groupNumber<walkingclassCombinationStudentAverageNumner.size();groupNumber++) {
					subjectResult.put("group", "第"+groupNumber+"组");
					for(;q<walkingclassSubject.size();q++) {
						subjectCode = walkingclassSubject.get(q);
						sumOfSubjectClassNumber.put(subjectCode + ""
								, sumOfSubjectClassNumber.get(subjectCode+"") + 
								walkingclassCombinationClassNumber.get(groupNumber).get(q));
						subjectResult.put(walkingclassSubject.get(q)+"", 
								walkingclassCombinationStudentAverageNumner.get(groupNumber).get(q)+"/" + 
										walkingclassCombinationClassNumber.get(groupNumber).get(q));
//						System.out.println("after");
					}
					
					Map<String, String> temp = new HashMap<>();
					
					temp.putAll(subjectResult);
					
					resultTable.add(temp);
					subjectResult.clear();
					q = 0;
					
				}
				
				resultTable.add(sumOfSubjectClassNumber);
				Map returnMessage = new HashMap<>();
				returnMessage.put("resultData", totalTable);
				returnMessage.put("minClassNumber", minClassNumber);
				returnMessage.put("scoreTable", resultTable);
				System.out.println(returnMessage);
				return returnMessage;
			}
		 else if(stage==2){
			// 第二阶段
			
			 	
			 	StageTwoResultOfClassStrategy stageTwoResultOfClassStrategy =
			 			result.getStageTwoResultOfClassStrategy();
			 	//评分数据获取
			 	List<List<Double>> walkingclassHPStudentAverageNumber = 
			 			stageTwoResultOfClassStrategy.getWalkingclassHPStudentAverageNumber();
			 	List<List<Integer>> walkingclassHPClassNumber = 
			 			stageTwoResultOfClassStrategy.getWalkingclassHPClassNumber();
			 	List<Integer> minClassNumber = 
			 			stageTwoResultOfClassStrategy.getMinClassNumber();
			 	// 评分数据处理
			 	List twoStageScoreData = new ArrayList<>();
			 	Map<String, String> scoreData = new HashMap<>();
			 	int groupNumber = 0 ;
			 	for(;groupNumber<walkingclassHPClassNumber.get(0).size();groupNumber++) {
			 		scoreData.put("group","第"+groupNumber+"组" );
			 		scoreData.put("history", walkingclassHPStudentAverageNumber.get(0).get(groupNumber)
			 				+"/"+walkingclassHPClassNumber.get(0).get(groupNumber));
			 		scoreData.put("physics", walkingclassHPStudentAverageNumber.get(1).get(groupNumber)
			 				+"/"+walkingclassHPClassNumber.get(1).get(groupNumber));
			 		//对象复制
			 		Map temp = new HashMap<>();
			 		temp.putAll(scoreData);
			 		twoStageScoreData.add(temp);
			 		scoreData.clear();
			 	}
			 	
			 	// 结果数据获取
			 	List<List<List<List<Integer>>>> walkingclassHPSolution = 
			 			stageTwoResultOfClassStrategy.getWalkingclassHPSolution();
			 	List<List<List<Integer>>> walkingclassCombinationSelection = 
			 			stageTwoResultOfClassStrategy.getWalkingclassCombinationSelection();
			 	
			 	// 结果数据处理
			 	List<Map> twoStageResultData = new ArrayList<>();
			 	Map<Integer, String> jsonKeyMap = new HashMap<>();
			 	jsonKeyMap.put(1, "firstGroup");
			 	jsonKeyMap.put(2, "secondGroup");
			 	jsonKeyMap.put(3, "thirdGroup");
			 	Map<String, Map> lineData = new HashMap<>();
			 	Map groupData = new HashMap<>();
			 	//  2 3 2
			 	int j=0,k=0,q=0;
			 	try {
			 		for(;j<walkingclassHPSolution.get(0).size();j++) {
				 		for(;q<walkingclassHPSolution.get(0).get(j).get(0).size();q++) {
				 			for(;k<walkingclassHPSolution.get(0).get(j).size();k++) {
				 				groupData.put("group", subjectMapTool.get(walkingclassCombinationSelection.get(j).get(k).get(q)+""));
				 				groupData.put("hisNum",walkingclassHPSolution.get(0).get(j).get(k).get(q)+"" );
				 				groupData.put("phyNum",walkingclassHPSolution.get(1).get(j).get(k).get(q)+"" );
				 				groupData.put("edit", false);
				 				Map temp = new HashMap<>();
				 				temp.putAll(groupData);
				 				lineData.put(jsonKeyMap.get(k+1), temp);
				 				groupData.clear();
				 			}
				 			Map temp = new HashMap<>();
				 			temp.putAll(lineData);
				 			twoStageResultData.add(temp);
				 			lineData.clear();
				 			k = 0;
				 		}
				 		q = 0;
				 	}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println("J:"+j+"  K:"+k+"  Q:"+q+" size:"+walkingclassHPSolution.get(0).get(j).get(0).size());
				}
			 	Map returnMessage = new HashMap<>();
			 	returnMessage.put("scoreData", twoStageScoreData);
			 	returnMessage.put("resultData", twoStageResultData);
			 	returnMessage.put("minClassNumber", minClassNumber);
			 	return returnMessage;
		 	}
		 else if(stage==3) {
			 // 第三阶段
			 StageThreeResultOfClassStrategy stageThreeResultOfClassStrategy = 
					 result.getStageThreeResultOfClassStrategy();
			 // 初步结果 数据获取
			 List<List<List<Map<Short, Short>>>> adminclassSolution = 
					 stageThreeResultOfClassStrategy.getAdminclassSolution();
			 // 数据处理
			 List<Map> tableClassData = new ArrayList<>();
			 Map groupDataMap = new HashMap<>();
			 List<Map> classData = new ArrayList<>();
			 Map studentNumberMap = new HashMap<>();
			 
			 int groupNumber=0,type=0,sumOfSubject=0,counter=0;
			 List<Short> subjectCodeList = Arrays.asList(new CreateTaskTransform().getSectionStudentNumberTransform());
//			 Map<Short, Short> numberOfEachSubjectInClass = new HashMap<>();
			 for(;groupNumber<adminclassSolution.size();groupNumber++) {
				 for(;type<adminclassSolution.get(groupNumber).size();type++) {
//					 System.out.println(adminclassSolution.get(groupNumber).get(type));
					 for(Map<Short, Short> numberOfEachSubjectInClass:adminclassSolution.get(groupNumber).get(type)) {
						 studentNumberMap.put("group", type+"-"+counter);
						 for(Short code:subjectCodeList) {
							 if(!numberOfEachSubjectInClass.containsKey(code)) {
								 studentNumberMap.put("c"+code, 0);
							 }
						 }
						 for(Map.Entry<Short, Short> subjectEntry:numberOfEachSubjectInClass.entrySet()) {
							 studentNumberMap.put("c"+subjectEntry.getKey(), subjectEntry.getValue());
							 sumOfSubject += subjectEntry.getValue();
						 }
						 
						 studentNumberMap.put("total", sumOfSubject);
						 Map tempMap = new HashMap<>();
						 tempMap.putAll(studentNumberMap);
						 classData.add(tempMap);
						 studentNumberMap.clear();
						 sumOfSubject = 0;
						 counter++; 
					 }
				 }
				 
				 counter=0;
				 groupDataMap.put("title", "第"+groupNumber+"组");
				 groupDataMap.put("name", groupNumber+2+"");
				 List<Map> tempList = new ArrayList<>();
				 tempList.addAll(classData);
				 groupDataMap.put("Group", tempList);
				 Map tempMap = new HashMap<>();
				 tempMap.putAll(groupDataMap);
				 tableClassData.add(tempMap);
				 groupDataMap.clear();
				 classData.clear();
				 type = 0;
			 }
			 
			 // 评分数据获取
			 List<List<Double>> walkingclassStudentAverageNumber = 
					 stageThreeResultOfClassStrategy.getWalkingclassStudentAverageNumber();
			 List<List<Short>> walkingClassNumber = 
					 stageThreeResultOfClassStrategy.getWalkingClassNumber();
			 List<Short> subjectList = 
					 stageThreeResultOfClassStrategy.getSubjectList();
			 List<Short> isHPMix = 
					 stageThreeResultOfClassStrategy.getIsHPMix();
			 
			 List<Map> threeStageScoreData = new ArrayList<>();
			 Map<String, String> groupData = new HashMap<>();
			 int groupNum = 0 , subjectNum = 0;
			 for(;groupNum<walkingclassStudentAverageNumber.size();groupNum++) {
				 groupData.put("group",groupNum+"");
				 for(;subjectNum<walkingclassStudentAverageNumber.get(groupNum).size();subjectNum++) {
					 groupData.put(subjectList.get(subjectNum)+"", 
							 walkingClassNumber.get(groupNum).get(subjectNum)+"/"+ 
									 walkingclassStudentAverageNumber.get(groupNum).get(subjectNum));
				 }
				 groupData.put("isHPMix", isHPMix.get(groupNum)+"");
				 Map tempMap = new HashMap<>();
				 tempMap.putAll(groupData);
				 threeStageScoreData.add(tempMap);
				 groupData.clear();
				 subjectNum = 0;
			 }
			 
			 
			 Map returnMessage = new HashMap<>();
			 returnMessage.put("tableClassData", tableClassData);
			 returnMessage.put("threeStageScoreData", threeStageScoreData);
			 return returnMessage;
		 }
		 else if (stage==4) {
			 // 第四阶段
			 StageFourResultOfClassStrategy stageFourResultOfClassStrategy = 
					 result.getStageFourResultOfClassStrategy();
			 // 数据获取
			 
			 //       {科目:(每科教学班数*{科目组合：<学生集>})}
			 Map<Integer, List<Map<Integer, Set<Integer>>>> subjectTeachingclass = 
					 stageFourResultOfClassStrategy.getSubjectTeachingclass();
			 
			 //      组*{科目：[教学班索引]} 每一组中每个科目的教学班的索引
			 List<Map<Integer, List<Integer>>> groupTeachingclassIndex = 
					 stageFourResultOfClassStrategy.getGroupTeachingclassIndex();
			 //处理数据
			 List<Map> fourStageScoreData = new ArrayList<>();
			 //每组的数据
			 Map groupClassDataMap = new HashMap<>();
			 //该组下的教学班
			 List<Map> group = new ArrayList<>();
			 Map<String, String> subjectStudentMap = new HashMap<>();
			 //   {科目编号 ： 对应的中文}
			 Map<String, String> subjectStringMap = CreateTaskTransform.getSubjectSelectionStringMap();
			 Short[] subjectSet = CreateTaskTransform.getSectionStudentNumberTransform();
			 int groupNumber = 0;
			 //   		第几组的数据
			 for(;groupNumber<groupTeachingclassIndex.size();groupNumber++) {
				 groupClassDataMap.put("title", "组"+(groupNumber+1));
				 groupClassDataMap.put("name", groupNumber+1);
				 // 	 		科目编号：[教学班索引]
				 for(Map.Entry<Integer, List<Integer>> eachGroupSubject:
					 groupTeachingclassIndex.get(groupNumber).entrySet()) {
					 		// (教学班索引)
					 List<Integer> teachingClass = eachGroupSubject.getValue();
					 
					 
					 //    获取该科目的教学班
					 List<Map<Integer, Set<Integer>>> teachingClassList = 
							 subjectTeachingclass.get(eachGroupSubject.getKey());
					 //  i : 教学班索引
					 for (int i = 0; i < teachingClass.size(); i++) {
						 subjectStudentMap.put("group", subjectStringMap.get(""+eachGroupSubject.getKey())+"-"
								 +teachingClass.get(i));
						 for (int j = 0; j < subjectSet.length; j++) {
//							if(!teachingClassList.get(teachingClass.get(i)).containsKey(subjectSet[j])) {
							subjectStudentMap.put("c"+subjectSet[j], ""+0);
//							}
						}
						 //   <科目组合  ： 学生合集>
						 for(Map.Entry<Integer, Set<Integer>> eachSelectionStudent : subjectTeachingclass.get(eachGroupSubject.getKey()).get(i).entrySet()) {
							 subjectStudentMap.put("c"+ eachSelectionStudent.getKey(), ""+eachSelectionStudent.getValue().size());
						 }
						 Map<String, String> tempMap = new HashMap<>();
						 tempMap.putAll(subjectStudentMap);
						 group.add(tempMap);
						 subjectStudentMap.clear();
					}
					 
				 }
				 List<Map> temList = new ArrayList<>();
				 temList.addAll(group);
				 groupClassDataMap.put("Group", temList);
				 group.clear();
				 Map tempMaps = new HashMap<>();
				 tempMaps.putAll(groupClassDataMap);
				 fourStageScoreData.add(tempMaps);
				 groupClassDataMap.clear();
			 }
			 Map returnMessage = new HashMap<>();
			 returnMessage.put("fourStageScoreData", fourStageScoreData);
			 return returnMessage;
		 } else if(stage==5 && distribution==0) {
			 //第五阶段
			 // 分配学生
			 StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = 
					 result.getStageFiveResultOfClassStrategy();

			 List<Map<Integer, List<Integer>>> adminclassList = 
					 stageFiveResultOfClassStrategy.getAdminclassList();
			 //每种组合的学生的具体信息
			 //<组合代码 ： 列表[学生具体信息]>
			 Map<Integer,List<Map>> studentSetForEachSelection = 
					 new HashMap<>();
			 Short[] sectionStudentNumberTransform = 
					 CreateTaskTransform.getSectionStudentNumberTransform();
			 for(int i=0;i<sectionStudentNumberTransform.length;i++) {
				 List<Map> tempList = new ArrayList<>();
				 tempList.addAll(population.selectStudentBySection(sectionStudentNumberTransform[i]));
				 studentSetForEachSelection.put(Integer.valueOf(sectionStudentNumberTransform[i]), tempList);
			 }
			 //获取每个行政班 每种选课组合需要多少的学生
			 		//[行政班数<科目组合代码: 学生人数>]
			 List<Map<Integer, Integer>> adminClass = new ArrayList<>();
			 Map<Integer, Integer> adminClassDistribution = new HashMap<>();
			 
			 for(int adminClassNumber=0;adminClassNumber<adminclassList.size();adminClassNumber++) {
				 //			<科目组合代码：学生集>
				 for(Map.Entry<Integer,List<Integer>> adClass : adminclassList.get(adminClassNumber).entrySet()){
					 adminClassDistribution.put(adClass.getKey(), adClass.getValue().size());
				 }
				 Map<Integer, Integer> cloneTempMap = new HashMap<>();
				 cloneTempMap.putAll(adminClassDistribution);
				 adminClass.add(cloneTempMap);
				 adminClassDistribution.clear();
			 }
//			 System.out.println(adminClass);
			 //学生数据:   每个科目组合:{编号:学生数据}
			 Map<String,Map<String, String>> studentDataMap = new HashMap<>();
			 for (int i = 0; i < sectionStudentNumberTransform.length; i++) {
				 Map<String, String> tempMap = new HashMap<>();
				 studentDataMap.put(sectionStudentNumberTransform[i]+"", tempMap);
			}
//			 Map<String, Map> selectionStudentDetail = new HashMap<>();
			 //填入数据
			 List<Map> studentDetailInfo = new ArrayList<>();
			 // 数据类型：Map<Integer, List<Map>>
			 Map classDetail = new LinkedHashMap<>();
			 Map<String, Map<Integer, List<Map>>> entireClass = new LinkedHashMap<>();
			 Map selectionMap = CreateTaskTransform.getSubjectSelectionStringMap();
			 int sumOfStudent=0;
			 // classNum: 行政班索引
			 for(int classNum=0;classNum<adminClass.size();classNum++) {
				 sumOfStudent = 0;
				 // classInfo.getKey(): 科目组合代码    classInfo.getValue(): 该班该科目组合的人数
				 for(Map.Entry<Integer,Integer> classInfo : adminClass.get(classNum).entrySet()) {
					 Random random = new Random();
					 
					 for(int studentNumber=0;studentNumber<classInfo.getValue();studentNumber++) {
						 if(studentSetForEachSelection.get(classInfo.getKey()).size()!=0) {
							int selector = random.nextInt(studentSetForEachSelection.get(classInfo.getKey()).size());
							studentDetailInfo.add(studentSetForEachSelection.get(classInfo.getKey()).get(selector));
							//与原数据对应
							studentDataMap.get(""+classInfo.getKey()).put( 
									""+adminclassList.get(classNum).get(classInfo.getKey()).get(0)
											, studentSetForEachSelection.get(classInfo.getKey()).get(selector).get("student_id")+"");
							studentSetForEachSelection.get(classInfo.getKey()).remove(selector);
							adminclassList.get(classNum).get(classInfo.getKey()).remove(0);
							sumOfStudent+=1;
						 }else {
							 studentNumber = classInfo.getValue();
						}
						 
					 }
					 List tempList = new ArrayList<>();
					 tempList.addAll(studentDetailInfo);
					 classDetail.put(selectionMap.get(classInfo.getKey()+""), tempList);
					 studentDetailInfo.clear();
				 }
				 
				 Map tempMap = new HashMap<>();
				 tempMap.putAll(classDetail);
				 tempMap.put("sum", sumOfStudent);
				 entireClass.put("高一"+(classNum+1)+"班", tempMap);
				 classDetail.clear();
			 }
//			 System.out.println("剩余学生"+studentSetForEachSelection);
//			 System.out.println("学生人数总和为:" + sumOfStudent);
			 //存储
			 for(Map.Entry<String, Map<String, String>> eachSubjectSelection : studentDataMap.entrySet()) {
				 //			<rpc结果索引，数据库学生信息id>
				 for(Map.Entry<String, String> eachStudent: eachSubjectSelection.getValue().entrySet()) {
					 stringRedisTemplate.boundHashOps(taskId+"_"+eachSubjectSelection.getKey()).put(eachStudent.getKey() 
							 ,eachStudent.getValue());
				 }
			 }
			 return entireClass;
		 } else if(stage==5 && distribution==1) {
			 //第六阶段 分教学班
			 StageFiveResultOfClassStrategy stageFiveResultOfClassStrategy = 
					 result.getStageFiveResultOfClassStrategy();
			//教学班*{科目组合代码:学生集}    每个教学班包含的科目组合学生集
			 List<Map<Integer, List<Integer>>> teachingclassList = 
					 stageFiveResultOfClassStrategy.getTeachingclassList();
			//教学班数*{科目代码:编号}      每个教学班对应的科目以及编号，通过科目：编号可确定教学班
			 List<Map<Integer, Integer>> teachingclassIndexList = 
					 stageFiveResultOfClassStrategy.getTeachingclassIndexList();
			 Short[] singleSubjectCode = CreateTaskTransform.getSubjectCodeList();
			 Map<String, String> subjectSelectionStringMap = CreateTaskTransform.getSubjectSelectionStringMap();
			 // <教学班名称: <属性含义:   科目组合代码：[学生信息] or 教学班课程>>
			 Map<String,Map<String, List>> teachingClassStudentInfo = new LinkedHashMap<>();
			 //获取sqlSession
//			 SqlSession sqlSession = new DataSourceConnection().getSqlSession();
//			 PopulationMapper population = sqlSession.getMapper(PopulationMapper.class);
			 for (int teachingClassNumber = 0; teachingClassNumber < teachingclassList.size(); teachingClassNumber++) {
				Map<String, List> teachingClassInfoMap = new HashMap<>();
				List<Map> studentInfoList = new ArrayList<>();
				List<String> subjectInfo = new ArrayList<>();
				// 获取学生集对应的学生信息<学生集>
				for(Map.Entry<Integer, List<Integer>> studentSet:teachingclassList.get(teachingClassNumber).entrySet()) {
					for (int studentIndex = 0; studentIndex < studentSet.getValue().size(); studentIndex++) {
//						System.out.println("可获取的值是："+stringRedisTemplate.boundHashOps(taskId+"_"+studentSet.getKey()).get(""+studentSet.getValue().get(studentIndex)));
//						System.out.println(stringRedisTemplate.boundHashOps(taskId+"_"+studentSet.getKey()).get(""+studentSet.getValue().get(studentIndex)));
						studentInfoList.add(
								population.selectStudentById(stringRedisTemplate.boundHashOps(taskId+"_"+studentSet.getKey()).get(""+studentSet.getValue().get(studentIndex)))
								);
						
					}
				}
				List<Map> tempList = new ArrayList<>();
				tempList.addAll(studentInfoList);
				teachingClassInfoMap.put("studentInfo", tempList);
				studentInfoList.clear();
				// 获取教学班对应的科目信息<教学班科目>
						//< 科目代码 , 编号>
				
				for(Map.Entry<Integer, Integer> teachingClassSubjectInfo: teachingclassIndexList.get(teachingClassNumber).entrySet()) {
					subjectInfo.add(subjectSelectionStringMap.get(teachingClassSubjectInfo.getKey()+"")+
							teachingClassSubjectInfo.getValue()+"班");
				}
				List<String> tempListSubject = new ArrayList<>();
				tempListSubject.addAll(subjectInfo);
				teachingClassInfoMap.put("subjectInfo", tempListSubject);
				subjectInfo.clear();
				teachingClassStudentInfo.put("教学"+(teachingClassNumber+1)+"班",teachingClassInfoMap);
			}
			 //混合教学班数据填入
			 //混合教学班数*所包含的教学班序号   每个混合教学班包含的教学班，教学班序号即teachingclass_list对应的索引
			 List<List<Integer>> mixteachingclassList = stageFiveResultOfClassStrategy.getMixteachingclassList();
			 //	{混合教学班名称：{字符串 学生信息/科目信息：对应的学生信息/科目信息}}
			 Map<String, Map> mixTeachingClassInfo = new LinkedHashMap<>();
			 for (int mixTeachingClassNumber = 0; mixTeachingClassNumber < mixteachingclassList.size(); mixTeachingClassNumber++) {
				 Map teachingClassMap = new HashMap<>();
				 for (int teachingClassNumber = 0; teachingClassNumber < mixteachingclassList.get(mixTeachingClassNumber).size(); teachingClassNumber++) {
					 teachingClassMap.put("教学"+(teachingClassNumber+1)+"班", 
							 teachingClassStudentInfo.get("教学"+(teachingClassNumber+1)+"班"));
				}
				 mixTeachingClassInfo.put("混合教学"+(mixTeachingClassNumber+1)+"班",teachingClassMap );
			}
			 System.out.println("混合教学班数量："+mixTeachingClassInfo.size());
			return teachingClassStudentInfo;
		 }
		}
		return null;
	}
	
	
	@ApiOperation("获取分班任务的现存规则")
	@RequestMapping(value = "/class/grouping/rule" , method = RequestMethod.GET)
	public ResultOfGetClassStrategyRule getClassStrategyRule(
			@RequestParam(value = "taskId") int taskId) {
		return globalCallingTool.getClassStrategyRule(taskId);
	}
	
	
	@ApiOperation("删除分班任务")
	@RequestMapping(value = "/class/grouping/delete" , method = RequestMethod.DELETE)
	public ResultOfClassStrategyDelTask delTaskForClassStrategy(
			@RequestParam(value = "taskId") int taskId
			) {
		return globalCallingTool.delTaskForClassStrategy(taskId);
	}
	
	@ApiOperation("测试 服务是否正常")
	@RequestMapping(value = "/test/ping", method = RequestMethod.GET)
	public ServerMessageBean serverTest() {
		ServerMessageBean returnMessage = new ServerMessageBean();
		//测试rpc是否能连接
		
		if(globalCallingTool.ping()){
			returnMessage.setRpcService("rpc server is OK");
		}else {
			returnMessage.setRpcService("fail to connect rpc server");
		}
		
		//测试数据源是否正常   待添加
		returnMessage.setDataSource("data source is OK");
		return returnMessage;
	}
}