package com.cmc.global.assetservice.dto;

import lombok.Value;

@Value
public class UsersVO {
	
	private Integer id;
    private String name;
    private String email;
    private String password;
    private String description;

}
