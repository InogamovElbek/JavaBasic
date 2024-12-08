package org.example.If_Else_and_Switch;

import java.util.Scanner;

public class Switch_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bahoni kiriting (1-5): ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 5 -> System.out.println("A'lo");
            case 4 -> System.out.println("Yaxshi");
            case 3 -> System.out.println("Qoniqarli");
            case 2 -> System.out.println("Qoniqarsiz");
            default -> System.out.println("Noto‘g‘ri baho");
        }
    }
}
