package com.sunbeam.p2;

import java.util.Scanner;

public class Student {
    private int rollno;
    String name;
    double marks;

    public Student() {

    }

    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public void acceptStudent(Scanner sc) {
        System.out.print("Enter the rollno - ");
        rollno = sc.nextInt();
        System.out.print("Enter the name - ");
        name = sc.next();
        System.out.print("Enter the marks - ");
        marks = sc.nextDouble();
    }

    public void displayStudent() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Name - " + name);
        System.out.println("Marks - " + marks);
        System.out.println("----------------------------");
    }
    
    public int getRollno() {
        return rollno;
    }
}
