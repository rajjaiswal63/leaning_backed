package javaBasics.learningJava.optionals;

import java.util.Optional;

public class NPE {
    public static void main(String[] args) {
        //creating optionals-------------------------
        Optional<String>optionalString= Optional.of("Raj");
        System.out.println(optionalString);

        Optional<String>empty=Optional.empty();
        System.out.println(empty);

        Optional<String>mybe=Optional.ofNullable(null);
        System.out.println(mybe);

        //checking values--------------
        System.out.println(optionalString.isPresent());
        System.out.println(empty.isPresent());
        System.out.println(mybe.isPresent());

        System.out.println(optionalString.isEmpty());

        //retriving the values --- less uses
        System.out.println(optionalString.get());

        // safely value retrival with 3 diff ways
        //1-orElse
        System.out.println(optionalString.orElse("default"));
        System.out.println(mybe.orElse("default"));

        //2-orElseGets
        String result=mybe.orElseGet(()->{
            System.out.println("inside function");
            return "default";
        });
        //3- orElseThrow()




    }

}
