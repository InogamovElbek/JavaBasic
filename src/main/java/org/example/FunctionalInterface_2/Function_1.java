package org.example.FunctionalInterface_2;

import java.util.function.Function;

public class Function_1 {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String input = "HelloWorld";
        System.out.println("Length: " + getLength.apply(input));  // 10
    }
}
