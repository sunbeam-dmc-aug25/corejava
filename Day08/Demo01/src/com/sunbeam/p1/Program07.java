package com.sunbeam.p1;

public class Program07 {
    public static void main(String[] args) {
        String s = "SUNBEAM"; // SLP
        String s1 = "sunbeam"; //SLP
        String s2 = s1.toUpperCase().intern(); //SLP

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);
        System.out.println("s1==s2 - " + (s1 == s2));
        System.out.println("s==s2 - " + (s == s2));
    }
}
