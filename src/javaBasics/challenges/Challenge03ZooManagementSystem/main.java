package javaBasics.challenges.Challenge03ZooManagementSystem;

public class main {
    public static void main(String[] args) {
        lion lion = new lion("simba");
        elephant elephant=new elephant("miraj");
        dog dog= new dog("tiger");

        lion.makeSound();
        elephant.makeSound();
        dog.makeSound();

        dog.play();


    }
}
