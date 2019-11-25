package com.web.model.global;

import java.util.List;

import lombok.Data;

@Data
public class KeBiao {
	/**
	 * 课表id
	 */
	private Long id;
	/**
	 * 行政班id
	 */
	private Long adminClassId;
	/**
	 * 课表
	 */
	private List<DaySchedul> scheduls;
}
