package com.sunbeam.p1;

import java.util.Scanner;

// Employee is-a Person
// Child -> SubClass
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

    public void acceptEmployee(Scanner sc) {
        System.out.print("Enter the empid - ");
        empid = sc.nextInt();
        System.out.print("Enter the salary - ");
        salary = sc.nextDouble();
        //acceptPerson(sc);
        //this.acceptPerson(sc);
        super.acceptPerson(sc);
    }

    public void displayEmployee() {
        System.out.println("Empid - " + empid);
        System.out.println("Salary - " + salary);
        displayPerson();
    }
}
