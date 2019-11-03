package com.web.model.global.exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "异常信息描述")
public class GlobalException {
	@ApiModelProperty(position = 0)
	private String code;
	@ApiModelProperty(position = 1)
	private String msg;
	@ApiModelProperty(position = 2)
	private Object date;
	public GlobalException(String code, String msg, Object date) {
		super();
		this.code = code;
		this.msg = msg;
		this.date = date;
	}
	
	
}
