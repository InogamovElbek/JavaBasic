package org.example.Stream_TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana");

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        List<Character> result = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .filter(vowels::contains)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result); // [a, e, o]
    }
}
