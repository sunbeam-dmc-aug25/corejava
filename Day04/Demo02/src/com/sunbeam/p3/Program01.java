package com.sunbeam.p3;

class Date {
    // Field Initilalizer - 1
    private int day = 1;
    private int month;
    private int year;

    // Object Initializer - 2
    {
        month = 1;
        year = 2001;
    }

    // constructor - 3
    public Date() {
    }

    public Date(int day, int month, int year) {
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
        System.out.println("d1 - " + d1.displayDate());
        Date d2 = new Date();
        System.out.println("d2 - " + d2.displayDate());
        Date d3 = new Date(2, 2, 2002);
        System.out.println("d3 - " + d3.displayDate());
    }
}
