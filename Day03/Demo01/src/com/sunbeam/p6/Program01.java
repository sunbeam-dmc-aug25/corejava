package com.sunbeam.p6;

class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this(1, 1, 2001); // this statement
        System.out.println("Parameterless Ctor");
//        this.year = 2002;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month) {
        this(day, month, 2000);
    }

    void displayDate()// this
    {
        System.out.println("Date - " + this.day + "/" + this.month + "/" + this.year);
    }

}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2, 2, 2002);

        Date d3 = new Date();
        Date d4 = new Date(3, 3, 2003);

        System.out.print("d1 - ");
        d1.displayDate();
        System.out.print("d2 - ");
        d2.displayDate();

    }
}
