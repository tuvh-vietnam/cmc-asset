package com.cmc.global.asset.gateway.application;

import com.cmc.global.asset.gateway.dto.AssetDetails;

import reactor.core.publisher.Flux;

public interface AssetsService {

    Flux<AssetDetails> getAssetList();

}
