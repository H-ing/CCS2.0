package com.web.model.global.entity;

import java.util.List;

import lombok.Data;

/**
 * 某天的意愿
 * @author Administrator
 *
 */
@Data
public class TeacherWillTimeItem {
	/**
	 * 时间序号，表示星期一到星期五，0~4
	 */
	private Integer dateOrder;
	/**
	 * 当天全部课时的意愿列表
	 */
	private List<TeacherWillTimeItemDetial> itemDetials;
}
