package com.sunbeam.p2;

class Circle {
    private int radius;
    private static double PI = 3.14;


    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        // inside the non-static methods we can access static as well as non static fields
        double area = PI * radius * radius;
        System.out.println("Area of Circle - " + area);
    }

    // static methods do not get this reference
    public static double getPI() {
        System.out.println(PI);
        // inside static methods we cannot access non static fields
        // System.out.println(radius); // NOT OK

        // inside static methods we can access only static fields
        return PI;
    }
    
}

public class Program01 {
    public static void main(String[] args) {
        //System.out.println("value of PI - " + Circle.PI);
        System.out.println("value of PI - " + Circle.getPI());
    }
}
