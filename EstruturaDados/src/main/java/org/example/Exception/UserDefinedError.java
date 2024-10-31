package org.example.Exception;

public class UserDefinedError extends RuntimeException {
    public UserDefinedError(String message) {
        super(message);
    }
}
