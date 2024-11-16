package org.example.FunctionalInterface_2;
import java.util.function.Predicate;

public class Predicate_1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        int number = 4;
        System.out.println("Is " + number + " even? " + isEven.test(number));
    }
}
