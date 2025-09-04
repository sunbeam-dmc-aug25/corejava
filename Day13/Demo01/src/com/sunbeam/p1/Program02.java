package com.sunbeam.p1;

import java.lang.annotation.*;

// custom annotation
// meta annotations
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface MyAnnotation {

}

@MyAnnotation
class Employee {

    @MyAnnotation
    int empid;

    @MyAnnotation
    void method1() {

    }


}

public class Program02 {

    public static void main(String[] args) {

    }
}
