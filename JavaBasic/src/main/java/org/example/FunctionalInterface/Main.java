package org.example.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//            GetEven getEven = new GetEvenImpl();
//
//            int[] arr = {21,32,43,54,56,67,65,544,332,43,54,65,76,87,8,89,8};
//        int[] even = getEven.getEven(arr);
//        for (int i = 0; i < even.length; i++) {
//            System.out.println(even[i]);

        Student student = new Student(1, "Aliqozi", Student.StudentStatus.NOT_ACTIVE);

        Predicate<Student> checkStudent = new CheckStudentStatus();
        boolean isStatus = checkStudent.test(student);

        System.out.println(isStatus);

        Consumer<Student> consumer = new StudentConsumer();
        consumer.accept(student);
        consumer.accept(student);
        consumer.accept(student);
        System.out.println(student);



        }
    }
