package com.web.model.global.entity;

import lombok.Data;

/**
 * 某天中某节课的意愿
 * @author Administrator
 *
 */
@Data
public class TeacherWillTimeItemDetial {
	/**
	 * 课时序号，即第几节课，0~n
	 */
	private Integer courseOrder;
	/**
	 * 意愿，表示是否愿意上课，0愿意，1不愿意
	 */
	private Integer will;
}
