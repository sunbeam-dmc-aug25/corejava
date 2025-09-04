package com.sunbeam.p2;

import java.lang.annotation.*;


//single value annnotation
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface MyAnnotation {
    String[] value();
}

@MyAnnotation("unused")
class Employee {

    @MyAnnotation(value = "rawtypes")
    int empid;

    @MyAnnotation({"unused", "rawtypes"})
    void method1() {

    }


}

public class Program01 {

    public static void main(String[] args) {

    }
}
