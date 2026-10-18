package com.vcube.campuspluse.controller;

import java.util.List;
import java.util.Optional;

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

import com.vcube.campuspluse.model.CampusPluse;
import com.vcube.campuspluse.repo.CampusPluseRepo;


@RestController
@RequestMapping("/campusplus")
@CrossOrigin(origins="http://localhost:3000")
public class CampusPluseController {
	
	@Autowired
	CampusPluseRepo  campusPluseRepo;
	
	@PostMapping("/insert")
	CampusPluse insertStudent(@RequestBody CampusPluse c) {
		return campusPluseRepo.save(c);
	}
	@GetMapping("/getstudents")
	
	List<CampusPluse> getAllStudents() {
		return campusPluseRepo.findAll();
	}
	
	@GetMapping("/getstudent/{id}")
	CampusPluse getStudentById(@PathVariable Integer id) {
		return campusPluseRepo.findById(id).get();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteStudentById(@PathVariable Integer id) {
		campusPluseRepo.deleteById(id);
		 return "Deleted Sucessfully";
	}
 
}
