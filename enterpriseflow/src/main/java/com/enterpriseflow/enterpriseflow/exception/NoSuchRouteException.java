package com.enterpriseflow.enterpriseflow.exception;

public class NoSuchRouteException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "The expected resource is not found";

    public NoSuchRouteException() {
        super(DEFAULT_MESSAGE);
    }

    public NoSuchRouteException(String message) {
        super(message);
    }
}
