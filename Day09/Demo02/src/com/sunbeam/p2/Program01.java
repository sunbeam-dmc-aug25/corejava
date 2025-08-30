package com.sunbeam.p2;

import java.util.ArrayList;
import java.util.List;

public class Program01 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Anil");
        l1.add("Mukesh");
        l1.add("Ramesh");
        l1.add("Suresh");
        l1.add("Ram");
        l1.add("Suresh");

        l1.add(2, "Sham");

        l1.set(5, "Pratik");

        for (String e : l1)
            System.out.println(e);

        System.out.println("Element at index 3 - " + l1.get(3));
        System.out.println("Index of Suresh - " + l1.indexOf("Suresh"));
        System.out.println("Last Index of Suresh - " + l1.lastIndexOf("Suresh"));

        System.out.println("Size of l1 - " + l1.size());
        l1.remove("Mukesh");
        l1.remove(1);
        System.out.println("After remove Size of l1 - " + l1.size());

    }
}
