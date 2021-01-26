package com.cmc.global.asset.gateway.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsersDto {
    private Integer id;

    private String name;

    private String email;

    private String password;

    private String userscol;

}
