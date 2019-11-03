package com.web.model.global.entity;

public class NotLogin {
	private static final String code = "403";
	private static final String msg = "跨域失败！";
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
}
