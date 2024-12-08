package org.example.Methods;

public class Method_5{
    public static int indexOf(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(indexOf(arr, 3));
        System.out.println(indexOf(arr, 5));
    }
}
