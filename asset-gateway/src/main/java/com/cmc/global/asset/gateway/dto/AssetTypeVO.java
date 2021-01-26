package com.cmc.global.asset.gateway.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class AssetTypeVO {

    private Integer id;
    private String name;
    private String description;
}
