package com.vcube.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.student.model.Booking;


public interface BookingRepo extends JpaRepository<Booking,Integer> {

}
