package com.langfundamentals.constructors;

public class Bike {
	String model;
	String brand;
	String color;
	double price;
	int year;

	Bike() {
		this("UNKNOWN");
		System.out.println("No argument Constructor called!!");

	}

	Bike(String model) {
		this(model, "UNKNOWN");

		/*
		 * instead of this code using this() for calling one constructor in
		 * anotherconstructor
		 */

		System.out.println("one Agr Constuctor called!!");

	}

	Bike(String model, String brand) {
		this(model, brand, "white");

		System.out.println("two Agr Constuctor called!!");

	}

	Bike(String model, String brand, String color) {
		this(model, brand, color, 100001.0);

		System.out.println("three Agr Constuctor called!!");
	}

	Bike(String model, String brand, String color, double price) {
		this(model, brand, color, price, 2026);

		System.out.println("four Agr Constuctor called!!");

	}

	Bike(String model, String brand, String color, double price, int year) {

		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
		System.out.println("five Agr Constuctor called");
	}

	void bikeInfo() {
		System.out.println("*********************************");
		System.out.println(model);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(year);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Bike b = new Bike();
		b.bikeInfo();
		Bike b1 = new Bike("Audi");
		b1.bikeInfo();
		Bike b2 = new Bike("Audi", "KIE");
		b2.bikeInfo();
		Bike b3 = new Bike("Audi", "KIE", "White");
		b3.bikeInfo();
		Bike b4 = new Bike("Audi", "KIE", "White", 100000.0);
		b4.bikeInfo();
		Bike b5 = new Bike("Audi", "KIE", "White", 100000.0, 2022);
		b5.bikeInfo();
		System.out.println("Main method Ended");

	}

}
