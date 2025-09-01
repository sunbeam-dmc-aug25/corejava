package com.sunbeam.p5;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program02 {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new LinkedHashMap<>(); // Insertion order is maintained
        m1.put(154, "Sham");
        m1.put(132, "Mukesh");
        m1.put(143, "Ramesh");
        m1.put(121, "Suresh");


        System.out.println(m1);
        Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
        for (Map.Entry<Integer, String> e : s1)
            System.out.println(e.getKey() + " = " + e.getValue());
    }
}
