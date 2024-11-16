package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class If_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kiriting: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Juft son");
        } else {
            System.out.println("Toq son");
        }
    }
}
