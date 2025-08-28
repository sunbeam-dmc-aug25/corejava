package com.sunbeam.p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program04 {
    public static void division(int n, int d) {
        int result = n / d;
        System.out.println("Division - " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator - ");
            int n = sc.nextInt();
            System.out.println("Enter the denominator - ");
            int d = sc.nextInt();
            division(n, d);
            int[] arr = new int[-2];
        } catch (ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println("Program Finished Successfully");

    }
}
