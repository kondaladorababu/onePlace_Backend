package com.onePlace.onePlaceBackend.ExceptionHandler.oneHomeSprintItemsExceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SprintItemRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<SprintItemErrorResponse>handleException(SprintItemNotFoundException exc){
        SprintItemErrorResponse error = new SprintItemErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
