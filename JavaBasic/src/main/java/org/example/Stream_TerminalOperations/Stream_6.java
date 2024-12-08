package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "code", "lambda");

        List<String> result = words.stream()
                .peek(System.out::println) // chop qilish
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result); // [CODE, LAMBDA, STREAM]
    }
}
