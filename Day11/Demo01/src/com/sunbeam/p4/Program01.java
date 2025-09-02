package com.sunbeam.p4;

import java.util.function.BinaryOperator;

public class Program01 {
    public static void doArithmeticOperation(BinaryOperator<Integer> op) {
        System.out.println("Result - " + op.apply(10, 5));
    }

    public static void main(String[] args) {
//        class MyBinaryOperator implements BinaryOperator<Integer> {
//            @Override
//            public Integer apply(Integer x, Integer y) {
//                return x + y;
//            }
//        }
//        MyBinaryOperator myBinaryOperator = new MyBinaryOperator();
//        doArithmeticOperation(myBinaryOperator);

        // Non capturing lambda expression
        doArithmeticOperation((x, y) -> x + y);
        doArithmeticOperation((x, y) -> x - y);
        doArithmeticOperation((x, y) -> x * y);
        doArithmeticOperation((x, y) -> x / y);
    }
}
