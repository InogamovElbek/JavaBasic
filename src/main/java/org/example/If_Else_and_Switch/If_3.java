package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class If_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting (1-12): ");
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Qish");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Bahor");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Yoz");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Kuz");
        } else {
            System.out.println("Noto‘g‘ri oy raqami");
        }
    }
}
