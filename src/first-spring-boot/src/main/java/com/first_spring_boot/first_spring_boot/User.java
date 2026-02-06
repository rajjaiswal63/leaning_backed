package com.first_spring_boot.first_spring_boot;

public class User {
    private String name;
    private int roll;
    private String branch;

    public User(String name, int roll, String branch) {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
