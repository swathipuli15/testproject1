package com.langfundamentals.constructors;

public class Car {
	String model;
	String brand;
	String color;
	int year;
	double price;
	Car(String model,String brand,String color){
		System.out.println("3-Parameterised Constructor called!!");
		this.model=model;
		this.brand=brand;
		this.color=color;
		
		
	}
	public Car(String model, String brand, String color, int year, double price) {
	System.out.println("Parameterised Constructor Called!!");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	Car(){
		System.out.println("No Argument Constructor Called!!");
		model="audi";
		brand="BMW";
		color="black";
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Car c=new Car("sonet","KIA","Red");
		c.carInfo();
		//In java program ,we have parameterized constructor jvm does not create default constructor
		//so we must need to create no argument constructor`
		Car c1=new Car();
		c1.carInfo();
		Car c2=new Car("Audi","KIA","Red",2026,1000.0);
		c2.carInfo();

	}
	void carInfo() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(year);
	}

}
