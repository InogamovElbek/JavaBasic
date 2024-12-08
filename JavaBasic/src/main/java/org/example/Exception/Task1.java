package org.example.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Fayl manzili
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("Fayl topilmadi: " + filePath);
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Xato: " + e.getMessage());
        }
    }
}
