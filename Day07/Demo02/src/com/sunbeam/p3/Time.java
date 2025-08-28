package com.sunbeam.p3;

public class Time {
    private int hr;
    private int min;

    public void setHr(int hr) throws InvalidTimeException {
        if (hr < 0 || hr > 23)
            throw new InvalidTimeException();
        this.hr = hr;
    }

    public void setMin(int min) throws InvalidTimeException {
        if (min < 0 || min > 59)
            throw new InvalidTimeException("Min should be between 0 and 59");
        this.min = min;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hr=" + hr +
                ", min=" + min +
                '}';
    }
}
