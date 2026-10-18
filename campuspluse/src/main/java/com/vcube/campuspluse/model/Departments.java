package com.vcube.campuspluse.model;



	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.Getter;
	import lombok.Setter;

	@Entity
	@Table(name="departments76")
	@Setter
	@Getter

	public class Departments {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		Integer department_Id;
		
		String department_name;
		String hod_name;
		public Integer getDepartment_Id() {
			return department_Id;
		}
		public void setDepartment_Id(Integer department_Id) {
			this.department_Id = department_Id;
		}
		public String getDepartment_name() {
			return department_name;
		}
		public void setDepartment_name(String department_name) {
			this.department_name = department_name;
		}
		public String getHod_name() {
			return hod_name;
		}
		public void setHod_name(String hod_name) {
			this.hod_name = hod_name;
		}
		

	}



