package com.days;
class Student1{
	int id;
	String name;
	String course;
	double fees;
	void display() {
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
		System.out.println("Course:" +course);
		System.out.println("fees:" +fees);
	}
}

public class Test2 {
	

	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		s1.id=101;
		s1.name="Srikanth";
		s1.course="JFS";
		s1.fees=45000;
		s2.id=102;
		s2.name="Sridhar";
		s2.course="JFS";
		s2.fees=40000;
		s1.display();
		s2.display();
		
	}

}
