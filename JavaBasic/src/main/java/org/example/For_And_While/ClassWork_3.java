package org.example.For_And_While;

import java.util.Scanner;

public class ClassWork_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i != 0) {
                sum += i;
            }
        }
        System.out.println("Yig‘indi: " + sum);
    }
}
