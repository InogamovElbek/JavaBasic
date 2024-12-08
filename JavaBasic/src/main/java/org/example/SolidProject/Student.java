package org.example.SolidProject;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private double percentage;
    private String letterGrade;
    private GradingStrategy gradingStrategy;

    public Student(String name, int id, double percentage) {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
        this.gradingStrategy = new PercentageGrade(); // default grading strategy
    }

    public Student(String name, int id, String letterGrade) {
        this.name = name;
        this.id = id;
        this.letterGrade = letterGrade;
        this.gradingStrategy = new LetterGrade(); // default grading strategy
    }

    public double getGrade() {
        return gradingStrategy.calculateGrade(this);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + getGrade() + "}";
    }
}
