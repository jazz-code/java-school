package com.lambdaschool.school.exceptions;

public class ValidationError {
    // list with 2 fields, code and message description
    private String code;
    private String message;

    //generate getters/setters
    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
