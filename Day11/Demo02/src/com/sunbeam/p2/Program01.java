package com.sunbeam.p2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
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

    public static void write(List<Employee> employeeList) {
        try (FileOutputStream fos = new FileOutputStream("emp2.db")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(employeeList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("emp2.db")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                List<Employee> employeeList = (List<Employee>) ois.readObject();
                employeeList.forEach(System.out::println);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Anil", 10000));
        employeeList.add(new Employee(2, "Mukesh", 20000));
        employeeList.add(new Employee(3, "Ramesh", 30000));
        employeeList.add(new Employee(4, "Suresh", 40000));
        //write(employeeList);

        read();

    }
}
