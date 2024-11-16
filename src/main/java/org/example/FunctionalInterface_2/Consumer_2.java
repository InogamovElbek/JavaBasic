package org.example.FunctionalInterface_2;

import java.util.function.Consumer;

public class Consumer_2{
    public static void main(String[] args) {
        Consumer<String> toUpperCase = str -> System.out.println(str.toUpperCase());

        String input = "hello";
        toUpperCase.accept(input);  // HELLO
    }
}
