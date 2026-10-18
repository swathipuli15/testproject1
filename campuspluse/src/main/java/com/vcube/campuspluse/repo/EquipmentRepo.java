package com.vcube.campuspluse.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.campuspluse.model.Equipment;


@Repository

public interface EquipmentRepo extends JpaRepository<Equipment,Integer> {

}


