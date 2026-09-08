package com.days;
//DAY-1 :What is class ?
//A class is a template/blue print used to create a object

//What is Object?
// A object is a runtime instance of class
 class Student {
		int id;
		String name;
 
	void study() {
		System.out.println("Students are Studying");
	}
 }

  
public class Test{
	int id;
	String name;
	public static void main(String[] args) {
		Test s1=new Test();
		s1.id=101;
		s1.name="Srikanth";
		System.out.println("ID:" +s1.id);
		System.out.println("Name:" +s1.name);
		

	}

}
/*
  Here: Student → Class id,
   name → Data/State 
   study() → Behavior/Method 
  Think: Class = Blueprint 🏠 Object = Actual House 🏠
 */
//------------------------------------------
/* 
Test → Class
s1 → Reference variable
new Test() → Creates an object
101, "Srikanth" → Object's data
*/