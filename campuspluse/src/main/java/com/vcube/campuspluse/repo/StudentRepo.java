package com.vcube.campuspluse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.campuspluse.model.Student;
@Repository

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
