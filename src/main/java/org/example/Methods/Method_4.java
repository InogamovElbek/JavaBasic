package org.example.Methods;

public class Method_4 {
    public static int count(int[] arr, int n) {
        int count = 0;
        for (int x : arr) {
            if (x == n) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        System.out.println(count(arr, 2));
    }
}

