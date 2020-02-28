package com.codeclan.example.CourseBooking.repositories.CourseRepository;

import com.codeclan.example.CourseBooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findAllByCustomerName(String name);
}