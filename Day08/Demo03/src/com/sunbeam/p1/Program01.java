package com.sunbeam.p1;

class Box<T> {
    private T obj;
}

public class Program01 {

    // Generic Methods
    public static <T> void displayArray(T[] arr) {
        for (T e : arr)
            System.out.println("Element - " + e);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {10, 20, 30, 40, 50};
        displayArray(arr1); // Type inference -> T (Integer)

        Double[] arr2 = {11.22, 22.33, 33.44, 44.55, 55.66};
        displayArray(arr2); // T -> (Double)

        String[] arr3 = {"Anil", "Mukesh", "Ramesh", "Suresh", "Ram", "Sham"};
        Program01.<String>displayArray(arr3);

        //Program01.<String>displayArray(arr2);// NOT OK

    }
}
