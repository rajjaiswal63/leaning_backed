package javaBasics.Challenge03ZooManagementSystem;

public class lion extends animal {
    public lion(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " "+"Lion roars!");
    }

}

