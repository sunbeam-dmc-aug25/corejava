package com.sunbeam.p2;

import java.util.Scanner;

public class Program {
    public static int menu(Scanner sc) {
        System.out.println("------------------------------");
        System.out.println("0. EXIT");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Find the Student on rollno");
        System.out.print("Enter the choice - ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[5];
        int choice;
        int index = 0;
        int rollno;
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:
                    if (index < 5) {
//                        arr[index] = new Student();
//                        arr[index].acceptStudent(sc);
//                        index++;
                        // Remove/comment the next 6 lines (Dummy records)
                        arr[0] = new Student(1, "Anil", 50);
                        arr[1] = new Student(2, "Mukesh", 55);
                        arr[2] = new Student(3, "Ramesh", 60);
                        arr[3] = new Student(4, "Suresh", 65);
                        arr[4] = new Student(5, "Ram", 70);
                        index = 5;
                    } else
                        System.out.println("Course is full...");

                    break;
                case 2:
                    for (Student s : arr)
                        if (s != null)
                            s.displayStudent();
                    break;
                case 3:
                    System.out.print("Enter the rollno of student to search - ");
                    rollno = sc.nextInt();
                    for (Student s : arr)
                        if (s != null)
                            if (rollno == s.getRollno())
                                s.displayStudent();
                    break;
                default:
                    System.out.println("Wrong Choice...");
                    break;
            }
        }
    }
}
