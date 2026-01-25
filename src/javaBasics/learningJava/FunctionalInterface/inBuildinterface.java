package javaBasics.learningJava.FunctionalInterface;

import java.util.function.Function;

public class inBuildinterface {
    public static Function<Integer, Integer> addFun = (a) -> a+3;
    public static Function<Integer, Integer> subFun = (a) -> a-6;

    public static void main(String[] args) {
        System.out.println(addFun.apply(5));
        System.out.println(subFun.apply(10));
    }
}
