package com.cmc.global.usersservice.dto;

import lombok.Data;

@Data
public class UsersVO {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String userscol;
}
