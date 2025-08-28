package com.sunbeam.p1;

public class Program01 {
    public static void main(String[] args) {
        Person p1 = new Person("Anil", "Mumbai", 1, 1, 2001);
        Person p2 = p1; // copied
        System.out.println("p1 - " + p1);
        System.out.println("p2 - " + p2);

        System.out.println("After change in p2 -> ");
        p2.name = "Mukesh"; // change the name
        System.out.println("p1 - " + p1);
        System.out.println("p2 - " + p2);
    }
}
