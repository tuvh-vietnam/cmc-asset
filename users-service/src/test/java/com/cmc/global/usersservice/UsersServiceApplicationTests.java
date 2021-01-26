package com.cmc.global.usersservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = UsersServiceApplication.class)
public class UsersServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
