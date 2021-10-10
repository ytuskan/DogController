package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog Not Found!")
public class DogNotFoundException extends RuntimeException{
    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
