package org.example.Massiv;
public class Homework_3{
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4, 5};
        int summa = 0;

        for (int son : massiv) {
            summa += son;
        }

        double ortacha = (double) summa / massiv.length;
        System.out.println("O'rtacha qiymat: " + ortacha);
    }
}
