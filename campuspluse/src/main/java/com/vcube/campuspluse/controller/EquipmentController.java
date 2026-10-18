

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
import com.vcube.campuspluse.repo.CampusPluseRepo;
import com.vcube.campuspluse.repo.DepartmentsRepo;
import com.vcube.campuspluse.repo.EquipmentRepo;


@RestController
@RequestMapping("/equipment")
@CrossOrigin(origins="http://localhost:3000")
public class EquipmentController {
	
	@Autowired
	EquipmentRepo  equipmentRepo;
	
	@PostMapping("/insertequi")
	Equipment insertStudent(@RequestBody Equipment c) {
		return equipmentRepo.save(c);
	}
	@GetMapping("/getequipments")
	
	List<Equipment> getAllStudents() {
		return equipmentRepo.findAll();
	}
	
	@GetMapping("/getequipment/{id}")
	Equipment getStudentById(@PathVariable Integer id) {
		return equipmentRepo.findById(id).get();
	}
	
	@DeleteMapping("/deletequi/{id}")
	String deleteStudentById(@PathVariable Integer id) {
		equipmentRepo.deleteById(id);
		 return "Deleted Sucessfully";
	}
}
