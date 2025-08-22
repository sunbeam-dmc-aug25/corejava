package com.sunbeam.p1;

public class Program02 {
    // MultiDimensional Array
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[3];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        System.out.println("Using for loop ->");
        for (int i = 0; i < arr.length; i++) {
            int[] arr2 = arr[i];
            for (int j = 0; j < arr2.length; j++) {
                int element = arr[i][j];
                System.out.println("Element - " + element);
            }
        }

        System.out.println("Using for each ->");
        for (int arr2[] : arr) {
            for (int element : arr2) {
                System.out.println("Elemement - " + element);
            }
        }
    }
}
