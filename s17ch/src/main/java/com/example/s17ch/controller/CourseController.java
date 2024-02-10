package com.example.s17ch.controller;

import com.example.s17ch.model.Course;
import com.example.s17ch.model.CourseGpa;
import com.example.s17ch.model.Grade;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/course")
public class CourseController {
    private List<Course> courses;

    @PostConstruct
    void init(){
        courses = new ArrayList<>();
        courses.add(new Course("Economics", 30, new Grade(6,"10")));
        courses.add(new Course("History", 30, new Grade(6,"10")));
    }

    @GetMapping
    public List<Course> findAll(){
        return courses.stream().toList();
    }
}
