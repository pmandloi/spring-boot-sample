package com.app.springbootsample.exception;

public class StudentInsertionException extends RuntimeException {
    private final String message;

    public StudentInsertionException(String message) {
        super(message);
        this.message = message;
    }
}
