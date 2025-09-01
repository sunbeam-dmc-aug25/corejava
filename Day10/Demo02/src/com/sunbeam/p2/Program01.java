package com.sunbeam.p2;

interface Printable {
    default void display() {
        System.out.println("Printable::display");
    }
}

interface Displayable {
    default void display() {
        System.out.println("Displayable::display");
    }
}

class Parent {
    public void display() {
        System.out.println("Parent::display");

    }
}

class Test extends Parent implements Printable, Displayable {

}


public class Program01 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
    }
}
