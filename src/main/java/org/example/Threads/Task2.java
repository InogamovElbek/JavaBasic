package org.example.Threads;

public class Task2{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        Thread rowSumThread = new Thread(new RowSum(matrix));
        Thread columnSumThread = new Thread(new ColumnSum(matrix));

        rowSumThread.start();
        columnSumThread.start();
    }
}

class RowSum implements Runnable {
    private final int[][] matrix;

    RowSum(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Qator " + (i + 1) + " yig'indisi: " + sum);
        }
    }
}

class ColumnSum implements Runnable {
    private final int[][] matrix;

    ColumnSum(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Ustun " + (j + 1) + " yig'indisi: " + sum);
        }
    }
}
