package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 5);

        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .distinct()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result); // [4, 9, 16]
    }
}
