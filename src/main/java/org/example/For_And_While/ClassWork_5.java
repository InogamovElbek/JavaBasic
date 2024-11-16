package org.example.For_And_While;

import java.util.Scanner;

public class ClassWork_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Sonni kiriting (0 kiritilganda to‘xtaydi): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Kiritilgan sonlar yig‘indisi: " + sum);
    }
}
