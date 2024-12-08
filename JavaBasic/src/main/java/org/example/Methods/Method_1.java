package org.example.Methods;

import java.util.Arrays;

public class Method_1 {
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        print(arr);
    }
}
