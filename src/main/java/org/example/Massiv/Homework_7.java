package org.example.Massiv;

import java.util.Arrays;

public class Homework_7 {
    public static void main(String[] args) {
        int[] massiv1 = {1, 2, 3};
        int[] massiv2 = {4, 5, 6};

        int[] birlashgan = new int[massiv1.length + massiv2.length];
        System.arraycopy(massiv1, 0, birlashgan, 0, massiv1.length);
        System.arraycopy(massiv2, 0, birlashgan, massiv1.length, massiv2.length);

        System.out.println("Birlashgan massiv: " + Arrays.toString(birlashgan));
    }
}
