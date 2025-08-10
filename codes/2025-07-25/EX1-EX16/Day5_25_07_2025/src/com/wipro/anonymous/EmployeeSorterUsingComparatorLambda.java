package com.wipro.anonymous;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

public class EmployeeSorterUsingComparatorLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "rama", 70000.0));
        employees.add(new Employee(101, "krishna", 50000.0));
        employees.add(new Employee(104, "prasad", 60000.0));
        
        Comparator<Employee> byIdAsc = (e1, e2) -> Integer.compare(e1.getId(), e2.getId());
        employees.sort(byIdAsc);
        employees.forEach(System.out::println);

        Comparator<Employee> byNameAsc = (e1, e2) -> e1.getName().compareTo(e2.getName());
        employees.sort(byNameAsc);

        employees.forEach(System.out::println);

        Comparator<Employee> bySalaryDesc = (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary());
        employees.sort(bySalaryDesc);
        employees.forEach(System.out::println);
    }
}