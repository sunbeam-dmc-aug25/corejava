package com.sunbeam.p1;

//
public class Person implements Cloneable {
    String name;
    String city;
    Date dob;

    Person() {
        dob = new Date();
    }

    public Person(String name, String city, int day, int month, int year) {
        this.name = name;
        this.city = city;
        this.dob = new Date(day, month, year);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", dob=" + dob +
                '}';
    }

}
