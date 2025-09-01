package com.sunbeam.p1;

import java.util.Scanner;

interface Shape {
    void accept(Scanner sc);

    void calculateArea();

    default void calculatePerimeter() {
        System.out.println("Perimeter is not calculated");
    }

    static void sort() {

    }

    static void display() {

    }
}


class Rectangle implements Shape {
    int length;
    int breadth;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Enter length - ");
        length = sc.nextInt();
        System.out.println("Enter breadth - ");
        breadth = sc.nextInt();
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle - " + (length * breadth));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle - " + (2 * (length + breadth)));
    }
}

class Circle implements Shape {
    int radius;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Enter radius - ");
        radius = sc.nextInt();
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle - " + (3.14 * radius * radius));
    }
}

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape sh;
        sh = new Circle();
        //sh = new Rectangle();

        sh.accept(sc);
        sh.calculateArea();
        sh.calculatePerimeter();
    }
}
