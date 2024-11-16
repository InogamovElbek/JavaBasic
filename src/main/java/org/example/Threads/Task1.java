package org.example.Threads;

public class Task1 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddNumbers());
        Thread evenThread = new Thread(new EvenNumbers());

        oddThread.start();
        evenThread.start();
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Toq son: " + i);
        }
    }
}

class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Juft son: " + i);
        }
    }
}
