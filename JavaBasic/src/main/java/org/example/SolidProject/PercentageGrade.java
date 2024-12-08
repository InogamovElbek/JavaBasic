package org.example.SolidProject;

// PercentageGrade sinfi
public class PercentageGrade implements GradingStrategy {
    @Override
    public double calculateGrade(Student student) {
        return student.getPercentage();  // O'quvchining foizli bahosini qaytaradi
    }
}
