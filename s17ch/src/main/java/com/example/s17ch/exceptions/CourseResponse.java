package com.example.s17ch.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseResponse {
    private int status;
    private String message;
    private LocalDateTime createdAt;


}
