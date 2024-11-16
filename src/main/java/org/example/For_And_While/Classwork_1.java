package org.example.For_And_While;

import java.util.Scanner;

public class Classwork_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a ni kiriting (a<b): ");
        int a = scanner.nextInt();
        System.out.print("b ni kiriting: ");
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
