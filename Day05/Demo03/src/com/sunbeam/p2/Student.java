package com.sunbeam.p2;

import java.util.Scanner;

public class Student extends Person {
    int rollno;
    double marks;

    public void accept(Scanner sc) {
        System.out.print("Enter the rollno - ");
        rollno = sc.nextInt();
        System.out.print("Enter the marks - ");
        marks = sc.nextDouble();
        super.accept(sc);
    }

    public void displayStudent() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Marks - " + marks);
        displayPerson();
    }
}
