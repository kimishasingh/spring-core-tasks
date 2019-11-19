package com.codefountain.spring.core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Dev")
public class DevDatabaseConfiguration implements DatabaseConfiguration {

    public void doSetup() {
        System.out.println("|DEV| Database Configuration set up done.");
    }
}
