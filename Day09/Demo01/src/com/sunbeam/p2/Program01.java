package com.sunbeam.p2;

import java.util.Comparator;

class Employee {
    int empid;
    String name;
    double salary;

    Employee() {

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

}


public class Program01 {
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "Anil", 20000);
        Employee e2 = new Employee(1, "Mukesh", 50000);
        class EmpComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee e1, Employee e2) {
                //return e1.empid - e2.empid;
                return Double.compare(e1.salary, e2.salary);
            }
        }
        EmpComparator obj = new EmpComparator();
        int result;
        result = obj.compare(e1, e2); // Comparator
        if (result > 0)
            System.out.println("E1 is greater");
        else if (result < 0)
            System.out.println("E2 is greater");
        else
            System.out.println("E1 and E2 are equal");

    }
}
