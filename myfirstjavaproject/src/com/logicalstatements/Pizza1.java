package com.logicalstatements;

import java.util.Scanner;

public class Pizza1 {
	char size;
	int quantity;
	double distance;


	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pizza size");
		char size=sc.next().charAt(0);
		Pizza1 p=new Pizza1();
		double price=p.getPizzaPrice( size);
		System.out.println("price of pizza:"+price);
		System.out.println("Enter pizza Quantity");
		int quantity=sc.nextInt();
		double cost=p.pizzaCost(price, quantity);
		System.out.println("pizza cost: " +cost);
		System.out.println("Enter distance");
		double distance=sc.nextDouble();
		
		double charges=p.deliveryCharge(distance);
		System.out.println("Delivery charges: " +charges);
		double bill=p.finalBill(cost, charges);
		
		System.out.println("size:" +size);
		System.out.println("price: " +price);
		System.out.println("quantity:" +quantity);
		System.out.println("pizza Cost:" +cost);
		System.out.println("delivery Charges:" +charges);
		System.out.println("Bill:" +bill);
		
	
		

	}
	//---------------
	double getPizzaPrice(char size) {
		if(size=='S'||size=='s') {
			return 70;
		}else if(size=='M'||size=='m') {
			return 100;
		}else if(size=='L'||size=='l') {
			return 150;
		}else {
			System.out.println("Invalid ");
		}
		return size;
	}
	//--------------------------
	double pizzaCost(double price,int quantity) {
		if(quantity<0) {
			System.out.println("Invalid");
		}
		double cost=price*quantity;
		return cost;
		
	}
	//--------------
	double deliveryCharge(double distance) {
		
		if(distance<0||distance<=10) {
			return 70;
		}else if(distance<11||distance<=20) {
			return 100;
		}else if(distance>20) {
			return 150;
		}else {
			System.out.println("Invalid");
		}
		
		return distance;
	}
	//----------------
	double finalBill(double cost,double deliveryCharges){
		double bill=cost+deliveryCharges;
		return bill;
		
		
	}
	

}
