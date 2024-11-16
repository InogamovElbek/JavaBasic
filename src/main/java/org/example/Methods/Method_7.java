package org.example.Methods;

public class Method_7{
    public static int max(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 5};
        System.out.println(max(arr));
    }
}

