package com.sunbeam.p5;

import java.util.Date;

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
    // generic class reference
    // wildcard -> ?
    // restriction on generic class reference (Upper Bound, Lower Bound)
    // Lower Bound -> super
    public static void display(Box<? super Integer> b) {
        System.out.println("value - " + b.getObj());
    }

    public static void main(String[] args) {
//        Box b = new Box(); // Raw Type
//        b.setObj(new Date());
//        String s1 = (String) b.getObj();
//        System.out.println("s1 - " + s1);

        Box<Integer> b1 = new Box<>();
        b1.setObj(10);
        display(b1);

        Box<Double> b2 = new Box<>();
        b2.setObj(11.22);
        //display(b2); // NOT OK


        Box<String> b3 = new Box<>();
        b3.setObj("sunbeam");
        //display(b3); // NOT OK

        Box<Date> b4 = new Box<>();
        b4.setObj(new Date());
//        display(b4); // NOT OK

    }
}
