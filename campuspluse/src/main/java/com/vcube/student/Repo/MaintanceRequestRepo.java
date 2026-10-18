package com.vcube.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.student.model.MaintanceRequest;

public interface MaintanceRequestRepo extends JpaRepository<MaintanceRequest,Integer>{

}
