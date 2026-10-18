package com.vcube.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.student.model.Departments;

public interface DepartmentsRepo  extends JpaRepository<Departments,Integer>{

}
