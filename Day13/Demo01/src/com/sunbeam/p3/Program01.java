package com.sunbeam.p3;

import java.lang.annotation.*;
import java.util.Scanner;


//multi-value annnotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface DeveloperInfo {
    String name();

    String designation();
}

@DeveloperInfo(name = "Anil", designation = "Team Lead")
class Employee {
    int empid;
    String name;
    double salary;

    @DeveloperInfo(name = "Mukesh", designation = "Sr. Developer")
    void accept(Scanner sc) {

    }

    @DeveloperInfo(name = "Ramesh", designation = "Jr. Developer")
    void display() {

    }
}


public class Program01 {

    public static void main(String[] args) {

    }
}
