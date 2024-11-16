package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 6, 8, 10, 12);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .skip(2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result); // [8, 10, 12]
    }
}
