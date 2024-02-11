package com.example.s17ch.exceptions;

import org.springframework.http.HttpStatus;

public class CourseException extends RuntimeException {
    private HttpStatus status;
    public CourseException(String message, HttpStatus status){
         super(message);
         this.status = status;
    }
}
