package com.sunbeam.p1;

import java.io.*;

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

    public static void write(Employee e) {
        try (FileOutputStream fos = new FileOutputStream("emp1.db", true)) {
            try (DataOutputStream dos = new DataOutputStream(fos)) {
                // converting the state of employee into the stream of bytes
                dos.writeInt(e.empid);
                dos.writeUTF(e.name);
                dos.writeDouble(e.salary);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("emp1.db")) {
            try (DataInputStream dis = new DataInputStream(fis)) {
                while (true) {
                    int empid = dis.readInt();
                    String name = dis.readUTF();
                    double salary = dis.readDouble();
                    Employee e = new Employee(empid, name, salary);
                    System.out.println(e);
                }
            }
        } catch (EOFException e) {
            System.out.println("File Reading is complete...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Employee e1 = new Employee(1, "Anil", 10000);
        //Employee e2 = new Employee(2, "Mukesh", 20000);
        //write(e1);
        //write(e2);

        read();
    }
}
