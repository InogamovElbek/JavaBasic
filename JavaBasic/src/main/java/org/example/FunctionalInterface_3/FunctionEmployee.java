package org.example.FunctionalInterface_3;

import java.util.function.Function;
import java.util.List;

public class FunctionEmployee {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "Doe", 6000),
                new Employee("Jane", "Smith", 4000),
                new Employee("Alice", "Johnson", 5500)
        );

        Function<Employee, Double> getSalary = emp -> emp.getSalary();

        System.out.println("Employees' salaries:");
        employees.forEach(emp -> System.out.println(emp.getName() + ": " + getSalary.apply(emp)));
    }
}
