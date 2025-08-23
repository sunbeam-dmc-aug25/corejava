package com.sunbeam.p1;

class Cylinder {

}

class Circle {
    int radius;
    // field initializer - initialize the static fields
    //static double PI = 3.14;
    static double PI;

    static {
        System.out.println("Static block");
        // static blocks are executed only once
        PI = 3.14;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of Circle - " + area);
    }

}

public class Program01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        
        c1.calculateArea();
        c2.calculateArea();

        // static members of the class are desiged to be accessed
        // using classname and . operator
        System.out.println("value of PI - " + Circle.PI);

        // non static members of the class are designed to be accessed
        // using object
        //System.out.println("value of radius - " + Circle.radius); // NOT OK
        System.out.println("value of radius - " + c1.radius); //  OK
    }
}
