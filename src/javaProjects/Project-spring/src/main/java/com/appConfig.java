package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class appConfig {
@Bean(initMethod = "init",destroyMethod = "cleanup")
public DataBaseConnection dataBaseConnection(){
    return new DataBaseConnection();
}
}
