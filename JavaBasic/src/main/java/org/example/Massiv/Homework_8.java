package org.example.Massiv;

import java.util.Arrays;

public class Homework_8{
    public static void main(String[] args) {
        int[] massiv = {1, -2, 3, -4, 5};

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 0) {
                massiv[i] = 0;
            }
        }

        System.out.println("O'zgartirilgan massiv: " + Arrays.toString(massiv));
    }
}

