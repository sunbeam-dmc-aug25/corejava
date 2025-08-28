package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {
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
        } finally {
            // finllay block executes every single time weather there is exception
            // on no any exception
            // finally blocks are used to close the resources
            System.out.println("Inside Finally");
            sc.close();
        }

        System.out.println("Program Finished Successfully");

    }
}
