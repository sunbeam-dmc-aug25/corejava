package com.sunbeam.p1;

import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;

    // methods - code
    public void acceptDate() // this=0X300
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day - ");
        this.day = sc.nextInt();
        System.out.print("Enter the month - ");
        this.month = sc.nextInt();
        System.out.print("Enter the year - ");
        year = sc.nextInt();
    }

    void displayDate()// this
    {
        System.out.println("Date - " + this.day + "/" + this.month + "/" + this.year);
    }

}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();

        d2.acceptDate();
        d1.acceptDate();

        d1.displayDate();
        d2.displayDate();
    }
}
