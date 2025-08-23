package com.sunbeam.p4;

class Date {
    // 1. Field Initializer
    private int day = 1; // Initialization
    private int month;
    private int year;

    //2. Object Initializer
    {
        day = 2; //Assignment
        month = 1; // Initialization
    }

    public Date() {
        day = 3; // Assignment
        month = 2; // Assignment
        year = 2000; // Initialization
    }

    public String displayDate() {
        return day + "/" + month + "/" + year;
    }
}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("d1 - " + d1.displayDate());

    }
}
