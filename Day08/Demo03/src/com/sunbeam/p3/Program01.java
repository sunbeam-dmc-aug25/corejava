package com.sunbeam.p3;

class Employee implements Comparable<Employee> {
    int empid;
    double salary;
    String name;

    Employee() {
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    // Implementation for comparing employees on empid
//    @Override
//    public int compareTo(Employee o) {
//        return this.empid - o.empid;
//    }

    // Implementation for comparing employees on name
//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }

    // Implementation for comparing employees on salary
    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}

public class Program01 {
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "Sham", 20000);
        Employee e2 = new Employee(1, "Mukesh", 50000);

        int result = e1.compareTo(e2);
        if (result > 0)
            System.out.println("E1 is greater");
        else if (result < 0)
            System.out.println("E2 is greater");
        else
            System.out.println("Both are equal");

    }
}
