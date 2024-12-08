package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_1{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 6, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .distinct()
                .sorted((a, b) -> b - a) // kamayish tartibida saralash
                .collect(Collectors.toList());

        System.out.println(result); // [36, 16, 4]
    }
}
