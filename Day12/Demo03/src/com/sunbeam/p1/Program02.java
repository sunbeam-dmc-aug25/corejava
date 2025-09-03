package com.sunbeam.p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Program02 {
    public static void myJavapTool(Class c) {
        System.out.println("All the fields ->");
        System.out.println("----------------------------------------------------------------");
        Field[] fields = c.getDeclaredFields();
        for (Field e : fields)
            System.out.println(e);
        System.out.println("----------------------------------------------------------------");

        System.out.println("All the Constructors ->");
        System.out.println("----------------------------------------------------------------");
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor e : constructors)
            System.out.println(e);
        System.out.println("----------------------------------------------------------------");

        System.out.println("All the Methods ->");
        System.out.println("----------------------------------------------------------------");
        Method[] methods = c.getDeclaredMethods();
        for (Method e : methods)
            System.out.println(e);
        System.out.println("----------------------------------------------------------------");

    }

    public static void main(String[] args) {
        myJavapTool(String.class);
        myJavapTool(Object.class);
        myJavapTool(System.class);
    }
}
