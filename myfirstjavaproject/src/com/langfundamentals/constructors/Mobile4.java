package com.langfundamentals.constructors;
//Copy constructor

public class Mobile4 {
	String mobileName;
	double price;
	Mobile4(String mobileName,double price){
		this.mobileName=mobileName;
		this.price=price;
	}
	
	Mobile4(Mobile4 m){
		this.mobileName=m.mobileName;
		this.price=m.price;
		System.out.println("Copy Constructor called");
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Mobile4 m1=new Mobile4("VIVO",50000);
		m1.display();
		Mobile4 m2=new Mobile4(m1);
		m2.mobileName="17 pro max";
		m2.display();
		

	}
	void display() {
		System.out.println(mobileName);
		System.out.println(price);
	}

}
