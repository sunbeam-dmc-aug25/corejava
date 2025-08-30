package com.sunbeam.p4;

import java.util.Arrays;
import java.util.Comparator;

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

    // Natural Ordering of elements
    // Ascending Order
    @Override
    public int compareTo(Employee o) {
        return this.empid - o.empid;
    }
}


public class Program01 {

    public static void displayArray(Employee[] arr) {
        System.out.println("--------------------------------------------------");
        for (Employee e : arr)
            System.out.println(e);
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Employee arr[] = new Employee[5];
        arr[0] = new Employee(5, "Mukesh", 20000);
        arr[1] = new Employee(3, "Anil", 40000);
        arr[2] = new Employee(1, "Ram", 50000);
        arr[3] = new Employee(4, "Ramesh", 30000);
        arr[4] = new Employee(2, "Suresh", 10000);

        System.out.println("Before Sorting -> ");
        displayArray(arr);

        Arrays.sort(arr); // done on natural ordering of elements

        System.out.println("After Sorting on natural ordering -> ");
        displayArray(arr);

        class EmpNameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        }
        EmpNameComparator nameComparator = new EmpNameComparator();
        Arrays.sort(arr, nameComparator); // sorting on name of employees
        System.out.println("After Sorting on name-> ");
        displayArray(arr);

        class EmpSalaryComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.salary, o1.salary);
            }
        }
        EmpSalaryComparator salaryComparator = new EmpSalaryComparator();
        Arrays.sort(arr, salaryComparator);
        System.out.println("After Sorting on salary desc-> ");
        displayArray(arr);

    }
}
