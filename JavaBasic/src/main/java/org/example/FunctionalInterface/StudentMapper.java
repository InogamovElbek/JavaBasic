package org.example.FunctionalInterface;

import java.util.function.Function;

public class StudentMapper implements Function<Student, StudentMinInfo> {
    @Override
    public StudentMinInfo apply(Student student) {
        return new StudentMinInfo(student.getName(), student.getAge());
    }
}
