
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
import com.vcube.campuspluse.repo.StudentRepo;
import com.vcube.campuspluse.model.Resources;
import com.vcube.campuspluse.model.Student;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    // Insert resource
    @PostMapping("/insertstudent")
    Student insertStudent(@RequestBody Student c) {
        return studentRepo.save(c);
    }

    // Get all resources
    @GetMapping("/getstudents")
    List<Student> getResources() {
        return studentRepo.findAll();
    }

    // Get resource by ID
    @GetMapping("/getstudent/{id}")
    Student getResourceById(@PathVariable Integer id) {
        return studentRepo.findById(id).get();
    }

    // Delete resource by ID
    @DeleteMapping("/deletestu/{id}")
    String deleteStudentById(@PathVariable Integer id) {
    	studentRepo.deleteById(id);
        return "Deleted Successfully";
    }
}
