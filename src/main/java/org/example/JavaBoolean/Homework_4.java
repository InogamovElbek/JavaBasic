package org.example.JavaBoolean;

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Natural sonni kiriting: ");
        int num = scanner.nextInt();
        boolean result = (num >= 10 && num < 100 && num % 2 != 0);
        System.out.println("Ikki xonali toq son: " + result);
    }
}
