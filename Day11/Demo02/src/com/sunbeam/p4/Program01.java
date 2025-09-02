package com.sunbeam.p4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 2L;

    int empid;
    String name;
    double salary;
    double commission;


    Employee() {

    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int empid, String name, double salary, double commission) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empid=" + empid +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", commission=" + commission +
                '}';
    }
}

public class Program01 {

    public static void write(List<Employee> employeeList) {
        try (FileOutputStream fos = new FileOutputStream("emp4.db")) {
            try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
                try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                    oos.writeObject(employeeList);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("emp4.db")) {
            try (BufferedInputStream bis = new BufferedInputStream(fis)) {
                try (ObjectInputStream ois = new ObjectInputStream(bis)) {
                    List<Employee> employeeList = (List<Employee>) ois.readObject();
                    employeeList.forEach(System.out::println);
                }
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
        employeeList.add(new Employee(5, "Ram", 50000));
        //write(employeeList);

        read();

    }
}
