package javaBasics.learningJava.FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class predicates {
    //predicate------------
    public static Predicate<Integer> iseven=(a)-> a % 2 ==0;
    //bipredicate----------
    public static BiPredicate<Integer,Integer> isSumIsGreater=(a,b)-> (a+b)%2==0;


    public static void main(String[] args) {
        System.out.println(iseven.test(6));
        System.out.println(isSumIsGreater.test(2,3));

        BiPredicate<Integer,Integer> SumIsGreater=(a,b)-> (a+b)%2==0;
        System.out.println(SumIsGreater.test(2,2));
    }
}
