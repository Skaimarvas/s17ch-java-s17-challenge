package com.example.s17ch.entity;

import com.example.s17ch.model.CourseGpa;

public class LowCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 3;
    }
}
