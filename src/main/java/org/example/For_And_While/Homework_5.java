package org.example.For_And_While;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Kvadratlarning yig‘indisi: " + sum);
    }
}

