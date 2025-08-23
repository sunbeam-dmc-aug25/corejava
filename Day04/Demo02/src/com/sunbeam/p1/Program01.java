package com.sunbeam.p1;

class Date {
    // Field Initializer
    private int day = 1;
    private int month = 1;
    private int year = 2000;

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
