package com.sunbeam.p1;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Employee e1 = new Employee();
        Employee e1 = new Employee(1, 10000, "Anil", "9876543210");
        e1.displayEmployee();

    }
}
