package com.codefountain.spring.core.javaconfig.autowire.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class UserService {

    @Autowired(required = false)
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save() {
        if(Objects.isNull(userRepository)) {
            System.out.println("no repository is provided!");
            return;
        }
        userRepository.save();
    }
}
