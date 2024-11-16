package org.example.For_And_While;

import java.util.Scanner;

public class Classwork_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        System.out.print("Bo‘luvchilar: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
