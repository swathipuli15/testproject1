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
import com.vcube.campuspluse.model.Departments;
import com.vcube.campuspluse.repo.CampusPluseRepo;
import com.vcube.campuspluse.repo.DepartmentsRepo;



@RestController
@RequestMapping("/departments")
@CrossOrigin(origins="http://localhost:3000")
public class DepartmentsController {
	
	@Autowired
	DepartmentsRepo  departmentsRepo;
	
	@PostMapping("/insertdept")
	 Departments insertStudent(@RequestBody Departments c) {
		return departmentsRepo.save(c);
	}
	@GetMapping("/getdepartments")
	
	List<Departments> getAllStudents() {
		return departmentsRepo.findAll();
	}
	
	@GetMapping("/getdepartment/{id}")
	 Departments getStudentById(@PathVariable Integer id) {
		return departmentsRepo.findById(id).get();
	}
	
	@DeleteMapping("/deletedept/{id}")
	String deleteStudentById(@PathVariable Integer id) {
		departmentsRepo.deleteById(id);
		 return "Deleted Sucessfully";
	}
}
