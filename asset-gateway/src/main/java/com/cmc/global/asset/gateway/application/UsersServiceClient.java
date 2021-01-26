package com.cmc.global.asset.gateway.application;

import static java.util.stream.Collectors.joining;

import java.util.List;

import com.cmc.global.asset.gateway.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.cmc.global.asset.gateway.dto.UsersDetail;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class UsersServiceClient {
    // Could be changed for testing purpose
    private String hostname = "http://users-service/";

    @Autowired
    private WebClient.Builder webClientBuilder;

    /*
     * @Autowired private RestTemplate restTepmpte;
     */

    public UsersServiceClient(String hostname, Builder webClientBuilder) {
        super();
        this.hostname = hostname;
        this.webClientBuilder = webClientBuilder;
    }

    /*
     * public String getUserRestTemplate(Integer userId) { return
     * restTepmpte.getForObject(hostname + "users/{userId}", String.class, userId);
     * }
     */

    /*
     * ppublic Mono<UsersDetail> getUsersDetailRest(){ RequestEntity<UsersDetail>
     * request = RequestEntity .get(new URI("http://users-service:8083/users"))
     * .accept(MediaType.APPLICATION_JSON) .body(body); ResponseEntity<UsersDetail>
     * response = restTepmpte.exchange(request, UsersDetail.class); }
     */

    public Mono<UsersDetail> getUsersDetail(Integer userId) {

        return webClientBuilder.build().get().uri(hostname + "api/users/{userId}", userId).retrieve()
                .bodyToMono(UsersDetail.class);

//        return restTepmpte.getForObject(hostname + "api/users/{userId}", UsersDetail.class, userId);
    }

    public Mono<Users> getAllUsers() {
        return webClientBuilder.build().get().uri(hostname + "api/users").retrieve().bodyToMono(Users.class);
    }

    private String joinIds(List<Integer> petIds) {
        return petIds.stream().map(Object::toString).collect(joining(","));
    }

}
