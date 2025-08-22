package com.sunbeam.p1;

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

}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.displayDate();

        Date d2 = new Date(2, 2, 2002);
        d2.displayDate();

        Date d3 = new Date();
        d3.acceptDate();
        d3.displayDate();
    }
}
