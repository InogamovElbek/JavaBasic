package org.example.FunctionalInterface;

import java.util.function.Predicate;

public class CheckStudentStatus implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        if (student.getStatus().equals(Student.StudentStatus.ACTIVE)){
            return true;
        }
        return false;
    }
}
