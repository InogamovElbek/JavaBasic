package org.example.OOP2;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Laziz");
        student.setLastName("Azizov");
        student.setAge(24);
        System.out.println(student);

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setFirstName("Laziz");
        teacher.setLastName("Azizov");
        teacher.setAge(24);
        System.out.println(teacher);
    }
}