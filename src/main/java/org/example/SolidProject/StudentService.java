package org.example.SolidProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    // O'quvchini qo'shish
    public void addStudent(Student student) {
        students.add(student);
    }

    // O'quvchini o'zgartirish
    public void updateStudent(int id, String newName, double newPercentage) {
        for (Student student : students) {
            if (student.getId() == id) {
                student = new Student(newName, id, newPercentage);
                break;
            }
        }
    }

    // O'quvchini o'chirish
    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    // Top 5 reytingni ko'rsatish
    public List<Student> getTop5Students() {
        return students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))  // Baholar bo'yicha kamayish tartibida saralash
                .limit(5)  // Eng yuqori 5 o'quvchini olish
                .collect(Collectors.toList());
    }

    // Barcha o'quvchilarni ko'rsatish
    public void showAllStudents() {
        students.forEach(System.out::println);
    }
}
