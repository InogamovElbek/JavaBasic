package org.example.FunctionalInterface;

public class StudentMinInfo {
    private String name;
    private int age;

    public StudentMinInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentMinInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
