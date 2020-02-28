package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RepositoryRestResource
public interface CustomerRepository extends JpaRepository <Customer, Long>, CustomerRepositoryCustom {
    List<Customer> findAllByCourseName(String name);
    List<Customer> findAllByCourseTownAndCourseName(String courseTown, String courseName);
    List<Customer> findAllOverGivenAgeInCustomerTownNameAndGivenCourseName(int age, String customerTown, String courseName);

}
