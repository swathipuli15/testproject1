package com.langfundamentals;
//No Parameters+No Arguments

public class TypesOfMethodsDemo1 {

	public static void main(String[] args) {
		TypesOfMethodsDemo1 t1=new TypesOfMethodsDemo1();
		System.out.println("Main Method Started");
		welcome();
		TypesOfMethodsDemo1.welcome();
		t1.welcome();
		
		
		t1.display();
	}
	static void welcome(){
		System.out.println("Welcome to Vcube-Java!!");
	}
	void display() {
		System.out.println("Diplay method called");
	}

}
