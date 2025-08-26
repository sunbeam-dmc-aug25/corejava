package com.sunbeam.p1;

final class Employee {
    //final int empid = 1;
    private final int empid;
    private String name;
    private double Salary;

    {
        //empid = 1;
    }

    Employee() {
        empid = 1;
    }

    // implementation is 100% complete
    public final String getName() {
        return name;
    }
}

// cannot extend the final class
//class Manager extends Employee {
//  double bonus;

// Cannot override the final methods
//    @Override
//    public String getName() {
//        return "";
//    }
//}

public class Program01 {
    public static void main(String[] args) {
        // final varaible -> once the variable is initialized the value cannot be changed
        final int num1 = 10;
        //num1 = 20; // NOT OK

        final int num2;
        //num2 = 30;
        //num2 = 40; // NOT OK
        //System.out.println(num2);
    }
}
