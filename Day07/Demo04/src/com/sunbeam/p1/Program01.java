package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

    public static int menu(Scanner sc) {
        System.out.println("0. EXIT");
        System.out.println("1. Addition");
        System.out.println("2. Substarction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice - ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 4:
                    System.out.println("Perform Division here...");
                    break;
                case 2:
                    System.out.println("Perform Substraction here...");
                    break;
                case 3:
                    System.out.println("Perform Multiplication here...");
                    break;
                case 1:
                    System.out.println("Perform Addition here...");
                    break;


            }
        }
    }
}
