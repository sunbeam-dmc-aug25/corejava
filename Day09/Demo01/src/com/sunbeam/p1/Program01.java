package com.sunbeam.p1;

class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee o) {
        return this.empid - o.empid;
    }
}


public class Program01 {
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "Anil", 20000);
        Employee e2 = new Employee(1, "Mukesh", 50000);
        int result;
        result = e1.compareTo(e2); // Comparabale
//        result = obj.compare(e1,e2); // Comparator
        if (result > 0)
            System.out.println("E1 is greater");
        else if (result < 0)
            System.out.println("E2 is greater");
        else
            System.out.println("E1 and E2 are equal");

    }
}
