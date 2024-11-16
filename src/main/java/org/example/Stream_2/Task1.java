package org.example.Stream_2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 9, 18, 21, 14, 3);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println("10 dan katta sonlar: " + filteredNumbers); // Natija: [12, 18, 21, 14]
    }
}
