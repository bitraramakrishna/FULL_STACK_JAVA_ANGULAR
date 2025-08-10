package com.wipro.mockitodemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

}

public class EmpAvgSalery {
	public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee("ramakrishna", 23, 20000),
            new Employee("Alice", 35, 60000),
            new Employee("Bob", 40, 70000),
            new Employee("Charlie", 20, 30000),
            new Employee("David", 38, 55000)
        );

        List<Employee> eligibleEmployees = employees.stream()
            .filter(employee -> employee.getAge() > 30)
            .filter(employee -> employee.getSalary() > 50000)
            .collect(Collectors.toList());

        double totalSalary = eligibleEmployees.stream()
                                              .mapToDouble(Employee::getSalary)
                                              .sum();

        long count = eligibleEmployees.size();

            double averageSalary = totalSalary / count;
            System.out.println(averageSalary);
       
    }

}
