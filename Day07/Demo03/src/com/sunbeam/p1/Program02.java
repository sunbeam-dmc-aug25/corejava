package com.sunbeam.p1;

public class Program02 {

    public static void main(String[] args) {
        Person p1 = new Person("Anil", "Mumbai", 1, 1, 2001);

        try {
            Person p2 = (Person) p1.clone();// copied

            System.out.println("p1 - " + p1);
            System.out.println("p2 - " + p2);

            System.out.println("After change in p2 -> ");
            p2.name = "Mukesh"; // change the name
            p2.dob.day = 2;
            System.out.println("p1 - " + p1);
            System.out.println("p2 - " + p2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
