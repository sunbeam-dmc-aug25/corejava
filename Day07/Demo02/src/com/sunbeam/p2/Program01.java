package com.sunbeam.p2;

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        try {
            d1.setDay(10); // unchecked
            d1.setMonth(10); // checked -> mandatory to handle
            d1.setYear(1800);
            System.out.println("d1 - " + d1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program Finished...");
    }
}
