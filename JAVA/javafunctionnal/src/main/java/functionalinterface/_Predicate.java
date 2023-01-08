package javafunctionnal.src.main.java.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("-- Without predicate --");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("070000000000")); // 12 carac
        System.out.println(isPhoneNumberValid("09000656400")); 

        System.out.println("-- With predicate --");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("070000000000")); // 12 carac
        System.out.println(isPhoneNumberValidPredicate.test("09000656400"));

        System.out.println("Is phone number valid and contains number 5: " + isPhoneNumberValidPredicate.and(containsNumber5).test("07000005000")); // true
        System.out.println("Is phone number valid and contains number 5: " +isPhoneNumberValidPredicate.and(containsNumber5).test("070000000000")); // 12 carac
        System.out.println("Is phone number valid and contains number 5: " +isPhoneNumberValidPredicate.and(containsNumber5).test("09000656400"));

    }

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber5 = phoneNumber -> phoneNumber.contains("5");
    
}
