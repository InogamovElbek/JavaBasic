package org.example.For_And_While;

import java.util.Scanner;

public class Homework_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boshlang‘ich diapazonni kiriting: ");
        int start = scanner.nextInt();
        System.out.print("Oxirgi diapazonni kiriting: ");
        int end = scanner.nextInt();

        while (start <= end) {
            if (start % 2 != 0) {
                System.out.print(start + " ");
            }
            start++;
        }
    }
}
