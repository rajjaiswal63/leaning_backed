package javaBasics.challenges.Challenge03ZooManagementSystem;

public class dog extends animal implements pet{
    public dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName()+" is fetching the ball");
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" "+"dog is brak!");
    }
}
