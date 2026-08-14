package com.langfundamentals;
//user Defined Object Data Types
// In one class object we can use another class also
//user defined data types can be initialize the value or access through the object references variable
//if you are not initialize the user defined data type it will give the NULL Pointer Exception
// So we must need to create object like this Object variable=new Object();
class Student{
	int sID;
	String sName;
	// Address address; --we get a NULL Pointer Exception on this we can resolve this we can create a object
	Address address=new Address();
}
class Address {
	String city;
	String state;
	
}

public class TestDataTypesDemo3 {
	

	public static void main(String[] args) {
		 Student s=new  Student();
		s.sID=123;
		s.sName="Pondu";
	//	s.address="hyderabad";
		
		s.address.city="Hyderabad";
		s.address.state="TG";
		System.out.println(s.sID);
		System.out.println(s.sName);
		System.out.println(s.address.city);
		System.out.println(s.address.state);
		
	}

}
