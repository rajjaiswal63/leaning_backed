package javaBasics.learningJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana");
        //for each loop
//        for (String items : fruits) System.out.println(items);

        // stream for fruits-------
        Stream<String> str1 = fruits.stream();
//        str1.forEach((fr)-> System.out.println(fr));
        // same line 15 with lambdas
        str1.forEach(System.out::println);

        // stream filter ------- on list
        List<String> Animals = Arrays.asList("Dog", "Cat", "Monkey");
        Stream<String> streamAnimal = Animals.stream();
        Stream<String> filteredAnimal = streamAnimal.filter(name -> name.startsWith("C"));
        filteredAnimal.forEach(System.out::println);

        // stream filter in sort
        Animals.stream()
                .filter(name -> name.startsWith("M"))
                .forEach(System.out::println);
    }
}
