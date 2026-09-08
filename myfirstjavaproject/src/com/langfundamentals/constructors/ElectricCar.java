package com.langfundamentals.constructors;
 class Vehicle{
	 String type;
	 Vehicle(String type){
		 this.type=type;
	 }
	 
 }
 class Cars extends Vehicle{
	 String brand;
	 double price;
	 Cars(String brand,double price,String type){
		 super(type);
		 this.price=price;
		 this.brand=brand;
	 }
	 
 }

public class ElectricCar extends Vehicle {
	
	String brand;
	double batteryCapacity;
	double price;
	
	ElectricCar(String brand,double batteryCapacity,double price,String type){
		super(type);
		this.brand=brand;
		this.batteryCapacity=batteryCapacity;
		this.price=price;	
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		ElectricCar c=new ElectricCar("Audi",1000.00,1000000.00,"ev");
		c.display();
	}
	
	void display() {
		System.out.println("type:" +type);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(batteryCapacity);
	}

}
