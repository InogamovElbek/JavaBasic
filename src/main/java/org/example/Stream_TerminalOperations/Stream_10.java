package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(14, 3, 6, 8, 10, 2);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .peek(System.out::println) // chop qilish
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result); // [2, 6, 8]
    }
}
