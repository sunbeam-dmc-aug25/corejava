package com.sunbeam.p1;

import java.util.Scanner;

interface Acceptable {
    public abstract void accept(Scanner sc);
}

class Date implements Acceptable {
    int day;
    int month;
    int year;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Date::accept()");
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

class Car implements Acceptable {
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
//        Car c1 = new Car();
//        Date d1 = new Date();
//        Time t1 = new Time();
//
//        c1.accept(null);
//        d1.accept(null);
//        t1.accept(null);

        Acceptable a1;
        //a1 = new Car(); // upcasting
        //a1 = new Date(); // upcasting
        a1 = new Time(); // upcasting

        a1.accept(null);

    }
}
