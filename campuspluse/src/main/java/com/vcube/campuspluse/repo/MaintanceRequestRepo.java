package com.vcube.campuspluse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.campuspluse.model.MaintanceRequest;


@Repository
	public interface MaintanceRequestRepo extends JpaRepository<MaintanceRequest,Integer>{

	

}
