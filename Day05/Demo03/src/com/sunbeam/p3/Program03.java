package com.sunbeam.p3;

import java.util.Scanner;

public class Program03 {
    public static int menu(Scanner sc) {
        System.out.println("0. EXIT");
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Add Student");
        System.out.println("4. Display All Students");
        System.out.println("Enter your choice - ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Person[] personList = new Person[10];
        personList[0] = new Employee(1, 10000, "Anil", "9876543210");
        personList[1] = new Student(1, 70, "Mukesh", "8796543210");
        personList[2] = new Employee(2, 20000, "Ramesh", "7698543210");
        personList[3] = new Student(2, 80, "Suresh", "6549873210");
        int index = 4;

        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:
                    personList[index] = new Employee();
                    personList[index].accept(sc);
                    index++;
                    break;

                case 2:
                    for (Person p : personList)
                        if (p != null && p instanceof Employee)
                            p.display();
                    break;

                case 3:
                    personList[index] = new Student();
                    personList[index].accept(sc);
                    index++;
                    break;
                case 4:
                    for (Person p : personList)
                        if (p != null && p instanceof Student) {
                            p.display();
                            Student s = (Student) p; // Downcasting
                            s.calculatePercentage();
                        }
                    break;
            }
        }
    }
}
