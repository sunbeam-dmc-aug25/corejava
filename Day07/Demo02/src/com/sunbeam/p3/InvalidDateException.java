package com.sunbeam.p3;

// unchecked
public class InvalidDateException extends RuntimeException {

    public InvalidDateException() {

    }

    public InvalidDateException(String message) {
        super(message);
    }
}
