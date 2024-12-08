package org.example.FunctionalInterface_3;

import java.util.function.Supplier;

public class SuplierEmployee {

    public static void main(String[] args) {
        Supplier<Employee> createNewEmployee = () -> new Employee("New", "Employee", 5000);

        Employee newEmployee = createNewEmployee.get();
        System.out.println("New Employee: " + newEmployee);
    }
}
