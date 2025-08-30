package com.sunbeam.p2;

import java.util.*;


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
    public boolean equals(Object o) {
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return empid == employee.empid;
    }


}

public class Program02 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
//        List<Employee> employeeList = new Vector<>();
//        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(5, "Mukesh", 20000));
        employeeList.add(new Employee(3, "Anil", 40000));
        employeeList.add(new Employee(1, "Ram", 50000));
        employeeList.add(new Employee(4, "Ramesh", 30000));
        employeeList.add(new Employee(2, "Suresh", 10000));

        for (Employee e : employeeList)
            System.out.println(e);

        System.out.println("Emp at index 2 - " + employeeList.get(2));

        Employee e1 = new Employee(3);
        System.out.println("Index of emp with id 3 = " + employeeList.indexOf(e1));

        employeeList.remove(4);

        System.out.println("After remove size of empList - " + employeeList.size());
    }
}
