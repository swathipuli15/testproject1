package com.langfundamentals;

public class Student_2 {
	Integer student_ID;
	String student_Name;
	String gender;
	String branchName;
	String collageName;
	void display() {
		System.out.println("Student Number:" +student_ID);
		System.out.println("Student Name:" +student_Name);
		System.out.println("Gender:" +gender);
		System.out.println("Branch Name:" +branchName);
		System.out.println("collage Name"+ collageName);
	}

	public static void main(String[] args) {
		Student_2 s1=new Student_2();
		s1.student_ID=100;
		s1.student_Name="Pondu";
		s1.gender="F";
		s1.branchName="CSE";
		s1.collageName="SVIET";
		s1.display();
	}

		
		
		
	
		
		

	}


