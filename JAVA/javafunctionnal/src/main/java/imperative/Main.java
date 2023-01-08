package javafunctionnal.src.main.java.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static javafunctionnal.src.main.java.imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Alissa", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE)
        );

        System.out.println("//Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("//Declarative approach");
        //Declarative approach
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender); //return true or false
        List<Person> females2 = people.stream() //abstract mode
            .filter(personPredicate)
            .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person (String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }
    }

    enum Gender {
        MALE, FEMALE
    }
    
}