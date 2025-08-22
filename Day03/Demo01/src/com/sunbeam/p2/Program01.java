package com.sunbeam.p2;

import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;

    public void initializeDate() {
        System.out.println("Inside Date Initializer");
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    void displayDate()// this
    {
        System.out.println("Date - " + this.day + "/" + this.month + "/" + this.year);
    }

}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.initializeDate();
        Date d2 = new Date();
        d2.initializeDate();
        Date d3 = new Date();
        d3.initializeDate();


        d1.displayDate();
        d2.displayDate();
    }
}
