package com.cmc.global.asset.gateway.dto;

import java.util.ArrayList;
import java.util.List;

public class Assets {

    List<AssetsDto> items = new ArrayList<>();

    public List<AssetsDto> getItems() {
        return items;
    }

    public void setItems(List<AssetsDto> items) {
        this.items = items;
    }

}
