package com.vcube.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.student.model.Resources;

public interface ResourcesRepo extends JpaRepository<Resources,Integer> {

}
