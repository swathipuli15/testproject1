package com.langfundamentals;
import java.util.Scanner;

// No Return type + with Arguments
public class TypesOfMethodsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student Id:");
		int sId=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sName=sc.next();
		System.out.println("Enter Student Age:");
		int age=sc.nextInt();
		 getStudent_Id_Name(sId,sName);
			getStudent_age(age);	
			System.out.println("Main Method Ended");

	}
	static void getStudent_Id_Name(int id,String name) {
		System.out.println("Student Id and Name info !!");
		System.out.println("Student ID:" +id);
		System.out.println("Student_Name:" +name);
		
		
	}
	static void getStudent_age(int age) {
		System.out.println("Age:" +age);
	}

}
