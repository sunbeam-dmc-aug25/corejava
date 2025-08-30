package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program03 {

    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
//        Collection<Integer> c1 = new ArrayDeque<>();
//        Collection<Integer> c1 = new LinkedHashSet<>();

        c1.add(10); // add the elements in the collection
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);

        System.out.println("size of c1 - " + c1.size());

        for (Integer e : c1)
            System.out.println("Element - " + e);
    }
}
