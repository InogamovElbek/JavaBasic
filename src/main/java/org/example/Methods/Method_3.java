package org.example.Methods;

public class Method_3 {
    public static boolean exists(int[] arr, int n) {
        for (int x : arr) {
            if (x == n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(exists(arr, 3));
        System.out.println(exists(arr, 5));
    }
}
