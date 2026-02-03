package com;

import org.springframework.stereotype.Component;

import java.util.List;

@Component


public class controller {
    private service service;

    public controller(service service) {
        this.service = service;
    }

    public void createuser(String name){
        service.adduser(name);
        System.out.println("All user + " + name);
    }
    public void listuser(){
        List<String>user=service.getalluser();
        System.out.println("all user + "+ user);
    }
}
