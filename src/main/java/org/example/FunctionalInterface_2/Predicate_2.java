package org.example.FunctionalInterface_2;

import java.util.function.Predicate;
import java.util.function.Predicate;

public class Predicate_2 {
    public static void main(String[] args) {
        Predicate<String> isLengthGreaterThan5 = str -> str.length() > 5;

        String input = "HelloWorld";
        System.out.println("Is the length greater than 5? " + isLengthGreaterThan5.test(input));
    }
}
