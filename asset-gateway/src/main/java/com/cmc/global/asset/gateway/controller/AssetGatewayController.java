package com.cmc.global.asset.gateway.controller;

import com.cmc.global.asset.gateway.dto.Users;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.result.view.Rendering;

import com.cmc.global.asset.gateway.application.AssetsService;
import com.cmc.global.asset.gateway.application.AssetsServiceClient;
import com.cmc.global.asset.gateway.application.UsersServiceClient;
import com.cmc.global.asset.gateway.dto.Assets;
import com.cmc.global.asset.gateway.dto.AssetDetails;
import com.cmc.global.asset.gateway.dto.UsersDetail;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/gateway")
public class AssetGatewayController {

    @Autowired
    private AssetsServiceClient assetServiceClient;

    @Autowired
    private UsersServiceClient usersServiceClient;

    @SuppressWarnings("unused")
    @Autowired
    private ReactiveCircuitBreakerFactory<?, ?> cbFactory;

    @GetMapping(value = "users/{userId}")
    public Mono<UsersDetail> getUsersDetail(final @PathVariable int userId) {
        return usersServiceClient.getUsersDetail(userId);
        /*
         * .flatMap(assetItems -> assetServiceClient.getAssetDetailsByUserId(userId))
         * .transform(it -> { ReactiveCircuitBreaker cb =
         * cbFactory.create("getUsersDetail"); return cb.run(it, throwable ->
         * emptyAssetDetails()); }) .map(addVisitsToOwner(assetItems));
         */
    }

    @GetMapping(value = "users")
    public Mono<Users> getAllUsers() {
        return usersServiceClient.getAllUsers();
    }

    @GetMapping("/")
    public List<UsersDetail> userTest() {
        return new ArrayList<UsersDetail>();
    }

    @GetMapping(value = "assets/{userId}")
    public Mono<AssetDetails> getAssetDetailsByUserId(final @PathVariable int userId) {
        return assetServiceClient.getAssetDetailsById(userId);

    }

    @GetMapping(value = "assets/user/{userId}")
    public Mono<Assets> getAssetDetailsListByUserId(final @PathVariable int userId) {
        return assetServiceClient.getAssetDetailsListByUserId(userId);
    }

    /*
     * @RequestMapping(value = "assets", method = RequestMethod.GET)
     * 
     * @ResponseBody public AssetDetails[] getAllAssetDetails() { return
     * assetServiceClient.getAllAssetDetails();
     * 
     * }
     */

    @GetMapping(value = "assets")
    public Mono<Assets> getAllAssetDetails() {
        return assetServiceClient.getAllAssetDetails();
    }

    /*
     * @GetMapping("/assets") Rendering inbox() { return
     * Rendering.view("api/gateway/assets").modelAttribute("messages",
     * this.assetServiceClient.getAssetList()) .build(); }
     */

    public AssetGatewayController(AssetsServiceClient assetServiceClient, UsersServiceClient usersServiceClient) {
        super();
        this.assetServiceClient = assetServiceClient;
        this.usersServiceClient = usersServiceClient;
    }

}
