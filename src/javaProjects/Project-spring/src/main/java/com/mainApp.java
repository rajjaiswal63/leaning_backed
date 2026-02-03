package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {
    static void main() {
        ApplicationContext context= new AnnotationConfigApplicationContext(appConfig.class);
        controller controller= context.getBean(controller.class);
        controller.createuser("Raj");
        controller.createuser("Rajan");
        controller.createuser("Rajesh");
        controller.listuser();
    }
}
