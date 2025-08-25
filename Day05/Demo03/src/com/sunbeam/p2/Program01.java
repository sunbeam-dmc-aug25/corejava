package com.sunbeam.p2;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Person p1 = new Person();
        p1.accept(sc); // person

        Employee e1 = new Employee();
        e1.accept(sc); // employee

        Student s1 = new Student();
        s1.accept(sc); // student
    }
}
