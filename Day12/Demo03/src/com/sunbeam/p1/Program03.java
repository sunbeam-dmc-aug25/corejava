package com.sunbeam.p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class Employee {
    public void accept() {
        System.out.println("Employee::accept");
    }

    public void display() {
        System.out.println("Employee::display");
    }
}

class Date {
    public void accept() {
        System.out.println("Date::accept");
    }

    public void display() {
        System.out.println("Date::display");
    }
}

class Product {
    public void accept() {
        System.out.println("Product::accept");
    }

    public void display() {
        System.out.println("Product::display");
    }
}

public class Program03 {
    public static void doWork(Class c) {
        try {
            Object obj = c.newInstance();

            Method method1 = c.getDeclaredMethod("accept");
            Method method2 = c.getDeclaredMethod("display");

            method1.invoke(obj);
            method2.invoke(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        doWork(Employee.class);
        doWork(Product.class);
        doWork(Date.class);


    }
}
