package org.example.GenericMethod;

public class Example_6 {
    public static <T> T returnValue(T value) {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(returnValue(100));      // Integer
        System.out.println(returnValue("Hello"));  // String
        System.out.println(returnValue(3.14));     // Double
    }
}
