package com.example;

import org.springframework.stereotype.Component;

@Component("myBean")
public class greetingService {
    public void sayHello(){
        System.out.println("Hello from Spring");
    }
}
