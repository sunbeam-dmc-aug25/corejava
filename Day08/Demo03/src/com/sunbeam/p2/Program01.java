package com.sunbeam.p2;

class Student implements Comparable<Student> {
    double marks;
    String name;

    Student() {

    }

    public Student(double marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks > o.marks)
            return 3;
        else if (this.marks < o.marks)
            return -5;
        return 0;
    }
}

class Employee implements Comparable<Employee> {
    double salary;
    String name;

    Employee() {

    }

    public Employee(double salary, String name) {
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

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary)
            return 8;
        else if (this.salary < o.salary)
            return -3;
        return 0;
    }
}

public class Program01 {
    public static void main(String[] args) {
        Student s1 = new Student(60, "Mukesh");
        Student s2 = new Student(60, "Anil");

        Employee e1 = new Employee(10000, "Sham");
        Employee e2 = new Employee(20000, "Ram");

        int result;
        result = s1.compareTo(s2);
        if (result > 0)
            System.out.println("S1 is greater");
        else if (result < 0)
            System.out.println("S2 is greater");
        else
            System.out.println("S1 and S2 are equal");

        result = e1.compareTo(e2);
        if (result > 0)
            System.out.println("E1 is greater");
        else if (result < 0)
            System.out.println("E2 is greater");
        else
            System.out.println("E1 and E2 are equal");

    }
}
