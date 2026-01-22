package javaBasics.Challenge03ZooManagementSystem;

abstract public class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }
    public void makeSound(){
        System.out.println("animal makes a sound");
    }
    public String getName(){
        return name;
    }
}
