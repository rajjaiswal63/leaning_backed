package javaBasics.learningJava.FunctionalInterface;

import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class inbuiltinterfaces {
    // -------------------------------Function----------------------------------------------
    public static Function<Integer, Integer> addFun = (a) -> a+3;
    public static Function<Integer, Integer> subFun = (a) -> a-6;

    //-------------------------------------biFunction---------
    public static BiFunction<Integer,Integer,Integer> addbifun= (a,b) -> a+b;
    // same bifunction with reference
    public static BiFunction<Integer, Integer, Integer> addbifun2= Integer::sum;

    // same bifunction with reference for max
    public  static BiFunction<Integer,Integer,Integer> maxbifun=Integer::max;

    //bifunction for sub
    public static BiFunction<Integer,Integer,Integer> subbifun=(a,b)->a-b;


    //---------------------------now, we talk about consumer--------------------------------
    public static Consumer<String> str=(str)-> System.out.println(str);

    //----------------------------biconsumer------------------
    public static BiConsumer<Integer,Integer> addandprintbycom=(a,b)-> System.out.println(a+b);

    public static void main(String[] args) {
        System.out.println(addFun.apply(5));
        System.out.println(subFun.apply(10));

        BiFunction<Integer,Integer,Integer> comb= addbifun.andThen(subFun);
        System.out.println(comb.apply(4,5));

        // consumer
        str.accept("Raj jaiswal");
        //or
        Consumer<String>str2= System.out::println;
        str2.accept("Raj");

        Consumer<String>com=stri-> System.out.println(stri.length());
        com.accept("Raj jaiswal");

        List<Integer> marks= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> multiplyby2=n-> System.out.println(n*2);
        marks.forEach(multiplyby2);
        marks.forEach((mark)-> System.out.println(mark));

        //bicomsumer
        addandprintbycom.accept(5,6);

    }
}
