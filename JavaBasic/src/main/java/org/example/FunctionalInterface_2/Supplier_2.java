package org.example.FunctionalInterface_2;

import java.util.function.Supplier;
import java.time.LocalTime;

public class Supplier_2 {
    public static void main(String[] args) {
        Supplier<String> currentTime = () -> LocalTime.now().toString();

        System.out.println("Current time: " + currentTime.get());
    }
}
