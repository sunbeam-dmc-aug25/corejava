package com.sunbeam.p2;

import java.util.Scanner;

public abstract class Employee {
    int empid;
    double salary;

    public Employee() {

    }

    public Employee(int empid, double salary) {
        this.empid = empid;
        this.salary = salary;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter the empid - ");
        empid = sc.nextInt();
        System.out.print("Enter the salary - ");
        salary = sc.nextDouble();
    }

    @Override
    public boolean equals(Object obj)// this - e1, obj = e2
    {
        return super.equals(obj);
    }

    public void display() {
        System.out.println("Empid - " + empid);
        System.out.println("Salary - " + salary);
    }


    // 100% incomplete
    public abstract void calculateTotalSalary();
}
