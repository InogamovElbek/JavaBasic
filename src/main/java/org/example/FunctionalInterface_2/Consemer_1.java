package org.example.FunctionalInterface_2;

import java.util.function.Consumer;

public class Consemer_1 {
    public static void main(String[] args) {
        Consumer<Integer> doubleValue = num -> System.out.println(num * 2);

        int number = 10;
        doubleValue.accept(number);  // 20
    }
}
