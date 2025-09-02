package com.sunbeam.p4;

import java.util.function.BinaryOperator;

public class Program03 {
    public static void doArithmeticOperation(BinaryOperator<Integer> op) {
        System.out.println("Result - " + op.apply(10, 5));
    }

    public static void main(String[] args) {
        //doArithmeticOperation((x, y) -> x + y);

        doArithmeticOperation(Integer::sum); // Method reference
        // shorthand implementation of lambda expression
        // :: = method reference operator

    }
}
