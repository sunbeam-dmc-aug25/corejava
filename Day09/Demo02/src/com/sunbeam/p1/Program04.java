package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

class Employee {
    int empid;
    String name;
    double salary;

    Employee() {

    }

    Employee(int empid) {
        this.empid = empid;
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Employee) {
            Employee e = (Employee) obj; // downcasting
            return this.empid == e.empid;
        }
        return false;
    }
}

public class Program04 {

    public static void main(String[] args) {
        Collection<Employee> c1 = new ArrayList<>();
        c1.add(new Employee(5, "Mukesh", 20000));
        c1.add(new Employee(3, "Anil", 40000));
        c1.add(new Employee(1, "Ram", 50000));
        c1.add(new Employee(4, "Ramesh", 30000));
        c1.add(new Employee(2, "Suresh", 10000));

        for (Employee e : c1)
            System.out.println(e);

        Employee e1 = new Employee(1);
        System.out.println("c1 contains emp with id 1 - " + c1.contains(e1));

        Employee e2 = new Employee(4);
        System.out.println("remove emp with id 4 - " + c1.remove(e2));
    }
}
