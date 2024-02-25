package com.online_portal.demo.exception;

public class UserNotFoundException extends Throwable {
    public UserNotFoundException(String userAlreadyExist) {
        super(userAlreadyExist);
    }
}
