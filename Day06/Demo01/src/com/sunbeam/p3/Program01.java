package com.sunbeam.p3;

class Date {
    int day;
    int month;
    int year;

    Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object obj) // this -> d1 , obj -> d2
    {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Date) {
            Date d2 = (Date) obj; // Downcasting
            //return d1.day == d2.day && d1.month==d2.month && d1.year == d2.year
            //return this.day == obj.day; // Object Slicing
            return this.day == d2.day && this.month == d2.month && this.year == d2.year;
        }
        return false;
    }


}

public class Program01 {

    public static void main(String[] args) {
        Date d1 = new Date(1, 1, 2001);
        Date d2 = new Date(1, 1, 2001);
        System.out.println("d1 - " + d1);
        System.out.println("d2 - " + d2);
        System.out.println("d1==d2 - " + (d1 == d2));
        System.out.println("d1.equals(d2) - " + (d1.equals(d2))); // upcasting
        System.out.println("d1 hash - " + d1.hashCode());
        System.out.println("d2 hash - " + d2.hashCode());

    }

    public static void main1(String[] args) {
        Date d1 = new Date(1, 1, 2001);
        Date d2 = d1;
        System.out.println("d1 - " + d1);
        System.out.println("d2 - " + d2);
        System.out.println("d1==d2 - " + (d1 == d2));

    }
}
