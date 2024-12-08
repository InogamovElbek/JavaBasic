package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class Switch_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1 ni kiriting: ");
        int num1 = scanner.nextInt();
        System.out.print("Son2 ni kiriting: ");
        int num2 = scanner.nextInt();
        System.out.print("Amalni tanlang (1-qo‘shish, 2-ayirish, 3-ko‘paytirish, 4-bo‘lish): ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1 -> System.out.println("Natija: " + (num1 + num2));
            case 2 -> System.out.println("Natija: " + (num1 - num2));
            case 3 -> System.out.println("Natija: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) System.out.println("Natija: " + (num1 / num2));
                else System.out.println("Bo‘lishga nolga bo‘lish mumkin emas");
            }
            default -> System.out.println("Noto‘g‘ri tanlov");
        }
    }
}
