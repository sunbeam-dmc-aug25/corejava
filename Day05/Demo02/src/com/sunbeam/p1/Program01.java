package com.sunbeam.p1;

import java.util.Scanner;

// Depenedency
class Date {
    int day;
    int month;
    int year;

    public Date() {

    }

    // TO-DO
    // acceptDate()

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

// Dependency
class Vehicle {
    String company;
    String licseneno;

    public Vehicle() {
    }

    public Vehicle(String company, String licseneno) {
        this.company = company;
        this.licseneno = licseneno;
    }

    public void acceptVehicle(Scanner sc) {
        System.out.println("Enter the vehicle company - ");
        company = sc.next();
        System.out.println("Enter the licsence no  - ");
        licseneno = sc.next();
    }

    public void displayVehicle() {
        System.out.println("Company - " + company);
        System.out.println("Licsence NO - " + licseneno);
    }
}

// employee has-a dateofjoining
// employee has-a vehicle
// Depenedent
class Employee {
    int empid;
    String name;
    double salary;
    Date doj; // Association(Composition)
    Vehicle veh; // Association

    public Employee() {
        doj = new Date();
    }

    public Employee(int empid, String name, double salary, int day, int month, int year) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.doj = new Date(day, month, year);
    }

    public void addVehicle(Scanner sc) {
        veh = new Vehicle();
        veh.acceptVehicle(sc);
    }

    // TO-DO
    // acceptEmployee()

    void displayEmployee() {
        System.out.println("Empid - " + empid);
        System.out.println("Name - " + name);
        System.out.println("Salary - " + salary);
        System.out.print("Date of Joining - ");
        doj.displayDate();
        if (veh != null)
            veh.displayVehicle();
    }
}

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.displayEmployee();

        Employee e2 = new Employee(1, "Anil", 10000, 1, 1, 2001);
        e2.displayEmployee();

        Employee e3 = new Employee(2, "Mukesh", 20000, 2, 2, 2002);
        e3.addVehicle(sc);
        e3.displayEmployee();
    }
}
