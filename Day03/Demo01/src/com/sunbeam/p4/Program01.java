package com.sunbeam.p4;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;

    //user defined ctor
    // Parameterless
    public Date() {
        System.out.println("Inside Paramterless Ctor");
    }

    // Parameterized Ctor
    public Date(int d, int m, int y) {
        System.out.println("Inside Paramterized Ctor");
    }


    void displayDate()// this
    {
        System.out.println("Date - " + this.day + "/" + this.month + "/" + this.year);
    }

}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        // Default ctor allows us to create object without passing any arguments
        // Paramaterless ctor allows us to create object without passing any arguments
        Date d2 = new Date(2, 2, 2002);
        // Paramaterized ctor allows us to create object by passing arguments
        // Dynamic Initialization

    }
}
