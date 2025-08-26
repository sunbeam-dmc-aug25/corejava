package com.sunbeam.p3;

import java.util.Scanner;

interface Acceptable {
    public abstract void accept(Scanner sc);
}

interface Displayable {
    public abstract void display();
}

class Date implements Acceptable, Displayable {
    int day;
    int month;
    int year;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Date::accept()");
    }

    @Override
    public void display() {
        System.out.println("Date::display()");
    }
}

class Time implements Acceptable {
    int hr;
    int min;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Time::accept()");
    }
}

class Car implements Acceptable, Displayable {
    String name;
    String model;
    double price;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Car::accept()");
    }

    @Override
    public void display() {
        System.out.println("Car::display()");

    }
}


public class Program01 {
    public static void main(String[] args) {
        Acceptable a1;
        //a1 = new Car(); // upcasting
        //a1 = new Date(); // upcasting
        a1 = new Time(); // upcasting

        a1.accept(null);

    }
}
