package com.sunbeam.p1;

public class Program04 {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        Employee[] arr = new Employee[5];
        // Array of non primitive type is creayed it creates
        // an array of references

        //arr[0] = new Employee();
        arr[0] = new Employee(1, "Anil", 10000);
        arr[1] = new Employee(2, "Mukesh", 20000);
        arr[2] = new Employee(3, "Ramesh", 30000);
        arr[3] = new Employee(4, "Suresh", 40000);
        arr[4] = new Employee(5, "Ram", 50000);

        System.out.println("Using For-Loop");
        for (int i = 0; i < arr.length; i++) {
            Employee e = arr[i];
            e.displayEmployee();
        }

        System.out.println("Using For-Each");
        for (Employee e : arr)
            e.displayEmployee();
    }
}
