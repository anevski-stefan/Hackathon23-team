package com.example.backend.model.exceptions;

public class InvalidArgumentsException extends RuntimeException{
    public InvalidArgumentsException() {
        super("Invalid arguments exception");
    }
}
