package com.sunbeam.p3;

class Singleton {
    // Step-2 -> Create a reference as a field that will point at the object of this class
    // the reference should be static
    private static Singleton ref = null;

    // Step1 -> Make the ctor as private
    private Singleton() {
        System.out.println("Inside Ctor");
    }

    // Step-3 -> provide a getter that will return the reference
    public static Singleton getInstance() {
        if (ref == null)
            ref = new Singleton();
        return ref;
    }

}

public class Program01 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
    }
}
