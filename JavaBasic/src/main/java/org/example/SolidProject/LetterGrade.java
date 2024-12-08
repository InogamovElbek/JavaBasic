package org.example.SolidProject;

// LetterGrade sinfi
public class LetterGrade implements GradingStrategy {
    @Override
    public double calculateGrade(Student student) {
        // Harf bahosini foizga aylantiramiz
        switch (student.getLetterGrade()) {
            case "A":
                return 90.0;
            case "B":
                return 80.0;
            case "C":
                return 70.0;
            case "D":
                return 60.0;
            case "F":
                return 50.0;
            default:
                return 0.0;
        }
    }
}
