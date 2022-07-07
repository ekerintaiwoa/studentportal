package com.studentportal.studentportal.services;

import com.studentportal.studentportal.model.Course;
import com.studentportal.studentportal.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServicesImplem  implements CourseServicesInterface{


    @Autowired
    CourseRepository courseRepository ;


    public Course saveCourse( final Course course){
        courseRepository.save(course);

      return course;

    }



    public Course updateCourse(final Course course){

       return    courseRepository.save(course) ;


    }



    public void deleteCourse(final int course_id){


         courseRepository.deleteById(course_id);
    }



    public long numberOfCourses(){

      return courseRepository.count();

    }




   public List<Course > showAllCourses(){

    return courseRepository.findAll();


   }





}
