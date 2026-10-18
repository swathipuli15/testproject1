package com.vcube.campuspluse.controller;


	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.vcube.campuspluse.model.Booking;
import com.vcube.campuspluse.model.CampusPluse;
import com.vcube.campuspluse.repo.BookingRepo;


	@RestController
	@RequestMapping("/booking")
	@CrossOrigin(origins = "http://localhost:3000")
	public class BookingController {
		
		@Autowired
		BookingRepo bookingRepo;
		
		@PostMapping("/insertbook")
		Booking insertStudent(@RequestBody Booking c) {
			return  bookingRepo.save(c);
		}
		@GetMapping("/getbooks")
		
		List<Booking> getAllStudents() {
			return  bookingRepo.findAll();
		}
		
		@GetMapping("/getbook/{id}")
		Booking getStudentById(@PathVariable Integer id) {
			return  bookingRepo.findById(id).get();
		}
		
		@DeleteMapping("/deletebook/{id}")
		String deleteStudentById(@PathVariable Integer id) {
			 bookingRepo.deleteById(id);
			 return "Deleted Sucessfully";
		
	 
	}


}
