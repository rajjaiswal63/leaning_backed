package javaBasics.learningJava.FunctionalInterface;

interface print{
    void out();
}
interface addition{
    int add(int a, int b);
}
public class assignment01 {
    public static void main(String[] args) {
        print p= () -> System.out.println("hello");
        p.out();

        addition addition1= (int a, int b) -> {return a+b;};
        System.out.println(addition1.add(5,6));

        // inbuild interfaces
    }

}
