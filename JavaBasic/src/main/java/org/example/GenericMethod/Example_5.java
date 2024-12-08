package org.example.GenericMethod;

public class Example_5{
    public static <T> void boxValue(T value) {
        System.out.println("Box contains: " + value);
    }

    public static void main(String[] args) {
        boxValue(100);   // Integer
        boxValue("Hello"); // String
        boxValue(3.14);  // Double
    }
}
