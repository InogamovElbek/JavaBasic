package org.example.Exception;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Foydalanuvchidan satr kiritishni so'raymiz
            System.out.print("Satrni kiriting: ");
            String input = scanner.nextLine();

            // NullPointerException ishlashini ko'rsatish
            if (input == null) {
                throw new NullPointerException("Kiritilgan satr null bo'lishi mumkin emas.");
            }

            // Satrning uzunligini aniqlaymiz
            int length = input.length();
            System.out.println("Satrning uzunligi: " + length);

            // ClassCastException ko'rsatish (masalan, noto'g'ri turdagi ob'yektga o'tish)
            Object obj = "Java dasturlash";
            Integer castedObj = (Integer) obj; // Bu xato beradi
        } catch (NullPointerException e) {
            // NullPointerExceptionni ushlash
            System.out.println("Xato: " + e.getMessage());
        } catch (ClassCastException e) {
            // ClassCastExceptionni ushlash
            System.out.println("Xato: Tur o'zgartirishda xatolik - " + e.getMessage());
        } catch (Exception e) {
            // Boshqa barcha xatolarni ushlash
            System.out.println("Xato: " + e.getMessage());
        } finally {
            // Scannerni yopamiz
            scanner.close();
        }
    }
}

