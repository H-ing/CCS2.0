package com.web.model.global.entity;

import java.util.Date;

import lombok.Data;

@Data
public class LoginUser {
	private Long userId;
	
    private String username;
    
    private String accounts;

    private String roleName;

    private String status;
    
    private Date loginDate;
}
