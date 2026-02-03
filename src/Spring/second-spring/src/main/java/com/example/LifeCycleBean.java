package com.example;

import com.loose.NotificationService;
import org.springframework.stereotype.Component;


public class LifeCycleBean {
    public NotificationService notificationService;

    public LifeCycleBean(NotificationService notificationService) {
        System.out.println("Constructor called : Dependency Injection");
        this.notificationService = notificationService;
    }
    public void init(){
        System.out.println("init method called : Bean initialized");
        notificationService.send("hello from Inti()");
    }
    public void performTask(){
        System.out.println("Ready for use");
    }
    public void cleanup(){
        System.out.println("Cleanup is called");
    }

}

