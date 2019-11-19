package com.codefountain.spring.core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Test")
public class TestDatabaseConfiguration implements DatabaseConfiguration {

    public void doSetup() {
        System.out.println("|TEST| Database Configuration set up done.");
    }
}
