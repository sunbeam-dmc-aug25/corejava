package com.sunbeam.p2;

public class Date {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if (day <= 0 || day > 31)
            throw new RuntimeException(); // new unchecked Exception
        this.day = day;
    }

    public void setMonth(int month) throws Exception {
        if (month <= 0 || month > 12)
            throw new Exception(); // Checked Exception
        this.month = month;
    }

    public void setYear(int year) throws Exception {
        if (year < 1900)
//            throw new RuntimeException("Year should be > 1900");
            throw new Exception("Year should be > 1900");
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
}
