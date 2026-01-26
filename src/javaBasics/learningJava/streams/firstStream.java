package javaBasics.learningJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class firstStream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNums= new ArrayList<>();

        //copying all even numbers from nums to evenNums
        nums.stream()
                .filter(numbers->(numbers % 2== 0))
                .forEach(evenNums::add);

        // printing evenNums
//        evenNums
//                .forEach(System.out::println);

        //printing again evenNums
        System.out.println(evenNums);

        // doing same thing in more concise way
       List<Integer>oddNums=
               nums.stream()
                       .filter(num->num%2!=0)
                       .collect(Collectors.toList());
       //printing oddNums
        System.out.println(oddNums);
    }


}
