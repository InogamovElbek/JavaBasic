package org.example.Massiv;

public class Homework_5 {
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 1};
        int qidirilayotganSon = 1;
        int count = 0;

        for (int son : massiv) {
            if (son == qidirilayotganSon) {
                count++;
            }
        }

        System.out.println(qidirilayotganSon + " soni " + count + " marta takrorlangan.");
    }
}
