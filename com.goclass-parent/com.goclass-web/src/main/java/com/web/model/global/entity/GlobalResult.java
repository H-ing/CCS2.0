package com.web.model.global.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 
 * @ClassName: GlobalResult
 * @Description: 定义全局返回结果
 * @Author pengdehe
 * @DateTime 2019年11月3日 上午10:19:26
 */
@Data
@ApiModel(description = "全局结果信息描述")
public class GlobalResult {
	/**
	 * 请求结果状态码，-1表示请求失败，200表示请求成功
	 */
	@ApiModelProperty(position = 0)
	private String code;
	@ApiModelProperty(position = 1)
	private String msg;
	@ApiModelProperty(position = 2)
	private Object date;
	
	public GlobalResult(String code, String msg, Object date) {
		this.code = code;
		this.msg = msg;
		this.date = date;
	}
	
	public GlobalResult(String msg, Object date) {
		this("200", msg, date);
	}
	
	public GlobalResult(Object date) {
		this("200", "success", date);
	}
	
	public static GlobalResult failResult() {
		return new GlobalResult("-1", "fail", null);
	}
	
	public static GlobalResult successResult(Object object) {
		return new GlobalResult("200", "success", object);
	}
}
