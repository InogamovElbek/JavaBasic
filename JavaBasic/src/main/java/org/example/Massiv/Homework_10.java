package org.example.Massiv;

import java.util.Arrays;

public class Homework_10{
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4};
        int oxirgi = massiv[massiv.length - 1];

        for (int i = massiv.length - 1; i > 0; i--) {
            massiv[i] = massiv[i - 1];
        }
        massiv[0] = oxirgi;

        System.out.println("Aylantirilgan massiv: " + Arrays.toString(massiv));
    }
}
