package org.example.Stream_TerminalOperations;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana");

        List<Character> result = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result); // [a, p, l, e, b, n]
    }
}
