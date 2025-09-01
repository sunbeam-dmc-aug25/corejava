package com.sunbeam.p2;

// Functional Interface
@FunctionalInterface
interface I1 {
    // Single Abstract Method
    void method1();
}

// Not a functional interface
interface I2 {
    void method1();

    void method2();
}

@FunctionalInterface
interface I3 {
    void method1(); // SAM

    default void method2() {

    }
}

@FunctionalInterface
interface I4 {
    void method1(); // SAM

    default void method2() {

    }

    static void method3() {

    }
}


public class Program02 {
    public static void main(String[] args) {

    }
}
