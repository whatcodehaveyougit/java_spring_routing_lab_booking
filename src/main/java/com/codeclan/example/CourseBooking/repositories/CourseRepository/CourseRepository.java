package com.codeclan.example.CourseBooking.repositories.CourseRepository;

import com.codeclan.example.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findByRating(int rating);
    List<Course> findAllByCustomerName(String name);

}
