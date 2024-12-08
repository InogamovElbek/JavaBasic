package org.example.FunctionalInterface_3;

import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateEmployee {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "Doe", 6000),
                new Employee("Jane", "Smith", 4000),
                new Employee("Alice", "Johnson", 5500)
        );

        Predicate<Employee> salaryGreaterThan5000 = emp -> emp.getSalary() > 5000;

        List<Employee> filteredEmployees = employees.stream()
                .filter(salaryGreaterThan5000)
                .collect(Collectors.toList());

        System.out.println("Employees with salary greater than 5000:");
        filteredEmployees.forEach(System.out::println);
    }
}
