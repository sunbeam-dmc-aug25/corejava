package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program02 {

    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
//        Collection<Integer> c1 = new ArrayDeque<>();
//        Collection<Integer> c1 = new LinkedHashSet<>();

        c1.add(new Integer(10)); // add the elements in the collection
        c1.add(20); // Auto-Boxing
        c1.add(30);
        c1.add(40);
        c1.add(50);
        System.out.println("size of c1 - " + c1.size());

        System.out.println("c1 contains 30 - " + c1.contains(30));
        System.out.println("c1 contains 80 - " + c1.contains(80));

        System.out.println("30 removed - " + c1.remove(30));
        System.out.println("80 removed - " + c1.remove(80));

        System.out.println("size of c1 - " + c1.size());


    }
}
