package org.example.Massiv;
public class Homework_9 {
    public static void main(String[] args) {
        int[] massiv = {0, 1, 2, 3, 4};

        System.out.print("Juft indeksdagi elementlar: ");
        for (int i = 0; i < massiv.length; i += 2) {
            System.out.print(massiv[i] + " ");
        }
    }
}
