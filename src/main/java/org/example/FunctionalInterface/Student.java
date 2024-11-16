package org.example.FunctionalInterface;

public class Student {

    private int id;
    private String name;
    private StudentStatus status;
    private int age;

    public Student(int id, String name, StudentStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public StudentStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", age=" + age +
                '}';
    }

    enum StudentStatus{
        ACTIVE, NOT_ACTIVE
    }
}
