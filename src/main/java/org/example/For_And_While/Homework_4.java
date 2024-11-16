package org.example.For_And_While;

import java.util.Scanner;

public class Homework_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Musbat sonni kiriting: ");
        int num = scanner.nextInt();

        System.out.print("Raqamlar teskari tartibda: ");
        do {
            System.out.print(num % 10);
            num /= 10;
        } while (num > 0);
    }
}
