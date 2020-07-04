package com.bl.demo.demo.exception;

public class UserExceptions extends RuntimeException{
    String message;
    public enum ExceptionType {
        USER_PRESENT;

    }
    public ExceptionType type;

    public UserExceptions(String message, ExceptionType type) {
        //super(message);
        this.message=message;
        this.type = type;
    }
}
