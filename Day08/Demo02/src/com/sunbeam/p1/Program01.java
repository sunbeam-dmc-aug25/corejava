package com.sunbeam.p1;

import java.util.Date;

// Generic class
class Box<T> {
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

        Box<String> b2 = new Box<String>();
        b2.setObj(new String("sunbeam"));
        //b2.setObj(new Double(20.22)); // NOT OK
        String s1 = b2.getObj();
        System.out.println("S1 - " + s1);

        Box<Date> b3 = new Box<Date>();
        b3.setObj(new Date());
        Date d1 = b3.getObj();
        System.out.println("D1 - " + d1);


    }
}
