package com.sunbeam.p2;

public class Program01 {
    public static void main(String[] args) {
        StringBuffer b1 = new StringBuffer("sunbeam"); // Thread Safe
        StringBuilder b2 = new StringBuilder("sunbeam");// Not Thread Safe
        b1.append("Infotech");
        b2.append("Infotech");

        System.out.println("b1 - " + b1);
        System.out.println("b2 - " + b2);
    }
}
