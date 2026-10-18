package com.vcube.campuspluse.model;

	
import java.time.LocalDateTime;
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
	@Table(name="maintanceRequest76")
	@Setter
	@Getter

	public class MaintanceRequest {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "maintenance_id")
		private Integer maintenanceId;

		@Column(name = "description")
		private String description;

		@Column(name = "status")
		private String status;

	    @Column(name = "created_at")
		Integer created_at;
	    @ManyToOne
	    @JoinColumn(name = "student_id", referencedColumnName = "cid")
	    private Student student;

		    @ManyToOne
		    @JoinColumn(name = "resource_id")
		    private Resources resource;

	}


