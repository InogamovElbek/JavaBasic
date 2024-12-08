package org.example.FunctionalInterface_2;

import java.util.function.Function;
public class Function_2 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = num -> num * num;

        int number = 5;
        System.out.println("Square: " + square.apply(number));  // 25
    }
}
