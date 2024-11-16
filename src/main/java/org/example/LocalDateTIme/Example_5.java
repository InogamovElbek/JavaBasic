package org.example.LocalDateTIme;

import java.time.LocalDate;

public class Example_5 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 10, 20);
        LocalDate date2 = LocalDate.of(2024, 10, 20);


        if (date1.isBefore(date2)) {
            System.out.println(date1 + " sanasi " + date2 + " sanasidan oldin.");
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " sanasi " + date2 + " sanasidan keyin.");
        } else {
            System.out.println("Ikki sana teng.");
        }
    }
}


