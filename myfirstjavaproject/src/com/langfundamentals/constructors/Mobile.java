package com.langfundamentals.constructors;
// default Constructor

public class Mobile {
	String mobileName;
	double price;
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Default Construtor Called");
		Mobile m=new Mobile();
		//m.display();
		m.mobileName="VIVO";
		m.price=20000;
		m.display();
	

	}
	void display() {
		System.out.println("Mobile Name:" +mobileName);
		System.out.println("Price:" +price);
	}

}
