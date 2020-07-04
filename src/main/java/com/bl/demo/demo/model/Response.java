package com.bl.demo.demo.model;

public class Response {
    String message;
    User data;
    Integer statusCode;

    public Response(String message, User data, Integer statusCode) {
        this.message = message;
        this.data = data;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public User getData() {
        return data;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
