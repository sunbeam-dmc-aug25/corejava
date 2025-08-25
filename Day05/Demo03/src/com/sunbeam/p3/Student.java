package com.sunbeam.p3;

import java.util.Scanner;

public class Student extends Person {
    int rollno;
    double marks;

    public Student() {

    }

    public Student(int rollno, double marks, String name, String mobile) {
        super(name, mobile);
        this.rollno = rollno;
        this.marks = marks;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter the rollno - ");
        rollno = sc.nextInt();
        System.out.print("Enter the marks - ");
        marks = sc.nextDouble();
        super.accept(sc);
    }

    public void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Marks - " + marks);
        super.display();
    }

    public void calculatePercentage() {
        double percent = (marks / 150) * 100;
        System.out.println("Percentage - " + percent);
    }
}
