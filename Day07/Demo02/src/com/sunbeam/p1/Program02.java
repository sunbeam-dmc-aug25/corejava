package com.sunbeam.p1;

import java.util.Scanner;

public class Program02 {
    public static void division(int n, int d) {
        int result = n / d;
        System.out.println("Division - " + result);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the numerator - ");
            int n = sc.nextInt();
            System.out.println("Enter the denominator - ");
            int d = sc.nextInt();
            division(n, d);
        }

        System.out.println("Program Finished Successfully");

    }
}
