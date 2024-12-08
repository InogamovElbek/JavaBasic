package org.example.For_And_While;

import java.util.Scanner;

public class Classwork_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (; n > 0; n /= 10) {
            sum += n % 10;
        }
        System.out.println("Raqamlar yig‘indisi: " + sum);
    }
}


