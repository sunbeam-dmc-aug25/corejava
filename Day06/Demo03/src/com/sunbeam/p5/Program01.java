package com.sunbeam.p5;

interface Displayable {
    void display();
}

interface Printable {
    void display();
}

class Test implements Printable, Displayable {
    @Override
    public void display() {
    }

}

interface I1 {

}

interface I2 {

}

interface I3 extends I1 {

}

class C1 {

}

class C2 {

}

class C3 extends C1 implements I1, I2 {

}


public class Program01 {
    public static void main(String[] args) {
        //        class C3 extends C1
//        class C3 implements I1
//        class C3 implements I1, I2
//        class C3 extends C1 implements I1, I2

//        class C3 extends C1, C2 // NOT OK
//        class C3 implements C1 // NOT OK
//        class C3 extends I1 /// NOT OK
//        class C3  implements I1, I2 extends C1 // NOT OK

//        interface I3 extends I1
//        interface I3 extends I1, I2

//        interface I3 implements I1 // NOT OK
//        interface I3 implements C1 // NOT OK
//        interface I3 extends C1 // NOT OK
    }
}
