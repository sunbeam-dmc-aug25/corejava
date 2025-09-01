package com.sunbeam.p5;

import java.util.*;

public class Program01 {
    public static void main(String[] args) {
//        Map<Integer, String> m1 = new HashMap<>(); // Order is not maintained
        Map<Integer, String> m1 = new LinkedHashMap<>(); // Insertion order is maintained
//        Map<Integer, String> m1 = new TreeMap<>(); // Maintains Natural ordering of keys
        m1.put(154, "Sham");
        m1.put(132, "Mukesh");
        m1.put(143, "Ramesh");
        m1.put(121, "Suresh");
        //m1.put(121, "Suresh"); // we cannot add duplicate keys
        m1.put(121, "Anil"); // If key is duplicated value will be replaced
        m1.put(165, "Anil"); // Duplicate values are allowed
        m1.put(null, "Ram"); // null key is allowed
        m1.put(null, "Ram"); // multiple null keys are not allowed
        m1.put(176, null); // null value is allowed
        m1.put(187, null); // multiple null values are allowed

        Set<Integer> keys = m1.keySet();
        System.out.println("keys - " + keys);

        Collection<String> values = m1.values();
        System.out.println("values - " + values);

        System.out.println(m1);
        System.out.println("size of m1 - " + m1.size());
    }
}
