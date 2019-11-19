package com.codefountain.spring.core.javaconfig.autowire.base;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
