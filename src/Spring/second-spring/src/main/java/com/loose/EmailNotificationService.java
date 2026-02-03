package com.loose;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void send( String message) {
        System.out.println("Email: " + message);
    }
}
