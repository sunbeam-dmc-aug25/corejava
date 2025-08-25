package com.sunbeam.p2;

import java.util.Scanner;

public class Employee extends Person {
    int empid;
    double salary;

    Employee() {
        System.out.println("Employee()");
    }

    public Employee(int empid, double salary, String name, String mobile) {
        super(name, mobile);// Ctor Chaining between sub class and the super class
        System.out.println("Employee(int,double,String,String)");
        this.empid = empid;
        this.salary = salary;
    }

    // method overriding
    // defining the method of the super class once again in the
    // subclass with same name and signature
    // overriden method of sub class hides the implementation of super class method
    @Override
    public void accept(Scanner sc) {
        System.out.print("Enter the empid - ");
        empid = sc.nextInt();
        System.out.print("Enter the salary - ");
        salary = sc.nextDouble();
        // to unhide the implementation we use super keyword
        super.accept(sc);
    }

    public void displayEmployee() {
        System.out.println("Empid - " + empid);
        System.out.println("Salary - " + salary);
        displayPerson();
    }
}
