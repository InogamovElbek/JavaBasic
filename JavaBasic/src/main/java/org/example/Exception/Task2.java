package org.example.Exception;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Foydalanuvchidan ikkita sonni kiritishni so'raymiz
            System.out.print("Birinchi sonni kiriting: ");
            String num1 = scanner.nextLine();
            System.out.print("Ikkinchi sonni kiriting: ");
            String num2 = scanner.nextLine();

            // NullPointerException ishlashini ko'rsatish
            if (num1 == null || num2 == null) {
                throw new NullPointerException("Birinchi yoki ikkinchi son null qiymatga ega.");
            }

            // Stringlarni sonlarga aylantiramiz
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            // Bo'lish operatsiyasini amalga oshiramiz
            double result = number1 / number2;
            System.out.println("Natija: " + result);

        } catch (ArithmeticException e) {
            // Agar bo'luvchi nolga teng bo'lsa, bu xato chiqariladi
            System.out.println("Xato: Nolga bo'linish mumkin emas.");
        } catch (NumberFormatException e) {
            // Agar foydalanuvchi noto'g'ri son kiritsa
            System.out.println("Xato: Iltimos, faqat son kiriting.");
        } catch (NullPointerException e) {
            // NullPointerExceptionni ushlash
            System.out.println("Xato: " + e.getMessage());
        } catch (Exception e) {
            // Boshqa barcha xatolarni ushlash
            System.out.println("Xato: " + e.getMessage());
        } finally {
            // Scannerni yopamiz
            scanner.close();
        }
    }
}
