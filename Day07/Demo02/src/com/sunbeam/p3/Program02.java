package com.sunbeam.p3;

public class Program02 {
    public static void main(String[] args) {
        Time t1 = new Time();
        try {
            t1.setHr(10);
            t1.setMin(50);
            System.out.println("t1 - " + t1);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
        System.out.println("Program Finished...");
    }
}
