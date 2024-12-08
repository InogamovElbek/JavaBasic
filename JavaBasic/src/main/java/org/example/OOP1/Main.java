package org.example.OOP1;
public class Main {
    public static void main(String[] args) {
        Student_manager studentManager = new Student_manager();
        studentManager.create( "Ali", "Aliyev", 18, 1);
        studentManager.create( "Vali", "Valiyev", 18, 1);
        studentManager.create( "Soli", "Soliyev", 18, 1);
//        Student student = studentManager.get(3);
//        System.out.println("student = " + student);


//        studentManager.update(3, 19, 2);
//        System.out.println(studentManager.get(3));

//        studentManager.delete(1);


        studentManager.getAll();

    }
}