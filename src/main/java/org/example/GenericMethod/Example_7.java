package org.example.GenericMethod;

public class Example_7 {
    public static <T, U> void printTwoValues(T first, U second) {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    public static void main(String[] args) {
        printTwoValues(1, "Hello");    // First: 1, Second: Hello
        printTwoValues(3.14, false);   // First: 3.14, Second: false
    }
}
