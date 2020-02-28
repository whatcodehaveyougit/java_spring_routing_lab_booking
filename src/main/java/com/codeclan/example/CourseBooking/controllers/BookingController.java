package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping(value = "/findByDate")
    public List<Booking> findByDate(String date){
        return bookingRepository.findByDate(date);
    }

}
