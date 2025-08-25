package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.acceptEmployee(sc);
        e1.displayEmployee();

        Student s1 = new Student();
        s1.acceptStudent(sc);
        s1.displayStudent();
    }
}
