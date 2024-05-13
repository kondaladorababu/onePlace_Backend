package com.onePlace.onePlaceBackend.ExceptionHandler.oneHomeSprintItemsExceptionHandlers;

public class SprintItemNotFoundException extends RuntimeException{

    public SprintItemNotFoundException(String message) {
        super(message);
    }

    public SprintItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SprintItemNotFoundException(Throwable cause) {
        super(cause);
    }
}
