package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findAllByCourseName(String name);

    List<Customer> findAllByCourseTownAndCourseName(String courseTown, String courseName);

    List<Customer> findAllOverGivenAgeInCustomerTownNameAndGivenCourseName(int age, String customerTown, String courseName);
}