package com.sunbeam.p3;

class Date {
    private int day;
    private int month;
    private int year;

    // Paramaterless Ctor
    public Date() {
        System.out.println("Inside Date Constructor");
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
        Date d2 = new Date();

        d1.displayDate();
        d2.displayDate();


        //d1.displayDate();
        //d2.displayDate();
    }
}
