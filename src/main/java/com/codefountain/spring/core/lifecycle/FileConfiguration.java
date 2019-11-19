package com.codefountain.spring.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileConfiguration {

    //@Bean(initMethod = "init", destroyMethod = "destroy")
    @Bean
    public FileContext fileContext() {
        return new FileContext();
    }
}
