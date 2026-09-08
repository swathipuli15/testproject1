package com.langfundamentals.constructors;
// Parameterized constructor

public class Mobile2 {
	String mobileName;
	double price;
	Mobile2(String mobileName,double price){
		this.mobileName= mobileName;
		this.price=price;
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Mobile2 m=new Mobile2("VIVO",20000);
		m.display();

	}
	void display() {
		System.out.println(mobileName);
		System.out.println(price);
	}

}
