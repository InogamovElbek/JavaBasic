package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class Switch_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taomni tanlang (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Sho‘rva");
            case 2 -> System.out.println("Mastava");
            case 3 -> System.out.println("Somsa");
            case 4 -> System.out.println("Osh");
            default -> System.out.println("Noto‘g‘ri tanlov");
        }
    }
}
