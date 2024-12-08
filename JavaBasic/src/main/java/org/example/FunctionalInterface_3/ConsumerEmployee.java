package org.example.FunctionalInterface_3;

import java.util.function.Consumer;
import java.util.List;

public class ConsumerEmployee {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "Doe", 6000),
                new Employee("Jane", "Smith", 4000),
                new Employee("Alice", "Johnson", 5500)
        );

        Consumer<Employee> printEmployee = emp -> System.out.println(emp);

        System.out.println("Employee List:");
        employees.forEach(printEmployee);
    }
}
