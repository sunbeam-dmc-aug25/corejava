package com.sunbeam.p3;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Employee(); // upcasting
        // storing the object of sub-class into super class reference
        // on super type reference we can access only the members of the super class.
        System.out.println(p1.name);
        System.out.println(p1.mobile);
        //System.out.println(p1.empid); // NOT OK Object Slicing
        //System.out.println(p1.salary); // NOT OK Object Slicing
        // When upcasting is done the super class reference can only access members of super class
        // inherited in the sub class. It cannot access the members of the sub class

        Employee e1 = (Employee) p1; // Downcasting
        // Process of converting the reference of super type into the sub type
        // At the time of downcasting explicit typecasting is mandatory
        System.out.println(e1.empid);

        Person p = null;
        p = new Person();
        p = new Employee(); // upcasting
        p = new Student(); // upcasting
    }
}
