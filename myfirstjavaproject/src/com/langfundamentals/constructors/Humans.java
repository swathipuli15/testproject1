package com.langfundamentals.constructors;

//parent or super or base
public class Humans {
	String name;
	int age;

	Humans() {
		System.out.println("Humans Constuctor Called");
	}

	Humans(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Two Arg Constructor called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started from Humans");

	}

}

// child or derived or sub
class Persons extends Humans {
	{
		System.out.println("Instance block called");
	}

	Persons() {
		System.out.println("Persons Constructor Called");
	}

	Persons(String name, int age) {
		super(name, age);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started from Persons");

		Persons p = new Persons();
		p.info();
		Persons p1 = new Persons("Srikanth", 22);
		p1.info();
		

	}

	void info() {

		System.out.println(name);

		System.out.println(age);
		System.out.println("----------------");
}
}
