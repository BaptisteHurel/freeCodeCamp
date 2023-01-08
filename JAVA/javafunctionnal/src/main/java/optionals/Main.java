package javafunctionnal.src.main.java.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*
        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
        Object value = Optional.ofNullable("Hello")
                .orElseThrow(exception);
                //.orElseGet(()->  "dafault value");

        System.out.println(value);

        */        
        Optional.ofNullable("john@gmail.com")
        //Optional.ofNullable(null)
                .ifPresentOrElse(
                    email -> System.out.println("Sending email to " + email),
                    () -> System.out.println("Cannot send email"));
    }
}
