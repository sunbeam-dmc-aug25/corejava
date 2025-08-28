package com.sunbeam.p3;

public class Date {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if (day <= 0 || day > 31)
            throw new InvalidDateException(); // custom unchecked exception
        this.day = day;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new InvalidDateException("Month should be between 1 and 12");
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1900)
            throw new InvalidDateException("Year should be > 1900");
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
