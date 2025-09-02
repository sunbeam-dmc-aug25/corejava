package com.sunbeam.p4;

import java.util.function.BinaryOperator;

public class Program02 {
    public static void doArithmeticOperation(BinaryOperator<Integer> op) {
        System.out.println("Result - " + op.apply(10, 5));
    }

    public static void main(String[] args) {
        int z = 10;
        //z = 20; // should be final or effectively final
        // Capturing lambda expression
        doArithmeticOperation((x, y) -> x + y + z);

    }
}
