package org.example.Exam;
import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        double A = scanner.nextDouble();
        System.out.print("B sonini kiriting: ");
        double B = scanner.nextDouble();
        System.out.print("Amalni tanlang (1: qo'shish, 2: ayirish, 3: bo'lish, 4: ko'paytirish): ");
        int amal = scanner.nextInt();

        switch (amal) {
            case 1:
                System.out.println("Natija: " + (A + B));
                break;
            case 2:
                System.out.println("Natija: " + (A - B));
                break;
            case 3:
                if (B != 0) {
                    System.out.println("Natija: " + (A / B));
                } else {
                    System.out.println("Bo'lish mumkin emas (0 ga bo'linmaydi).");
                }
                break;
            case 4:
                System.out.println("Natija: " + (A * B));
                break;
            default:
                System.out.println("Noto'g'ri amal tanlandi.");
        }
    }
}
