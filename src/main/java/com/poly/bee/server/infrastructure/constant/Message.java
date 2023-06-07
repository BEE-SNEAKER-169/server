package com.poly.bee.server.infrastructure.constant;


public enum Message {

    SUCCESS("Success"),

    ERROR_UNKNOWN("Error Unknown");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
