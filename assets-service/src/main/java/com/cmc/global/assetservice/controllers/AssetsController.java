package com.cmc.global.assetservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.global.assetservice.model.Assets;
import com.cmc.global.assetservice.repository.AssetsRepository;
import com.cmc.global.assetservice.dto.AssetsDto;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AssetsController {

    @Autowired
    private AssetsRepository assetsRepository;

    /**
     * Read List of Owners
     */
    @GetMapping("assets2")
    public List<Assets> findAll1() {
        return assetsRepository.findAll();
    }

    @GetMapping("assets1")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(assetsRepository.findAll());
    }

    /*
     * @GetMapping("/assets") Flux<Assets> inbox() { return
     * assetsRepoReactive.findAll(); }
     */

    /*
     * @GetMapping("assets/{userId}") public ResponseEntity<?>
     * findAssetByUserId(@PathVariable("userId") int userId) {
     * 
     * return ResponseEntity.ok(assetsRepository.findByUserId(userId)); }
     */

    @GetMapping("assets")
    public AssetsDto findAllAsset() {
        List<Assets> ret = assetsRepository.findAll();
        return new AssetsDto(ret);
    }

    @GetMapping("assets/user/{userId}")
    public AssetsDto findlUserById(@PathVariable int userId) {
        List<Assets> ret = assetsRepository.findByUserId(userId);
        return new AssetsDto(ret);
    }

    @GetMapping("assets/{assetId}")
    public Optional<Assets> findById(@PathVariable int assetId) {
        return assetsRepository.findById(assetId);
    }

}
