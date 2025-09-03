package com.sunbeam.p3;

import java.util.Date;

public class Program {
    public void method1() {
        int localvar1 = 10;
        // local members
        // static int num1 = 10; // NOT OK
        class Local {
            //static int localfield1; // NOT OK
            int localfield2;

            //public static void localmethod1(){} // NOT OK
            public void localmethod2() {
                System.out.println(localfield2);
                System.out.println(localvar1); // should be final or effectively final
            }
        }
    }

    public static void method2() {
        //static int num1 = 10; // NOT OK
        int localvar1 = 10;
        //localvar1 = 20;


        class Local {
            //static int localfield1; // NOT OK
            int localfield2;

            //public static void localmethod1(){} // NOT OK
            public void localmethod2() {
                System.out.println(localfield2);
                System.out.println(localvar1);  // should be final or effectively final
                Date d1;
                
            }
        }
    }


}
