package com.cmc.global.assetservice.dto;

import java.util.List;

import com.cmc.global.assetservice.model.Assets;

public class AssetsDto {
    private List<Assets> items;
    
	public AssetsDto(List<Assets> items) {
		super();
		this.items = items;
	}

	public List<Assets> getItems() {
		return items;
	}

	public void setItems(List<Assets> items) {
		this.items = items;
	}

}
