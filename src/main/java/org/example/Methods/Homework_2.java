package org.example.Methods;
public class Homework_2 {

    public static int calculate(int a, int b) {
        return a + b;
    }


    public static int calculate(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("2 ta sonning yig'indisi: " + calculate(5, 7)); // 12
        System.out.println("3 ta sonning ko'paytmasi: " + calculate(2, 3, 4)); // 24
    }
}
