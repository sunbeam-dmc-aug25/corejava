package com.sunbeam.p1;

public class Program01 {
    public static void main(String[] args) {
        String s1 = "sunbeam";
        // way-1
        try {
            Class c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // way-2 -> If the class is present into the current classpath
        Class c2 = String.class;

        // way-3
        Class c3 = s1.getClass();
    }
}
