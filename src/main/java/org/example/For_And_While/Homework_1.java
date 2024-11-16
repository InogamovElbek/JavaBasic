package org.example.For_And_While;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Musbat son kiriting (0 to‘xtatadi): ");
            int num = scanner.nextInt();

            if (num == 0) break;
            if (num > 0) {
                int square = num * num;
                System.out.println("Kvadrat: " + square);
                sum += num;
            }
        }
        System.out.println("Umumiy yig‘indi: " + sum);
    }
}
