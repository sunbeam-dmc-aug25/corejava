package com.sunbeam.p3;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = null;

        //p = new Student(); // upcasting
        p = new Employee(); // upcasting

        p.accept(sc);
        p.display();

        // p.calculatePercentage(); //  Object Slicing

        if (p instanceof Student) {
            Student s1 = (Student) p; // Downcasting
            // If downcasting fails jvm throws an exception ClassCastException
            s1.calculatePercentage();
        }

    }
}
