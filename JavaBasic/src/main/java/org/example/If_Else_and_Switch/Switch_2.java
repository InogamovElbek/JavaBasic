package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Iyun");
            case 7 -> System.out.println("Iyul");
            case 8 -> System.out.println("Avgust");
            case 9 -> System.out.println("Sentabr");
            case 10 -> System.out.println("Oktabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Dekabr");
            default -> System.out.println("Noto‘g‘ri raqam");
        }
    }
}

