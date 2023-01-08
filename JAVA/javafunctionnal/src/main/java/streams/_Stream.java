package javafunctionnal.src.main.java.streams;

import static javafunctionnal.src.main.java.streams._Stream.Gender.*;


import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import javax.xml.transform.Source;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Alissa", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE),            
            new Person("Bob", PREFER_NOT_TO_SAY)
        );

        //Function<Person, String> personStringFunction = person -> person.name;
        //ToIntFunction<String> length = String::length;
        //IntConsumer println = System.out::println;

        //Set<Gender> genders = 
        /*
        people.stream()
                        .map(person -> person.name)
                        .mapToInt(String::length)
                        //.collect(Collectors.toSet())
                        .forEach(System.out::println);                       
        //System.out.println(genders);
         */

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemales =  people.stream()
                    //.allMatch(personPredicate);
                    .anyMatch(personPredicate);

        System.out.println(containsOnlyFemales);        
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
        MALE, FEMALE, PREFER_NOT_TO_SAY,
    }
}
