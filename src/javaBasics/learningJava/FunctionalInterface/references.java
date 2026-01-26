package javaBasics.learningJava.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class references {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("raj","ramesh","pranjal");

//        for (int i=0; i <names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        for (String name:names){
//            System.out.println(name);
//        }
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(names);
//            }
//
//        });
//        names.forEach((name) -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
