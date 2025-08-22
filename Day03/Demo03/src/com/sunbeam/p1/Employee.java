package com.sunbeam.p1;

import java.util.Scanner;

public class Employee {
    private int empid;
    private String name;
    private double salary;

    public Employee() {
        this(0, "", 500);
//        empid = 0;
//        name = "";
//        salary = 500;
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public void acceptEmployee(Scanner sc) {
        System.out.print("Enter the empid - ");
        empid = sc.nextInt();
        System.out.print("Enter the name - ");
        name = sc.next();
        System.out.print("Enter the salary - ");
        salary = sc.nextDouble();
    }

    public void displayEmployee() {
        System.out.println("Empid - " + empid);
        System.out.println("Name - " + name);
        System.out.println("Salary - " + salary);
    }
}
