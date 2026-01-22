package javaBasics.Challenge03ZooManagementSystem;

public class elephant extends animal {
    public elephant(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" "+"Elephant trumpets!");
    }
}
