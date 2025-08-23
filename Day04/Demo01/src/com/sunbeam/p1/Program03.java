package com.sunbeam.p1;

public class Program03 {
    public static void main(String[] args) {
        //Employee e1 = null;
        //e1.displayEmployee(); // NullPointerException

        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "Anil", 10000);
        e1.displayEmployee();
        e2.displayEmployee();
        
    }
}
