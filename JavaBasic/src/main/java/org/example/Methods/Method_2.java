package org.example.Methods;

import java.util.Arrays;

public class Method_2 {
    public static String toString(int[] arr) {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(toString(arr));
    }
}
