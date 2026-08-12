package com.langfundamentals;

public class Student_1 {
	int student_ID;
	String student_Name;

	void studentInfo() {
		System.out.println("Student Info Method Called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Student_1 s1 = new Student_1();
		System.out.println(s1.student_ID);
		System.out.println(s1.student_Name);
		s1.studentInfo();
		System.out.println("Main Method Ended");

	}

}
