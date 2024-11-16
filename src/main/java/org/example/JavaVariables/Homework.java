package org.example.JavaVariables;

public class Homework {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 2, d = 3;


        int expr1 = a * b - c % b + a / (b + d);
        int expr2 = (a % b) * (a / b) + a - b;
        int expr3 = a * b / (c % b) + c - a;
        int expr4 = (a / b) * (a % c) - b + c * d;
        int expr5 = (a + b) * (c - a) % b + a / c;
        int expr6 = (a % b) * (b - c) / (a / b + d);
        int expr7 = (a / b) * (a % c + b) - a;
        int expr8 = a - (a / b) * c + a % c;
        int expr9 = (a % b) + (a / b) * (b - a % c);
        int expr10 = (a + c * b) - (a % b) + a / c;


        System.out.println("Expression 1: " + expr1);
        System.out.println("Expression 2: " + expr2);
        System.out.println("Expression 3: " + expr3);
        System.out.println("Expression 4: " + expr4);
        System.out.println("Expression 5: " + expr5);
        System.out.println("Expression 6: " + expr6);
        System.out.println("Expression 7: " + expr7);
        System.out.println("Expression 8: " + expr8);
        System.out.println("Expression 9: " + expr9);
        System.out.println("Expression 10: " + expr10);
    }
}
