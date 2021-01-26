package com.cmc.global.assetsservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.cmc.global.assetservice.AssetsServiceApplication;

@ActiveProfiles("test")
@SpringBootTest(classes = AssetsServiceApplication.class)
public class AssetsServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
