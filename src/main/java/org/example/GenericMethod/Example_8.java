package org.example.GenericMethod;
import java.util.List;

public class Example_8 {
    public static <T> int getListSize(List<T> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4);
        List<String> strList = List.of("A", "B", "C");

        System.out.println("Size of intList: " + getListSize(intList)); // 4
        System.out.println("Size of strList: " + getListSize(strList)); // 3
    }
}
