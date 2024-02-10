package com.example.s17ch.controller;

import com.example.s17ch.entity.HighCourseGpa;
import com.example.s17ch.entity.LowCourseGpa;
import com.example.s17ch.entity.MediumCourseGpa;
import com.example.s17ch.model.Course;
import com.example.s17ch.model.CourseGpa;
import com.example.s17ch.model.Grade;
import jakarta.annotation.PostConstruct;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Uygulamayı yeniden başlatmadığım için findCourse methodu çalışmadı
 */

@RestController
@RequestMapping("/workintech/courses")
public class CourseController {
    private List<Course> courses;
    private int totalGpa;
    /* private HighCourseGpa highCourseGpa;
    private MediumCourseGpa mediumCourseGpa;
    private LowCourseGpa lowCourseGpa;
    */




    @PostConstruct
    void init(){
        /*
        this.lowCourseGpa = lowCourseGpa;
        this.mediumCourseGpa = mediumCourseGpa;
        this.highCourseGpa = highCourseGpa;
        */
        courses = new ArrayList<>();

        courses.add(new Course(1,"Economics", 2, new Grade(15,"Compulsory Course")));
        courses.add(new Course(2,"History", 3, new Grade(15,"Compulsory Course")));
        courses.add(new Course(3,"Statistic", 4, new Grade(5,"Elective Course")));
    }
    @GetMapping
    public List<Course> findAll(){
        return courses;
    }
    @GetMapping("/{name}")
    public Course findCourse(@PathVariable String name){

        for(Course course: courses){
            if(course.getName().equalsIgnoreCase(name)){
                return course;
            }
        }
        return null;
    }

    @PostMapping
    public void addCourse(@RequestBody Course course){


        courses.add(course);
        /*
        int totalGpa = 0;
        if(course.getCredit() <= 2){
            totalGpa = course.getGrade().getCoefficient()*course.getCredit()*lowCourseGpa.getGpa();
        } else if(course.getCredit() == 3){
            totalGpa = course.getGrade().getCoefficient()*course.getCredit()*lowCourseGpa.getGpa();
        } else if(course.getCredit() == 4){
            totalGpa = course.getGrade().getCoefficient()*course.getCredit()*lowCourseGpa.getGpa();
        }
        String message = course.toString()+ ". TotalGpa: " + totalGpa;
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(message);

         */
    }

}
