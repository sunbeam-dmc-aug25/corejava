package com.sunbeam.p4;

public class Program {
    static int outerField1;
    int outerField2;

    public void method1() {
        class Local {
            int localfield2;

            public void localmethod2() {
                System.out.println(localfield2);
                System.out.println(outerField1);
                System.out.println(outerField2);

            }
        }
    }

    public static void method2() {
        class Local {
            int localfield2;

            public void localmethod2() {
                System.out.println(localfield2);
                System.out.println(outerField1);
                //System.out.println(outerField2);// NOT OK
            }
        }
    }


}
