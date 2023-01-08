package javafunctionnal.src.main.java.combinatorpattern;

import static javafunctionnal.src.main.java.combinatorpattern.CustomerRegistrationValidator.*; 

import java.time.LocalDate;

public class Main {

// - Combinator Pattern
    public static void main(String[] args) {
        Customer customer = new Customer (
            "Alice",
            "alice@gmail.com",
            "+08987879878",
            LocalDate.of(2000, 1, 1)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    } 
    
}
