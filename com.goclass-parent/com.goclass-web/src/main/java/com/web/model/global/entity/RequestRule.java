package com.web.model.global.entity;

import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * 排课规则pojo
 * @author Administrator
 *
 */
@Data
public class RequestRule {
	private Map<Integer, Short>  subjectSubjectcount;//{科目代码：接次数} 每个科目每周的节次 0
	private List<Short> onedaySession;//一天的节次 例子[0,1,2,3,4,5,6]    一天七节 0
	private List<List<Integer>> positiveClassSchedule;//一个星期总节数*n  固排课表    把需要固排的“混合教学班索引”放到对应的节次 0
	private List<List<Integer>> negativeClassSchedule;//一个星期总节数*n  禁排课表    把需要禁排的“混合教学班索引”放到对应的节次  不用上课的节次放入-1 0
	private List<List<Integer>> connectClass;//连排条目数*连排单元 连排单元：  [星期几（0开始）,混合教学班索引,连排数] 0
}
