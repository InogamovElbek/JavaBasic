package org.example.GenericMethod;

public class Example_2 {
    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 2.5)); // 12.5
    }
}
