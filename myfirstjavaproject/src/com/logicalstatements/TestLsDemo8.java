package com.logicalstatements;

import java.util.Scanner;

// WAP to print the invoice based on items from fruits and vegtables...?
public class TestLsDemo8 {

	public static void main(String[] args) {
		System.out.println("Main Method Strted");
		Scanner sc = new Scanner(System.in);
		double totalPrice=0;
		String yn=" ";
		do {
		System.out.println("Enter the Category:");
		String catg = sc.next();
	//	totalPrice=totalVegPrice+fruitPrice;
		switch (catg) {
		case "vegtables" -> {
			double totalVegPrice = 0;
			String vyn=" ";
			
			do {
			System.out.println("Enter the vegtable ");
			String veg = sc.next();
			
			
			
				switch (veg) {
				case "tmt" -> {
					System.out.println("the price of tomato per kg is 60:");
					double tmtPrice = 60;
					totalVegPrice = totalVegPrice + tmtPrice;
				}
				case "car" -> {
					System.out.println("the Price of carrot per kg is 50");
					double carPrice = 50;
					totalVegPrice += carPrice;
				}
				case "beet" -> {
					System.out.println("the price of BeetRoot per kg is 40");
					double beetPrice = 40;
					totalVegPrice += beetPrice;
				}
				default ->System.out.println("enter item is not available");
				
				}
				
				System.out.println("Do you want to continue with vegtable Category..? Click Y for yes N for NO");
				 vyn=sc.next();
			}while(vyn.equalsIgnoreCase("y"));
			
			System.out.println("Total Vegtable Price is:" + totalVegPrice);
			totalPrice=totalPrice+totalVegPrice;
			System.out.println("Exit from the vegtable Category");
		}
		
		case "fruits" -> {
			double fruitPrice=0;
			String fyn=" ";
			do {
				System.out.println("Enter a fruit ");
				String fruit=sc.next();
				switch(fruit) {
				case "apple"->{
				System.out.println("the price of apple per kg is 100");
				double appPrice=100;
				fruitPrice +=appPrice;
				}
				case "banana" -> {
					System.out.println("the price of banana per kg is 70");
					double banPrice=70;
					fruitPrice +=banPrice;
				}
				case "mango"->{
					System.out.println("the price of Mango per kg is 200");
					double magPrice=200;
					fruitPrice +=magPrice;
				}
				case "guvua" -> {
					System.out.println("the price of Guvva per kg is 300");
					double guvPrice=300;
					fruitPrice += guvPrice;
				
				}
				default ->{
					System.out.println("entered Fruit is not Available");
				}
				
				}
				
				System.out.println("Do you Want to contine friuts Category..? Click y for yes or n for No");
				fyn=sc.next();
				
			}while(fyn.equalsIgnoreCase("y"));
			System.out.println("the Price of Fruits is" +fruitPrice);
			totalPrice=totalPrice+fruitPrice;
			System.out.println("Exit From  Fruits Category");
			

		}
		default ->{
			System.out.println(" enter categoty is not Available");
		}
		
		}
	
		System.out.println("total price is:" +totalPrice);
		System.out.println("Do you want to continue with this Category..? Click Y for yes N for NO");
		yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("total price is:" +totalPrice);

		System.out.println("Exit");

	}
	

}
