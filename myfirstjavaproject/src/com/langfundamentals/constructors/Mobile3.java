package com.langfundamentals.constructors;
// Constructor Chaining

public class Mobile3 {
	String mobileName;
	double price;
	Mobile3(){
		this("Unknown");
		System.out.println("No- Arg Constructor Called");
		
		
	}
	Mobile3(String mobileName){
		this(mobileName,20000);
		System.out.println("One Arg Constructor Called");
	}
	Mobile3(String mobileName,double price){
		this.mobileName=mobileName;
		this.price=price;
		System.out.println("Two Arg Constructor called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Mobile3 m=new Mobile3();
		m.display();
		
	}
	void display() {
		System.out.println(mobileName);
		System.out.println(price);
	}

}
