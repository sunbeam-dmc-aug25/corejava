package com.sunbeam.p2;

public class Program02 {
    public static void main(String[] args) {
        String s1 = "sunbeam";
        String s2 = new String("sunbeam");

        System.out.println("s1==s2 - " + (s1 == s2));
        System.out.println("s1.equals(s2) - " + (s1.equals(s2)));

        StringBuffer sb1 = new StringBuffer("sunbeam");
        StringBuffer sb2 = new StringBuffer("sunbeam");

        System.out.println("sb1==sb2 - " + (sb1 == sb2));
        System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2)));

        StringBuilder sb3 = new StringBuilder("sunbeam");
        StringBuilder sb4 = new StringBuilder("sunbeam");

        System.out.println("sb3==sb4 - " + (sb3 == sb4));
        System.out.println("sb3.equals(sb4) - " + (sb3.equals(sb4)));


    }
}
