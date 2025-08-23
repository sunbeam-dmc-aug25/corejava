package com.sunbeam.p1;

public class Employee {
    private int empid;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    //TO-DO
    // acceptEmployee(Scanner sc);

    public void displayEmployee() {
        System.out.println("Empid - " + empid);
        System.out.println("Name - " + name);
        System.out.println("Salary - " + salary);
        System.out.println("-----------------------------");
    }
}
