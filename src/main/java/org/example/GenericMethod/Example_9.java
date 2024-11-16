package org.example.GenericMethod;

import java.util.List;

public class Example_9 {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("X", "Y", "Z");

        printList(intList);  // 1 2 3
        printList(strList);  // X Y Z
    }
}
