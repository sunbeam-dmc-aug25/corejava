package com.sunbeam.p1;

public class Program04 {
    public static void main(String[] args) {
        String s = "SUNBEAM";
        String s1 = "sunbeam";
        String s2 = s1.toUpperCase(); // run time operations create new String Object
        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);
        System.out.println("s1==s2 - " + (s1 == s2));
        System.out.println("s==s2 - " + (s == s2));
    }
}
