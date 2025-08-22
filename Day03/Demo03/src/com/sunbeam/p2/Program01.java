package com.sunbeam.p2;

import com.sunbeam.p1.Employee;

import java.util.Scanner;

public class Program01 {

    public static int menu(Scanner sc) {
        System.out.println("0. EXIT");
        System.out.println("1. Accept Employee");
        System.out.println("2. Display Employee");
        System.out.print("Enter the choice - ");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:
                    e1.acceptEmployee(sc);
                    break;
                case 2:
                    e1.displayEmployee();
                    break;
                default:
                    System.out.println("Wrong choice ... :(");
                    break;
            }
        }
    }
}
