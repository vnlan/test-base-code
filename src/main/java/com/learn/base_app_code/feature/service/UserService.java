package com.learn.base_app_code.feature.service;

import com.learn.base_app_code.feature.model.User;
import com.learn.base_app_code.feature.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private List<User> getUserInfo(){
        List<User> a = userRepository.findIfUserExist();
        return a;

    }

}
