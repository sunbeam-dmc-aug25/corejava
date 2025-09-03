package com.sunbeam.p2;

class Outer {
    // members of class (static,nonstatic)
    // Fields,Methods,Class
    static int outerField1;
    int outerField2;

    public static void outerMethod1() {

    }

    public void outerMethod2() {

    }

    // Non static inner class
    // we cannot declare static members
    class Inner {
        //static int innerField1; // NOT OK
        int innerField2;

        // public static void innerMethod1() {} // NOT OK

        public void innerMethod2() {
            System.out.println(innerField2);
            System.out.println(outerField1);
            System.out.println(outerField2);
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.new Inner();

        Outer.Inner i2 = new Outer().new Inner();
    }
}
