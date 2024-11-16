package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class If_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ballni kiriting (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A'lo");
        } else if (score >= 70) {
            System.out.println("Yaxshi");
        } else if (score >= 50) {
            System.out.println("Qoniqarli");
        } else {
            System.out.println("Qoniqarsiz");
        }
    }
}
