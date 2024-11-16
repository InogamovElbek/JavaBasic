package org.example.Threads;

//public class Task3 {
//    public static void main(String[] args) {
//        int countdownStart = 10; // Sekundlar
//        Thread countdownThread = new Thread(new Countdown(countdownStart));
//        countdownThread.start();
//    }
//}
//
//class Countdown implements Runnable {
//    private final int start;
//
//    Countdown(int start) {
//        this.start = start;
//    }

//    @Override
//    public void run() {
//        for (int i = start; i >= 0; i--) {
//            System.out.println("Qolgan vaqt: " + i + " soniya");
//            try {
//                Thread.sleep(1000); // Har bir sekundni kutish
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Time's up!");
//    }
//}
//
