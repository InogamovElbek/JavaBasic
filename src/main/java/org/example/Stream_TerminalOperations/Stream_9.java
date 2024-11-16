package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 15, 20, 25);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                .map(n -> n * n)
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(result); // [400, 625]
    }
}
