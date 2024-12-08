package org.example.SolidProject;
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // O'quvchilarni yaratamiz
        Student student1 = new Student("Ali", 1, 85.5);
        Student student2 = new Student("Sara", 2, "A");
        Student student3 = new Student("Aziza", 3, 78.0);
        Student student4 = new Student("Olim", 4, "B");
        Student student5 = new Student("Hasan", 5, 92.0);
        Student student6 = new Student("Zohra", 6, 88.0);

        // O'quvchilarni qo'shish
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        studentService.addStudent(student4);
        studentService.addStudent(student5);
        studentService.addStudent(student6);

        // Barcha o'quvchilarni ko'rsatish
        System.out.println("Barcha o'quvchilar:");
        studentService.showAllStudents();

        // Top 5 reytingni ko'rsatish
        System.out.println("\nTop 5 o'quvchilar:");
        studentService.getTop5Students().forEach(System.out::println);

        // O'quvchini o'chirish
        studentService.removeStudent(2);

        // O'quvchini o'zgartirish
        studentService.updateStudent(3, "Aziza", 80.0);

        // Yangi reytingni ko'rsatish
        System.out.println("\nYangilangan o'quvchilar:");
        studentService.showAllStudents();
    }
}
