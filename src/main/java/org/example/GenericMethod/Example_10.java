package org.example.GenericMethod;

public class Example_10 {
    public static <T, U> void printPair(T first, U second) {
        System.out.println("Pair: (" + first + ", " + second + ")");
    }

    public static void main(String[] args) {
        printPair(1, "One");         // Pair: (1, One)
        printPair(3.14, "Pi");       // Pair: (3.14, Pi)
        printPair("First", "Second"); // Pair: (First, Second)
    }
}
