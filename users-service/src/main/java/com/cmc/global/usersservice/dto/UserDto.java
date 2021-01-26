package com.cmc.global.usersservice.dto;

import java.util.List;

import com.cmc.global.usersservice.model.Users;

import lombok.Value;

@Value
public class UserDto {
    private List<Users> items;
}
