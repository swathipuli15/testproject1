package com.vcube.campuspluse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.campuspluse.model.CampusPluse;

@Repository
public interface CampusPluseRepo extends JpaRepository<CampusPluse,Integer> {
	
	

}
