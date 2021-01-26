package com.cmc.global.assetservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cmc.global.assetservice.model.Assets;

/**
 * Auto generate by jpa-maven-plugin
 *
 * @author vhtu1
 * @date 2021-01-20 03:09:28
 */
public interface AssetsRepository extends JpaRepository<Assets, Integer> {

    @Query("FROM Assets asset  WHERE asset.user.id = :userId")
    List<Assets> findByUserId(@Param("userId") int userId);

}