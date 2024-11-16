package org.example.OOP1;
import java.util.ArrayList;
import java.util.List;

public class Student_manager {

    private int id = 1;
    private List<Student> studentList = new ArrayList<Student>();


    public void create(String firstName, String lastName, int age, int grade) {
        Student student = new Student(id, firstName, lastName, age, grade);
        studentList.add(student);
        id++;
    }

    public Student get(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId() == id) {
                return student;
            }
        }
        throw new RuntimeException("Bunday student mavjud emas!!!");
    }

    public void update(int id, int age, int grade) {
        Student student = get(id);
        student.setAge(age);
        student.setGrade(grade);
    }

    public void delete(int id) {
        Student student = get(id);
        studentList.remove(student);
    }

    public void getAll() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
