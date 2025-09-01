package com.sunbeam.p4;

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

    public static void displayEmployees(Set<Employee> employeeList, String message) {
        System.out.println("-----------------------------------------------------");
        System.out.println(message);
        System.out.println("-----------------------------------------------------");
        for (Employee e : employeeList)
            System.out.println(e);
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {

        //Set<Employee> employeeList = new TreeSet<>(); // natural order is maintained

        class EmpNameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        }
        EmpNameComparator nameComparator = new EmpNameComparator();
        Set<Employee> employeeList = new TreeSet<>(nameComparator); // other than natural order

        // for a treeset it is mandatory the class should implement comparable
        // or you should provide a comparator
        employeeList.add(new Employee(156, "Mukesh", 30000));
        employeeList.add(new Employee(168, "Anil", 40000));
        employeeList.add(new Employee(147, "Suresh", 20000));
        employeeList.add(new Employee(132, "Ramesh", 10000));
        employeeList.add(new Employee(121, "Ram", 50000));
        employeeList.add(new Employee(121, "Ram", 50000));

        System.out.println("Size of employeeList - " + employeeList.size());
        displayEmployees(employeeList, "All employees -> ");


    }
}
