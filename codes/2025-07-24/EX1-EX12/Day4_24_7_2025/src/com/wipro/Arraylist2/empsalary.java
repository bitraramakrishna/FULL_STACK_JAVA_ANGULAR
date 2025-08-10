package com.wipro.Arraylist2;
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Age=" + empAge + ", Salary=" + empSalary + "]";
    }

  
    public int compareTo(Employee otherEmployee) {
        return Double.compare(this.empSalary, otherEmployee.empSalary);
    }
}

public class empsalary {
	
	 public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();

	        employees.add(new Employee("12", "ram", 22, 75000.00));
	        employees.add(new Employee("22", "krishna", 24, 60000.00));
	        employees.add(new Employee("33", "prasad", 35, 90000.00));
	      
	        Collections.sort(employees);

	        Collections.reverse(employees);

	        System.out.println("after sorting by Salary");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }
	    }

}*/

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Age=" + empAge + ", Salary=" + empSalary + "]";
    }
}

class EmployeeIdComparator implements Comparator<Employee> {
   
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getEmpId().compareTo(emp2.getEmpId());
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getEmpName().compareTo(emp2.getEmpName());
    }
}

class EmployeeAgeComparator implements Comparator<Employee> {
   
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getEmpAge(), emp2.getEmpAge());
    }
}


public class empsalary {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("003", "prasad", 35, 90000.00));
        employees.add(new Employee("001", "ram", 22, 75000.00));
        employees.add(new Employee("002", "krishna", 24, 60000.00));
        
        List<Employee> sortedById = new ArrayList<>(employees);
        Collections.sort(sortedById, new EmployeeIdComparator());
        for (Employee emp : sortedById) {
            System.out.println(emp);
        }
        


        List<Employee> sortedByName = new ArrayList<>(employees);
        Collections.sort(sortedByName, new EmployeeNameComparator());
        
        for (Employee emp : sortedByName) {
            System.out.println(emp);
        }
        

        List<Employee> sortedByAge = new ArrayList<>(employees);
        Collections.sort(sortedByAge, new EmployeeAgeComparator());
        
        for (Employee emp : sortedByAge) {
            System.out.println(emp);
        }
        
    }
}*/



import java.util.concurrent.CopyOnWriteArrayList;

class Employee {
    private String empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

   
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Age=" + empAge + ", Salary=" + empSalary + "]";
    }
}

public class empsalary {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Employee> employees = new CopyOnWriteArrayList<>();

        employees.add(new Employee("E001", "ram", 22, 75000.00));
        employees.add(new Employee("E002", "krishna", 24, 60000.00));
        employees.add(new Employee("E003", "prasad", 35, 90000.00));
        
        for (Employee emp : employees) 
        {
            if (emp.getEmpSalary() > 80000.00) 
            {
                employees.remove(emp);
                System.out.println("Removed employee: " + emp.getEmpName() + " (Salary: " + emp.getEmpSalary() + ")");
            }
        }
       for (Employee emp : employees) 
        {
            System.out.println(emp);
        }
    }
}
