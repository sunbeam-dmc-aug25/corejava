package com.sunbeam.p1;

public class Program02 {
    public static void main(String[] args) {
        // int[] arr1 = new int[-3]; // NegativeArraySizeException

        int num1 = 10;
        System.out.println(num1); // In java local variables must be initialized before using

        int[] arr1 = null;
        arr1[0] = 10; // NullPointerException
    }
}
