package com.sunbeam.p1;

class Outer {
    // members of class (static,nonstatic)
    // Fields,Methods,Class
    static int outerField1;
    int outerField2;

    public static void outerMethod1() {

    }

    public void outerMethod2() {

    }

    static class Inner {
        static int innerField1;
        int innerField2;

        public static void innerMethod1() {
            System.out.println(innerField1);
            //System.out.println(innerField2); // NOT OK
            System.out.println(outerField1);
            // System.out.println(outerField2);// NOT OK
        }

        public void innerMethod2() {
            System.out.println(innerField1);
            System.out.println(innerField2);
            System.out.println(outerField1);
            //System.out.println(outerField2); // NOT OK
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Outer.Inner i1 = new Outer.Inner();
    }
}
