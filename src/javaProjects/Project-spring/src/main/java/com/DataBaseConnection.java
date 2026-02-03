package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class DataBaseConnection {
    private List<String> users;

    public void init(){
        users=new ArrayList<>();
        System.out.println("DataBase is Connected (Simulated)");
    }
    public List<String> getusers(){
        return users;
    }
    public void addusers(String users){
        this.users.add(users);
    }
    public void cleanup(){
        System.out.println("DataBase is Disconnected (Simulated )");
    }
}
