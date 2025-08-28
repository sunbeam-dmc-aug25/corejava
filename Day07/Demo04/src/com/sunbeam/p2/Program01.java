package com.sunbeam.p2;

import java.util.Scanner;

enum ArithmeticOperations {
    EXIT, ADDITION, SUBSTARTION, MULTIPLICATION, DIVISION
}

public class Program01 {

    public static ArithmeticOperations menu(Scanner sc) {
        System.out.println("0. EXIT");
        System.out.println("1. Addition");
        System.out.println("2. Substarction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice - ");
        ArithmeticOperations[] arr = ArithmeticOperations.values();
        ArithmeticOperations choice = arr[sc.nextInt()];
        return choice;
    }

    public static void main(String[] args) {
        ArithmeticOperations choice;
        Scanner sc = new Scanner(System.in);
        while ((choice = menu(sc)) != ArithmeticOperations.EXIT) {
            switch (choice) {
                case DIVISION:
                    System.out.println("Perform Division here...");
                    break;
                case MULTIPLICATION:
                    System.out.println("Perform Multiplication here...");
                    break;
                case SUBSTARTION:
                    System.out.println("Perform Substraction here...");
                    break;
                case ADDITION:
                    System.out.println("Perform Addition here...");
                    break;


            }
        }
    }
}
