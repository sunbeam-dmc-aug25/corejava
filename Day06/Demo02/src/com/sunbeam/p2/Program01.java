package com.sunbeam.p2;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1; // only reference of abstract class can be created
        //e1 = new Employee(); // we cannot create object of abstract class

        e1 = new Manager();
        //e1 = new Salesman();

        e1.accept(sc);
        e1.display();
        e1.calculateTotalSalary();
        System.out.println(e1);
        
    }
}
