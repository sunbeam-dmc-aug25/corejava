package com.sunbeam.p4;

class Test {
    Test() {
        System.out.println("Test ctor");
    }

 
}

public class Program01 {
    public static void testMethod() {
        Test t1 = new Test();
        t1 = null;
        //System.gc();
        Runtime.getRuntime().gc();
    }

    public static void main(String[] args) {
        testMethod();
    }
}
