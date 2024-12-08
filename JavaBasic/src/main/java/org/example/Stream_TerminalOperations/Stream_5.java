package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("stream", "functional", "java");

        List<Character> result = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(result); // [a, c, e, f, i]
    }
}
