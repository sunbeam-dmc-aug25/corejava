package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Program01 {

    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
//        Collection<Integer> c1 = new ArrayDeque<>();
//        Collection<Integer> c1 = new LinkedHashSet<>();

        c1.add(10); // add the elements in the collection
        c1.add(20);
        c1.add(30);
        c1.add(40);
        System.out.println("size of c1 - " + c1.size());

        c1.clear(); // removes all the elements from the collection
        System.out.println("size of c1 after clear - " + c1.size());

    }
}
