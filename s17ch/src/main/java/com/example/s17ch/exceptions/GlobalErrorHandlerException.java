package com.example.s17ch.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalErrorHandlerException {
    @ExceptionHandler(CourseException.class)
    public ResponseEntity<CourseResponse> handleException(CourseException courseException){
        CourseResponse courseResponse =
                new CourseResponse(courseException.getStatus().value(), courseException.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(courseResponse,courseException.getStatus());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CourseResponse> handleException(Exception exception){
        CourseResponse courseResponse =
                new CourseResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage(),LocalDateTime.now());
        return new ResponseEntity<>(courseResponse, HttpStatus.BAD_REQUEST);
    }
}
