package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/findByRating")
    public List<Course> findByRating(@RequestParam int rating){
        return courseRepository.findByRating(rating);
    }

    @GetMapping(value = "/findAllByCustomerName")
    public List<Course> findAllByCustomerName(@RequestParam String name) {
        return courseRepository.findAllByCustomerName(name);
    }

}

