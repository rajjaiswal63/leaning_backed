package com.first_spring_boot.first_spring_boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStarterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello");
    }


}
