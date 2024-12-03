package com.learn.base_app_code.feature.controller;

import com.learn.base_app_code.feature.model.User;
import com.learn.base_app_code.feature.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findIfUserExist();
    }
}
