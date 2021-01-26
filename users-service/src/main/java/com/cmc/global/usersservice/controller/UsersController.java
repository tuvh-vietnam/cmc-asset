package com.cmc.global.usersservice.controller;

import java.util.List;
import java.util.Optional;

import com.cmc.global.usersservice.dto.UserDto;
import com.cmc.global.usersservice.dto.UsersDetail;
import com.cmc.global.usersservice.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.global.usersservice.repository.UsersRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("users")
    public UserDto findAllUsers() {
        List<Users> ret = usersRepository.findAll();
        return new UserDto(ret);
    }

    @GetMapping("users/{userId}")
    public Optional<Users> findlUserById(@PathVariable int userId) {
        return usersRepository.findById(userId);
    }

}
