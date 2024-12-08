package org.example.For_And_While;
import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int a = scanner.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        int b = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
