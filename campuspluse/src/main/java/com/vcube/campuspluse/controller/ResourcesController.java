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
import com.vcube.campuspluse.repo.ResourcesRepo;
import com.vcube.campuspluse.model.Resources;








import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/resources")
@CrossOrigin(origins = "http://localhost:3000")
public class ResourcesController {

    @Autowired
    ResourcesRepo resourcesRepo;

    // Insert resource
    @PostMapping("/insertresource")
    Resources insertStudent(@RequestBody Resources c) {
        return resourcesRepo.save(c);
    }

    // Get all resources
    @GetMapping("/getresources")
    List<Resources> getResources() {
        return resourcesRepo.findAll();
    }

    // Get resource by ID
    @GetMapping("/getresource/{id}")
    Resources getResourceById(@PathVariable Integer id) {
        return resourcesRepo.findById(id).get();
    }

    // Delete resource by ID
    @DeleteMapping("/deleteres/{id}")
    String deleteStudentById(@PathVariable Integer id) {
        resourcesRepo.deleteById(id);
        return "Deleted Successfully";
    }
}


