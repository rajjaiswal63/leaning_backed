package com;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class repository {
    private DataBaseConnection db;
    public repository(DataBaseConnection db){
        this.db=db;
    }
    public List<String> findall(){
        return db.getusers();
    }
    public void save(String user){
        db.addusers(user);
    }
}
