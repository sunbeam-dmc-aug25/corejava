package com.sunbeam.p1;

public class Program01 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        System.out.println("arr1[" + 3 + "] = " + arr1[3]); // ArrayIndexOutOfBoundsException
    }
}
