package org.example.LocalDateTIme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example_2 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // "dd-MM-yyyy" formatida sana
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Sana (dd-MM-yyyy): " + sdf1.format(currentDate));

        // "MMMM dd, yyyy" formatida sana
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd, yyyy");
        System.out.println("Sana (MMMM dd, yyyy): " + sdf2.format(currentDate));
    }
}
