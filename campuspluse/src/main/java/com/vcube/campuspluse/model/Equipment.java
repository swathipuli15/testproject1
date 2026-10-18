package com.vcube.campuspluse.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="equipment76")
@Setter
@Getter

public class Equipment  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer equipment_id;
	String name;
	Integer quantity;
	@Column(name = "equipment_condition")
	private String condition;


    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resources resources;
}

