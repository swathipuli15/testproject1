package com.langfundamentals.constructors;

public class Animal extends Object {
	Animal(){
		System.out.println("Animal Constructor Called");
	}
	public static void main(String[] args) {
		System.out.println("Main method Started ");
	}
	
}
 class Dog extends Animal{
	Dog(){
		super();
		System.out.println("Dog Constructor Called");
	}
	public static void main(String[] args) {
		System.out.println("Main method Started From Dog");
		Dog d=new Dog();
		System.out.println("Main method Ended From Dog");

	}
	
}
