package com.cmc.global.asset.gateway.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AssetsDto {

    private Integer id;
    private AssetTypeVO type;
    private String assetCode;
    private String assetName;
    private String description;
    private UsersVO user;
    private DepartmentVO department;

}
