package org.example.Exam;

import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Sonlarni kiriting (nol bilan tugating):");
        while (true) {
            int son = scanner.nextInt();
            if (son == 0) {
                break;
            }
            count++;
        }

        System.out.println("Kiritilgan sonlar soni: " + count);
    }
}
