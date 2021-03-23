package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.Course;
import com.techspirit.casein.service.prototype.ServiceCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseProgress {
    private final ServiceCourse serviceCourse;

    @Autowired
    public CourseProgress(ServiceCourse serviceCourse) { this.serviceCourse = serviceCourse;}

    @CrossOrigin
    @GetMapping(value = "/courses/{id}")
    public ResponseEntity<Course> read(@PathVariable(name = "id") int id){
        final Course course = serviceCourse.read(id);

        return course != null
                ? new ResponseEntity<>(course, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
