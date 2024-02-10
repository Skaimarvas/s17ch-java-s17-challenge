package com.example.s17ch.model;


import com.example.s17ch.entity.HighCourseGpa;
import com.example.s17ch.entity.LowCourseGpa;
import com.example.s17ch.entity.MediumCourseGpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Course {
    private int courseId;
    private String name;
    private int credit;
    private Grade grade;







}
