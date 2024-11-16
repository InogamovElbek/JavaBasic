package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_3{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 7, 1, 4);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result); // [1, 3, 5]
    }
}
