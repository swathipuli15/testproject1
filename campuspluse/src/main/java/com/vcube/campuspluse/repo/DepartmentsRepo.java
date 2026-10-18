package com.vcube.campuspluse.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.campuspluse.model.Departments;


@Repository
public interface DepartmentsRepo  extends JpaRepository<Departments,Integer>{

	

	

}


