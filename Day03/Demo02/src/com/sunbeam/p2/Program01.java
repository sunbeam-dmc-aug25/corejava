package com.sunbeam.p2;

import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this(1, 1, 2001);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Facilitators
    public void acceptDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day - ");
        this.day = sc.nextInt();
        System.out.print("Enter the month - ");
        this.month = sc.nextInt();
        System.out.print("Enter the year - ");
        year = sc.nextInt();
    }

    void displayDate() {
        System.out.println("Date - " + this.day + "/" + this.month + "/" + this.year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //Getters
    public int getYear() {
        return year;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }
}

public class Program01 {

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.displayDate();
        //d1.year = 2002; // write
        d1.setYear(-2002); // write
        //System.out.println(d1.year); // read
        System.out.println(d1.getYear()); // read
        //d1.month = 5; // setter
        //System.out.println(d1.month); //getter
    }
}
