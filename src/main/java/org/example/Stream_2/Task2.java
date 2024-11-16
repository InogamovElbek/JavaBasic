package org.example.Stream_2;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("stream", "java", "terminal", "operation", "filter");

        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println("Uzunlik bo'yicha tartiblangan so'zlar: " + sortedWords);
        // Natija: [java, stream, filter, terminal, operation]
    }
}
