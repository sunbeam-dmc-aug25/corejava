package com.sunbeam.p3;

import java.util.Scanner;

enum ArithmeticOperations {
    EXIT, ADDITION, SUBSTARTION, MULTIPLICATION, DIVISION, SQUARE
}


public class Program01 {

    public static ArithmeticOperations menu(Scanner sc) {
        ArithmeticOperations[] arr = ArithmeticOperations.values();
        for (ArithmeticOperations element : arr)
            System.out.println(element.ordinal() + ". " + element.name());

        System.out.println("Enter your choice - ");
        ArithmeticOperations choice = arr[sc.nextInt()];
        return choice;
    }

    public static void main(String[] args) {
        ArithmeticOperations choice;
        Scanner sc = new Scanner(System.in);
        while ((choice = menu(sc)) != ArithmeticOperations.EXIT) {
            switch (choice) {
                case SQUARE:
                    System.out.println("Perform Square here...");
                    break;
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
