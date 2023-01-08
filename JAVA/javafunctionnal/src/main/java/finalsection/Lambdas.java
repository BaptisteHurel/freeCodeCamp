package javafunctionnal.src.main.java.finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

// - Lambdas
public class Lambdas {
    public static void main(String[] args) {
        
        //Function<String, String> upperCaseName = String::toUpperCase;
        Function<String, String> upperCaseName = name -> {
            //logic 
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        // - Primitives
        Integer number = null;
        int counter = 0;

        BiFunction<String, Integer, String> upperCaseName2 = (name, age) -> {
            int counter2  = 0;
            //logic 
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
    
        };

        System.out.println(upperCaseName2.apply("Alex", null));
    }


    //String upperCasedName = upperCaseName2.apply("Alex", 20);
    //System.out.println(upperCaseName2.apply("Alex", 20));
    
}
