package org.example.Massiv;

public class Homework_1 {
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4, 5};
        int engKatta = massiv[0];
        int engKichik = massiv[0];

        for (int son : massiv) {
            if (son > engKatta) engKatta = son;
            if (son < engKichik) engKichik = son;
        }

        System.out.println("Eng katta: " + engKatta + ", Eng kichik: " + engKichik);
    }
}
