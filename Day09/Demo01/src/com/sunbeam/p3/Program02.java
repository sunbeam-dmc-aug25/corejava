package com.sunbeam.p3;

import java.util.Arrays;

public class Program02 {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 1, 5, 2, 4, 6};
        System.out.println("Before sorting arr1 - " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("After sorting arr1 - " + Arrays.toString(arr1));

        double[] arr2 = {22.33, 55.66, 44.55, 11.22, 33.44};
        System.out.println("Before sorting arr2 - " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After sorting arr2 - " + Arrays.toString(arr2));

        String[] arr3 = {"Suresh", "Anil", "Ramesh", "Mukesh"};
        System.out.println("Before sorting arr3 - " + Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("After sorting arr3 - " + Arrays.toString(arr3));


    }
}
