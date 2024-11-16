package org.example.Stream_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        Optional<Integer> firstGreaterThan15 = numbers.stream()
                .filter(n -> n > 15)
                .findFirst();

        firstGreaterThan15.ifPresent(number -> System.out.println("15 dan katta birinchi son: " + number));
        // Natija: 20
    }
}
