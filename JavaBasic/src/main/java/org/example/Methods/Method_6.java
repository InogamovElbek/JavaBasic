package org.example.Methods;

public class Method_6 {
    public static int min(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 5};
        System.out.println(min(arr));
    }
}
