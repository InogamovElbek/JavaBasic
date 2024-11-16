package org.example.GenericMethod;

public class Example_1 {
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        printValue(123); // Integer
        printValue("Hello"); // String
        printValue(12.34); // Double
    }
}
