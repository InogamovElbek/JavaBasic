package org.example.For_And_While;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234";
        String input;

        do {
            System.out.print("Parolni kiriting: ");
            input = scanner.next();
            if (!input.equals(correctPassword)) {
                System.out.println("Xato parol, qayta urinib ko‘ring.");
            }
        } while (!input.equals(correctPassword));

        System.out.println("Parol to‘g‘ri!");
    }
}
