package com.sunbeam.p2;

import java.util.Date;

// Bounded Type Parameter
class Box<T extends Number> {
    private T obj;// reference

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

public class Program01 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>();
        b1.setObj(new Integer(10));
        Integer i1 = b1.getObj();
        System.out.println("I1 - " + i1);

        Box<Double> b2 = new Box<Double>();
        b2.setObj(new Double(10.11));
        Double d1 = b2.getObj();
        System.out.println("D1 - " + d1);

        //Box<String> b2 = new Box<String>(); // NOT OK
        //Box<Date> b3 = new Box<Date>();// NOT OK


    }
}
