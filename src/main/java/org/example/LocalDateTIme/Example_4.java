package org.example.LocalDateTIme;

import java.time.LocalDate;

public class Example_4 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateAfter10Days = currentDate.plusDays(10);

        System.out.println("10 kun keyin sana: " + dateAfter10Days);
    }
}
