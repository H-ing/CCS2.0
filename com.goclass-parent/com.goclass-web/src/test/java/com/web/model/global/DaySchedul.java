package com.web.model.global;

import java.util.List;

import lombok.Data;

@Data
public class DaySchedul {
	/**
	 * 第几天，1~5
	 */
	private Integer dayId;
	/**
	 * 第几节课需上课教学班的名字，如第一个元素表示第一节课，"地0政0物0"表示需要上课的教学班,长度位7
	 */
	private String[] teaClassNamesList = new String[7];
}
