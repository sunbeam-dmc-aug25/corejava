package com.sunbeam.p2;

class Date {
    private int day;
    private int month;
    private int year;

    // Instance/Object Initializer
    {
        System.out.println("Inside Object Initializer");
        this.day = 1;
        this.month = 1;
        this.year = 2000;
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
    }
}
