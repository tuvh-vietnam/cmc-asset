/**
 * @author: vhtu1
   @date : Jan 19, 2021 3:51:05 PM
 */
package com.cmc.global.asset.gateway.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.cmc.global.asset.gateway.dto.AssetDetails;
import com.cmc.global.asset.gateway.dto.Assets;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

/**
 * @author vhtu1
 *
 */
@Component
@RequiredArgsConstructor
public class AssetsServiceClient {

    // Could be changed for testing purpose
    private String hostname = "http://assets-service/";

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private RestTemplate restTemplate;

//    private WebClient webClient;

    public AssetsServiceClient(WebClient.Builder webClientBuilder, String hostname, RestTemplate restTemplate) {
        super();
        this.webClientBuilder = webClientBuilder;
        this.hostname = hostname;
        this.restTemplate = restTemplate;
    }

    /*
     * @Autowired private RestTemplate restTepmpte;
     */

    public Mono<AssetDetails> getAssetDetailsById(Integer assetId) {
        return webClientBuilder.build().get().uri(hostname + "api/assets/{assetId}", assetId).retrieve()
                .bodyToMono(AssetDetails.class);
    }

    public Mono<Assets> getAssetDetailsListByUserId(Integer userId) {
        return webClientBuilder.build().get().uri(hostname + "api/assets/user/{userId}", userId).retrieve().bodyToMono(Assets.class);
    }

    public Mono<Assets> getAllAssetDetails() {
        return webClientBuilder.build().get().uri(hostname + "api/assets").retrieve().bodyToMono(Assets.class);
    }

    /**
    public AssetDetails[] getAllAssetDetails() {
        AssetDetails[] result = restTemplate.getForObject("http://assets-service/api/assets",
                AssetDetails[].class);
        return result;
    }
    */

}
