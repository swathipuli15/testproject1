package com.langfundamentals.constructors;

public class Student {
	//instance variables 
	int sid;
	String sname;
	String city;
	//No-arg constructor
	Student(){
	System.out.println("No-Arg constructor called");
		sid=101;
	 sname="pondu";
		
	}
	Student(int sid,String sname){
		System.out.println("Parameterised Constuctor called");
		this.sid=sid;
		this.sname=sname;
	}
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
	/*	// the below object is created with the help of default constructor
		Student s1=new Student();
		System.out.println( s1.sid);
		System.out.println(s1.sname);
		// the below object is created with the help of no-arg constructor
		Student s2=new Student();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		// the below object is created with the help of parameterized constructor
		Student s3=new Student(101,"srikanth");
		System.out.println(s3.sid);
		System.out.println(s3.sname);*/
		
		// we can avoid duplication of code use methods
		Student s1=new Student();
		s1.studentInfo();
		Student s2=new Student();
		s2.studentInfo();
		Student s3=new Student(100,"srikanth");
		s3.studentInfo();
		
		
		System.out.println("Main Method Ended");
		
		

	}
	void studentInfo() {
		System.out.println("Student Id:" +sid);
		System.out.println("Student Name:" +sname);
		
	}
	

}
