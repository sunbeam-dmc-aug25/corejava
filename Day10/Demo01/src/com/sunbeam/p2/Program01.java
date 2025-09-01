package com.sunbeam.p2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program01 {
    public static void main(String[] args) {
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("Anil");
        s1.add("Mukesh");
        s1.add("Ramesh");
        s1.add("Mukesh"); // Duplicates are not added
        s1.add(null);
        s1.add(null); // multiple null values are not added

        System.out.println(s1);
        System.out.println("Size of s1 - " + s1.size());
    }
}
