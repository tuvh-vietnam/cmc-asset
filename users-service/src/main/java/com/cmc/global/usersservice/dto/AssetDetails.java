package com.cmc.global.usersservice.dto;

import lombok.Data;

@Data
public class AssetDetails {
    private Integer id;
    private String type;
    private String assetCode;
    private String assetName;
    private String description;
    private UsersVO user;
    private DepartmentVO department;

}
