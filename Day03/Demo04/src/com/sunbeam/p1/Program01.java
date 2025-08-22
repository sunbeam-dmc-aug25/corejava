package com.sunbeam.p1;

public class Program01 {
    // Array is a reference(non primitive) type in java
    public static void main(String[] args) {
        // reference
        //int arr[] = new int[5];
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Using For-Loop -> ");
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            System.out.println("Element - " + element);
        }

        System.out.println("Using For-Each -> ");
        for (int element : arr) {
            System.out.println("Element - " + element);
        }

    }
}
