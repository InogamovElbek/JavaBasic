package org.example.Methods;

public class Homework_3 {

    public static int multiplication(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static int multiplication(int start, int end) {
        int result = 1;
        for (int i = start; i <= end; i++) {
            result *= i;
        }
        return result;
    }


    public static int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("1 dan n gacha ko'paytma (n=4): " + multiplication(4));
        System.out.println("1-sondan 2-songacha ko'paytma (2 dan 5 gacha): " + multiplication(2, 5));
        System.out.println("3 ta sonning ko'paytmasi: " + multiplication(2, 3, 4));
    }
}
