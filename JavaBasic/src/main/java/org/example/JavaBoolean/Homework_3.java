package org.example.JavaBoolean;

import java.util.Scanner;

public class Homework_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kiriting: ");
        int N = scanner.nextInt();
        boolean result = (N % 2 == 0);
        System.out.println("Juft son: " + result);
    }
}
