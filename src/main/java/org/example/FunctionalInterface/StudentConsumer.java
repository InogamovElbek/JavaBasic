package org.example.FunctionalInterface;

import java.util.function.Consumer;

public class StudentConsumer implements Consumer<Student> {
    @Override
    public void accept(Student student) {
        if (student.getStatus().equals(Student.StudentStatus.ACTIVE))
            student.setStatus(Student.StudentStatus.NOT_ACTIVE);
        else
            student.setStatus(Student.StudentStatus.ACTIVE);
    }
}
