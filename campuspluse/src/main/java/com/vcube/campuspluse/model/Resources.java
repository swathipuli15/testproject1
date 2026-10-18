package com.vcube.campuspluse.model;


	import jakarta.persistence.Column;
import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.Getter;
	import lombok.Setter;

	@Entity
	@Table(name="Resource76")
	@Setter
	@Getter
	public class Resources {
		public Integer getResource_Id() {
			return resource_Id;
		}
		public void setResource_Id(Integer resource_Id) {
			this.resource_Id = resource_Id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "resource_id")
		Integer resource_Id;
		String Name;
		String type;
		String location;
		String Status;
		

	}


