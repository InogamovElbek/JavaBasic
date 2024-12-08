package org.example.Stream_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "pear");

        List<String> uniqueItems = items.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Takrorlanmagan elementlar: " + uniqueItems);
        // Natija: [apple, banana, orange, pear]
    }
}
