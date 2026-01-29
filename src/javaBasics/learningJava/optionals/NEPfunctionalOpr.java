package javaBasics.learningJava.optionals;

import java.util.Optional;

public class NEPfunctionalOpr {
    public static void main(String[] args) {
        Optional<String>name=Optional.of("raj");
        Optional<String>mybe=Optional.ofNullable(null);

        //if present
        name.ifPresent(value->{
            System.out.println("j");
        });
        //map
//        Optional<String> map =name.map((value)->value.toUpperCase());
        Optional<String> map =name.map(String::toUpperCase);  // same but using lambda
        System.out.println(map);

        //filter
        Optional<String>filtername= name.filter((value)->value.startsWith("r"));
        filtername.ifPresent(System.out::println);
    }
}
