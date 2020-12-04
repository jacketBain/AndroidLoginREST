package com.example.webserverandroid.dto;

public class RequestDTO {

    private String message;

    public RequestDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
