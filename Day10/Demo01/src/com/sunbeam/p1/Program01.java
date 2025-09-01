package com.sunbeam.p1;

import java.util.*;

class Employee implements Comparable<Employee> {
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
    public int compareTo(Employee o) {
        return this.empid - o.empid;
    }
}

public class Program01 {

    public static void displayEmployees(List<Employee> employeeList, String message) {
        System.out.println("-----------------------------------------------------");
        System.out.println(message);
        System.out.println("-----------------------------------------------------");
        for (Employee e : employeeList)
            System.out.println(e);
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(5, "Mukesh", 30000));
        employeeList.add(new Employee(3, "Anil", 40000));
        employeeList.add(new Employee(4, "Suresh", 20000));
        employeeList.add(new Employee(2, "Ramesh", 10000));
        employeeList.add(new Employee(1, "Ram", 50000));

        displayEmployees(employeeList, "All employees in unsorted - ");

        // Display all employees sorted on empid in asc order (Natural Ordering)
        Collections.sort(employeeList);
        displayEmployees(employeeList, "All employees sorted on empid(natural ordering) - ");

        // Display all employees sorted on name in desc order
        class EmpNameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.name.compareTo(o1.name); // desc order sort
            }
        }
        EmpNameComparator comparator = new EmpNameComparator();
        Collections.sort(employeeList, comparator);
        displayEmployees(employeeList, "All employees sorted on name in desc order -");


        // Display all employees sorted on salary in asc order
        class EmpSalaryComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.salary, o2.salary); // asc sort
            }
        }
        EmpSalaryComparator salaryComparator = new EmpSalaryComparator();
        employeeList.sort(salaryComparator);
        displayEmployees(employeeList, "All employees sorted on salary in asc order -");

    }
}
