package com.sunbeam.p2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program02 {
    public static void main(String[] args) {
        //Set<String> s1 = new HashSet<>(); // order of the elements is not maintained
        //Set<String> s1 = new LinkedHashSet<>(); // maintains order of insertion
        Set<String> s1 = new TreeSet<>(); // maintains natural order
        s1.add("Mukesh");
        s1.add("Anil");
        s1.add("Rohan");
        s1.add("Ramesh");
        s1.add("Suresh");
        s1.add("Suresh"); // Duplicates are not allowed


        System.out.println(s1);
        System.out.println("Size of s1 - " + s1.size());
    }
}
