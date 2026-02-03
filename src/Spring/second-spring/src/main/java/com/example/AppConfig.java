package com.example;

import com.loose.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example")
@ComponentScan(basePackages = {"com.example","com.loose"})

public class AppConfig {
    @Bean(initMethod = "init", destroyMethod ="cleanup")
    public LifeCycleBean lifeCycleBean(NotificationService notificationService){
        return new LifeCycleBean(notificationService);
    }
}
