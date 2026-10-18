package com.vcube.campuspluse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.campuspluse.model.Resources;



@Repository
public interface ResourcesRepo extends JpaRepository<Resources,Integer> {

	

}
