package com;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class service {
    private repository repository;

    public service(repository repository) {
        this.repository = repository;
    }

    public List<String> getalluser(){
        return repository.findall();
    };

    public void adduser(String name) {
        repository.save(name);
    }
}
