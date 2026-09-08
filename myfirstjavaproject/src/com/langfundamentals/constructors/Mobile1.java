package com.langfundamentals.constructors;
//No- Argument constructor

public class Mobile1 {
	String mobileName;
	double price;
	Mobile1(){
		System.out.println("No-Arg constructor called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Mobile1 m=new Mobile1();
		m. mobileName="VIVO";
		m.price=20000;
		m.display();
		

	}
	void display() {
		System.out.println(mobileName);
		System.out.println(price);
	}

}
