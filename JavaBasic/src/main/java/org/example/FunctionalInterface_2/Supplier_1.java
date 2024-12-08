package org.example.FunctionalInterface_2;

import java.util.function.Supplier;
import java.util.Random;

public class Supplier_1 {
    public static void main(String[] args) {
        Supplier<Integer> randomInt = () -> new Random().nextInt(100);

        System.out.println("Random integer: " + randomInt.get());
    }
}
