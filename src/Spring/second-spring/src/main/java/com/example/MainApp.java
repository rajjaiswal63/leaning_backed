package com.example;

import com.loose.EmailNotificationService;
import com.loose.NotificationService;
import com.loose.SMSNotificationService;
import com.loose.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
//        greetingService greetingService= (greetingService) context.getBean("myBean");
//        greetingService.sayHello();
//
//        NotificationService emailService=new EmailNotificationService();  // normal loose coupling
//        UserService UserServices=new UserService(emailService);
//        UserServices.notifyUser("hello");
//        NotificationService SmsService=new SMSNotificationService();
//        UserService UserService= new UserService(SmsService);
//        UserService.notifyUser("hello");
//
//
//        // same by using bean
//        UserService userService = (UserService) context.getBean("UserService");
//        userService.notifyUser("xvc");
//
//        // for sms
//       UserService userServiceSms = (UserService) context.getBean("UserServiceSms");
//       userServiceSms.notifyUser("helloooooo");
//
//       // for using @Qualifier and @primary
//        UserService userService1=context.getBean(UserService.class);
//        userService1.notifyUser("hello from mainApp");



    }
}
