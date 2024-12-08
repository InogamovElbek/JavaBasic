package org.example.Exam;

public class Solution_1{
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3;

        int temp = A;
        A = B;
        B = C;
        C = temp;

        System.out.println("A: " + A + ", B: " + B + ", C: " + C);
    }
}
