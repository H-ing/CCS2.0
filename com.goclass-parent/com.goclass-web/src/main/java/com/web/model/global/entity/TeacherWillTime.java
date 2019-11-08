package com.web.model.global.entity;

import java.util.List;

import lombok.Data;

/**
 * 教室上课时间申请实体
 * @author Administrator
 *
 */
@Data
public class TeacherWillTime {
	/**
	 * 教师id
	 */
	private Long teacherId;
	/**
	 * 教师名称
	 */
	private String teacherName;
	/**
	 * 一个星期的意愿列表
	 */
	private List<TeacherWillTimeItem> items;
}
