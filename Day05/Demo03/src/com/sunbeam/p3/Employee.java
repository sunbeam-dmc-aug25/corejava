package com.sunbeam.p3;

import java.util.Scanner;

public class Employee extends Person {
    int empid;
    double salary;

    Employee() {
        System.out.println("Employee()");
    }

    public Employee(int empid, double salary, String name, String mobile) {
        super(name, mobile);
        System.out.println("Employee(int,double,String,String)");
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public void accept(Scanner sc) {
        System.out.print("Enter the empid - ");
        empid = sc.nextInt();
        System.out.print("Enter the salary - ");
        salary = sc.nextDouble();
        // to unhide the implementation we use super keyword
        super.accept(sc);
    }

    public void display() {
        System.out.println("Empid - " + empid);
        System.out.println("Salary - " + salary);
        super.display();
    }
}
