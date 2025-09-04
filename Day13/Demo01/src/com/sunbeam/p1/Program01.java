package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface I1 {
    void method1();//SAM
}


public class Program01 {

    @Override
    public String toString() {

        return "";
    }

    @SuppressWarnings(value = {"unused", "rawtypes"})
    public static void main(String[] args) {
        System.out.println("Hello");
        //@SuppressWarnings("unused")
        int num1;

        //@SuppressWarnings(value = {"unused", "rawtypes"})
        List l1;
    }
}
