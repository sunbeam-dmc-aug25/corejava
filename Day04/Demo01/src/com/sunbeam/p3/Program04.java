package com.sunbeam.p3;

public class Program04 {

    // Variable Arity/Argument Method
    public static void add(int... arr) {
        int result = 0;
        for (int e : arr)
            result += e;
        System.out.println("Addition - " + result);
    }

    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
    }
}
