package com.codeclan.example.CourseBooking.components;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public void DataLoader(){
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("John", "Edinburgh", 30);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Bob", "Glasgow", 25);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Sam", "Aberdeen", 40);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Sonia", "Glasgow", 33);
        customerRepository.save(customer4);


        Course course1 = new Course("Pottery", "Edinburgh", 5);
        courseRepository.save(course1);
        Course course2 = new Course("Shooting", "Gala", 3);
        courseRepository.save(course2);
        Course course3 = new Course("Basketball", "Inverness", 5);
        courseRepository.save(course3);

        Booking booking1 = new Booking("10-10-2020", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("06-06-2020", customer2, course2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("06-06-2020", customer3, course3);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("06-06-2020", customer4, course3);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("06-06-2020", customer1, course2);
        bookingRepository.save(booking5);


    }
}
