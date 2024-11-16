package org.example.Stream_2;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(34, 56, 78, 90, 102);

        boolean allGreaterThan30 = numbers.stream()
                .allMatch(n -> n > 30);

        System.out.println("Hammasi 30 dan kattami? " + allGreaterThan30); // Natija: true
    }
}
