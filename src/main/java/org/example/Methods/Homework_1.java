package org.example.Methods;
public class Homework_1 {

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println("2 ta sonning kattasi: " + findMax(10, 20)); // 20
        System.out.println("3 ta sonning kattasi: " + findMax(10, 20, 15)); // 20
    }
}
