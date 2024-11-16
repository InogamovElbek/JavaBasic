package org.example.JavaBoolean;

public class Homework_7 {
    public static void main(String[] args) {
        int A = 3, B = 4, C = 5;
        boolean result = (A * A + B * B == C * C || A * A + C * C == B * B || B * B + C * C == A * A);
        System.out.println("To‘g‘ri burchakli uchburchak: " + result);
    }
}
