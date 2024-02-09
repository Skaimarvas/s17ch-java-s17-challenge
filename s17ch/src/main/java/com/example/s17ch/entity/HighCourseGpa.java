package com.example.s17ch.entity;

import com.example.s17ch.model.CourseGpa;

public class HighCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 10;
    }
}
