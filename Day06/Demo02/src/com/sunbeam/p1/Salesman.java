package com.sunbeam.p1;

import java.util.Scanner;

public class Salesman extends Employee {
    int noOfProducts;
    double commission;

    public Salesman() {
    }

    public Salesman(int empid, double salary, int noOfProducts, double commission) {
        super(empid, salary);
        this.noOfProducts = noOfProducts;
        this.commission = commission;
    }

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter No of products sold - ");
        noOfProducts = sc.nextInt();
        System.out.print("Enter Commission per product sold - ");
        commission = sc.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("No of Products sold - " + noOfProducts);
        System.out.println("Commission per Product - " + commission);
    }

    public void totalSalaryofSalesman() {
        double totalSalary = salary + (noOfProducts * commission);
        System.out.println("Total Salary of Salesman - " + totalSalary);
    }
}
