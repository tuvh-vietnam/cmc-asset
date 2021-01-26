package com.cmc.global.usersservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import static java.util.stream.Collectors.toList;

@Data
@RequiredArgsConstructor
public class UsersDetail {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private String userscol;
    private List<AssetDetails> assetDetails = new ArrayList<>();
    
    @JsonIgnore
    public List<Integer> getAssetIds() {
        return assetDetails.stream()
            .map(AssetDetails::getId)
            .collect(toList());
    }

}
