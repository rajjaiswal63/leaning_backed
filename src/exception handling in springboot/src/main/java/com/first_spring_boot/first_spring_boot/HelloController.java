package com.first_spring_boot.first_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayhello(){
        return "Hello From Spring";
    }

    @GetMapping("/user")
    public User getuser(){
        User user=new User("Raj jaiswal",124,"CSE");
        User user2=new User("Raj jaiswal",124,"CSE");
        return user2    ;
    }
}
