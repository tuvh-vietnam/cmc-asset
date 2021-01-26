package com.cmc.global.asset.gateway.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsersVO {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private String userscol;

}
