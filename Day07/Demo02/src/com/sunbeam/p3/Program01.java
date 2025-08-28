package com.sunbeam.p3;

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();

        d1.setDay(10); // unchecked
        d1.setMonth(20);
        d1.setYear(2000);
        System.out.println("d1 - " + d1);
        System.out.println("Program Finished...");
    }
}
