package org.example.JavaBoolean;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali sonni kiriting: ");
        int num = scanner.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        boolean result = (a != b && b != c && a != c);
        System.out.println("Raqamlari turlicha: " + result);
    }
}
