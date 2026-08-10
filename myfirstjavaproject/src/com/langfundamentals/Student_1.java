package com.langfundamentals;

public class Student_1 {
	int Student_ID;
	String Student_Name;

	void studentInfo() {
		System.out.println("Student Info Method Called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Student_1 s1 = new Student_1();
		System.out.println(s1.Student_ID);
		System.out.println(s1.Student_Name);
		s1.studentInfo();
		System.out.println("Main Method Ended");

	}

}
