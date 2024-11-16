package org.example.Methods;

import java.sql.*;
import java.util.Scanner;

public class Practise_1 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("a = ");
            int a = scanner.nextInt();

            if (a == 0) System.exit(0);

            System.out.print("b = ");
            int b = scanner.nextInt();

            System.out.print("Belgini kirting (+ - * /) >> ");
            char c = scanner.next().charAt(0);

            switch (c) {
                case '+': {
                    sum(a, b);
                    break;
                }
                case '-': {
                    substract(a, b);
                    break;
                }
                case '*': {
                    multiply(a, b);
                    break;
                }
                case '/': {
                    divide(a, b);
                    break;
                }
                default: {
                    return;
                }
            }
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (1F * a / b));
    }

    private static void multiply(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a * b));
    }

    private static void substract(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
