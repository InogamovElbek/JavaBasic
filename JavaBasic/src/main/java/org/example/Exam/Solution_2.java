package org.example.Exam;

import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi son: ");
        int a = scanner.nextInt();
        System.out.print("Ikkinchi son: ");
        int b = scanner.nextInt();
        System.out.print("Uchinchi son: ");
        int c = scanner.nextInt();

        if (a + b >= a + c && a + b >= b + c) {
            System.out.println("Eng katta yig'indi: " + a + " va " + b);
        } else if (a + c >= a + b && a + c >= b + c) {
            System.out.println("Eng katta yig'indi: " + a + " va " + c);
        } else {
            System.out.println("Eng katta yig'indi: " + b + " va " + c);
        }
    }
}
