package com.langfundamentals.constructors;

public  class Flower {
	
	String name="jasmine";
	String color="white";
	public static void main(String[] args) {
		System.out.println("Main Method Started from Flower");
	}
	

	

}
class Rose extends Flower{
	public static void main(String[] args) {
		System.out.println("Main Method Started From Rose");
		Rose r=new Rose();
	    r.roseInfo();
	    System.out.println("Main Method Ended From Rose");
		
	}
	void roseInfo() {
		System.out.println("Name:" +name);
		System.out.println("color:" +color);
	}
}
