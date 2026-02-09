package com.StatusAware.The.Status_Aware.In_Memory.User.Registry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUpRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("User Registry Service Started...\n");
    }
}
