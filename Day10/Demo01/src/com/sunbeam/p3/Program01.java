package com.sunbeam.p3;

import java.util.*;

class Employee {
    int empid;
    String name;
    double salary;

    Employee() {

    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empid);
    }
}

public class Program01 {

    public static void displayEmployees(Set<Employee> employeeList, String message) {
        System.out.println("-----------------------------------------------------");
        System.out.println(message);
        System.out.println("-----------------------------------------------------");
        for (Employee e : employeeList)
            System.out.println(e);
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {

        Set<Employee> employeeList = new HashSet<>(); // order is not maintained
        //Set<Employee> employeeList = new LinkedHashSet<>(); // insertion order maintained

        employeeList.add(new Employee(156, "Mukesh", 30000));
        employeeList.add(new Employee(168, "Anil", 40000));
        employeeList.add(new Employee(147, "Suresh", 20000));
        employeeList.add(new Employee(132, "Ramesh", 10000));
        employeeList.add(new Employee(121, "Ram", 50000));
        employeeList.add(new Employee(121, "Ram", 50000));
        // to avoid the duplicates hashcode and equals method is mandatory to override

        System.out.println("Size of employeeList - " + employeeList.size());
        displayEmployees(employeeList, "All employees -> ");


    }
}
