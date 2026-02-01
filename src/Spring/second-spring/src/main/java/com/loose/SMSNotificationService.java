package com.loose;

import org.springframework.stereotype.Component;

@Component
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
