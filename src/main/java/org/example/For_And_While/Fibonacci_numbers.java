package org.example.For_And_While;

import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci sonlar ketma-ketligi nechta sonni chiqarsin? n = ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci sonlari:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
