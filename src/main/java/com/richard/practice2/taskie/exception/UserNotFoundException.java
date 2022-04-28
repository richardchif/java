package com.richard.practice2.taskie.exception;

public class UserNotFoundException extends  RuntimeException {
    public UserNotFoundException(String message){
        super(message);
    }
}
