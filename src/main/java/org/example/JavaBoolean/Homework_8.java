package org.example.JavaBoolean;

public class Homework_8 {
    public static void main(String[] args) {
        int A = 3, B = 4, C = 5, D = 6;
        int count = 0;

        if (A + B > C && A + C > B && B + C > A) count++;
        if (A + B > D && A + D > B && B + D > A) count++;
        if (A + C > D && A + D > C && C + D > A) count++;
        if (B + C > D && B + D > C && C + D > B) count++;

        System.out.println("Yasalgan uchburchaklar soni: " + count);
    }
}
