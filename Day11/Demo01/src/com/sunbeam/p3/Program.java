package com.sunbeam.p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class Product implements Comparable<Product> {
    int pid;
    String name;
    double price;

    Product() {

    }

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.pid - o.pid;
    }
}

public class Program {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(5, "Pen", 10));
        productList.add(new Product(1, "Pencil", 5));
        productList.add(new Product(4, "Book", 50));
        productList.add(new Product(2, "Eraser", 8));
        productList.add(new Product(3, "Ruler", 12));

        System.out.println("Products sorted on natural ordering  -> ");
        Collections.sort(productList);
        productList.forEach(p -> System.out.println(p));

        System.out.println("Products sorted on name asc order  -> ");
        Collections.sort(productList, (p1, p2) -> p1.name.compareTo(p2.name));
        productList.forEach(p -> System.out.println(p));

        System.out.println("Products sorted on price desc order  -> ");
        Collections.sort(productList, (p1, p2) -> Double.compare(p2.price, p1.price));
//        productList.forEach(p -> System.out.println(p));
        productList.forEach(System.out::println); // Method Reference
        
    }
}
