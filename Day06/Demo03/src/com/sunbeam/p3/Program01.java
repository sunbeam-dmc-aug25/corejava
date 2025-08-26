package com.sunbeam.p2;

import java.util.Scanner;

abstract class Acceptable {
    public abstract void accept(Scanner sc);

    public abstract void display();
}

class Date extends Acceptable {
    int day;
    int month;
    int year;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Date::accept()");
    }
}

class Time extends Acceptable {
    int hr;
    int min;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Time::accept()");
    }
}

class Car extends Acceptable {
    String name;
    String model;
    double price;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Car::accept()");
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
