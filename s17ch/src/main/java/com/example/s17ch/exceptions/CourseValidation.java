package com.example.s17ch.exceptions;

import com.example.s17ch.model.Course;
import org.springframework.http.HttpStatus;

import java.util.List;

public class CourseValidation {
    private static final String ID_IS_NOT_VALID = "Course id is not valid";
    private static final String COURSE_IS_NOT_EXIST = "Course with given id is not exist";
    private static final String COURSE_CREDENTIALS_ARE_NOT_VALID = "Course credentials are not valid";

    public static void isIdValid(int id){

            if(id < 0){
                throw new CourseException(ID_IS_NOT_VALID + id, HttpStatus.BAD_REQUEST);
            }

    }
    public static void isCourseExist(List<Course> courses, int id){
        for(Course course : courses){
            if(!(course.getCourseId() == id)){
                throw new CourseException(COURSE_IS_NOT_EXIST + id, HttpStatus.NOT_FOUND);
            }
        }
    }

    public static void isCourseCredentialsValid(Course course){
        if (course == null ||
                course.getCourseId() == 0 ||
                course.getName() == null ||
                course.getName().isEmpty() ||
                course.getCredit() == 0 ||
                course.getGrade().getCoefficient() == 0 ||
                course.getGrade().getNote() == null ||
                course.getGrade().getNote().isEmpty()) {
            throw new CourseException(COURSE_CREDENTIALS_ARE_NOT_VALID, HttpStatus.BAD_REQUEST);
        }
    }
}
