package com.vcube.campuspluse.model;


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
	@Table(name="Booking76")
	@Setter
	@Getter
	public class Booking {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		Integer booking_id;
		
		
		Integer booking_date;
		Integer start_time;
		Integer end_time;
		String status;
		
		@ManyToOne
		@JoinColumn(name = "student_id", referencedColumnName = "cid")
		private Student student;

		    @ManyToOne
		    @JoinColumn(name = "resource_id")
		    private Resources resources;

}
