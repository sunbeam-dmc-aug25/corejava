package com.sunbeam.p5;

class Date {
    // Field Initializer
    private int day = 1;
    private int month;
    private int year;

    // Object Initializer - 2
    {
        System.out.println("Object Initializer - 2 ");
    }

    // Object Initializer - 1
    {
        System.out.println("Object Initializer - 1 ");
    }


    public Date() {
        System.out.println("Date Paramaterless Ctor");
    }

    public Date(int day, int month, int year) {
        System.out.println("Date Paramaterized Ctor");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String displayDate() {
        return day + "/" + month + "/" + year;
    }
}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2, 2, 2002);
        System.out.println("d1 - " + d1.displayDate());
        System.out.println("d2 - " + d2.displayDate());

    }
}
