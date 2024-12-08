package org.example.Exam;

import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv elementlar sonini kiriting: ");
        int n = scanner.nextInt();
        int[] massiv = new int[n];

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
        }

        System.out.print("Teskari tartibda: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
    }
}
