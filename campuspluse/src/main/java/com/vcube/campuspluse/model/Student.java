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
	@Table(name="student76")
	@Setter
	@Getter
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "cid")
		private Integer cid;
		
		
		String name;
		String email;
		String depatment;
		Integer year;
		
		
		@ManyToOne
		@JoinColumn(name = "department_id", referencedColumnName = "department_id")
		private Departments departments;

		

	}


