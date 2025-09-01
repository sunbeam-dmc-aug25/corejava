package com.sunbeam.p3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
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
}

public class Program01 {

    public static void displayProducts(Product[] arr, String message) {
        System.out.println("----------------------------------------------------------");
        System.out.println(message);
        System.out.println("----------------------------------------------------------");
        for (Product p : arr)
            System.out.println(p);
        System.out.println("----------------------------------------------------------");
    }


    public static void main(String[] args) {
        Product[] arr = new Product[5];
        arr[0] = new Product(5, "Pen", 10);
        arr[1] = new Product(1, "Pencil", 5);
        arr[2] = new Product(4, "Book", 50);
        arr[3] = new Product(2, "Eraser", 8);
        arr[4] = new Product(3, "Ruler", 12);

        displayProducts(arr, "All Products unsorted -> ");
        class ProductIdComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.pid - o2.pid;
            }
        }
        ProductIdComparator idComparator = new ProductIdComparator();
        Arrays.sort(arr, idComparator);
        displayProducts(arr, "Products Sorted on pid -> ");

        class ProductNameComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.name.compareTo(o2.name);
            }
        }
        //ProductNameComparator nameComparator = new ProductNameComparator();
        Arrays.sort(arr, new ProductNameComparator()); // Anonymous Object
        displayProducts(arr, "Products Sorted on name -> ");

    }
}
