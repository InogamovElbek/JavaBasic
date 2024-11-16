package org.example.Massiv;

public class Homework_4 {
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4, 5};
        boolean mavjud = false;

        System.out.print("Toq sonlar: ");
        for (int son : massiv) {
            if (son % 2 != 0) {
                System.out.print(son + " ");
                mavjud = true;
            }
        }

        if (!mavjud) {
            System.out.println("Toq son yo'q");
        }
    }
}
