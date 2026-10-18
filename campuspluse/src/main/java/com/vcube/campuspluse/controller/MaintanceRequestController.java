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
import com.vcube.campuspluse.model.Equipment;
import com.vcube.campuspluse.model.MaintanceRequest;
import com.vcube.campuspluse.repo.CampusPluseRepo;
import com.vcube.campuspluse.repo.DepartmentsRepo;
import com.vcube.campuspluse.repo.EquipmentRepo;
import com.vcube.campuspluse.repo.MaintanceRequestRepo;


@RestController
@RequestMapping("/maintain")
@CrossOrigin(origins="http://localhost:3000")
public class MaintanceRequestController {
	
	@Autowired
	MaintanceRequestRepo  maintanceRequestRepo;
	
	@PostMapping("/insertmaintanceRequest/{id}")
	MaintanceRequest insertStudent(@RequestBody MaintanceRequest c) {
		return  maintanceRequestRepo.save(c);
	}
	@GetMapping("/maintanceRequests")
	
	List<MaintanceRequest> getAllStudents() {
		return  maintanceRequestRepo.findAll();
	}
	
	@GetMapping("/maintanceRequest/get/{id}")
	MaintanceRequest getStudentById(@PathVariable Integer id) {
		return  maintanceRequestRepo.findById(id).get();
	}
	
	@DeleteMapping("/maintancedelete/{id}")
	String deleteStudentById(@PathVariable Integer id) {
		 maintanceRequestRepo.deleteById(id);
		 return "Deleted Sucessfully";
	}
}
