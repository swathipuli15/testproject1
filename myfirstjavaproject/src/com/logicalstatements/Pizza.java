package com.logicalstatements;

import java.util.Scanner;

public class Pizza {
	char size;
	int quantity;
	float distance;
	double price;

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter pizza size");
		char size=sc.next().charAt(0);
		 Pizza p=new  Pizza();
		 double price=p.calculatePizzaPrice(size);
		System.out.println(price);
		System.out.println("Enter your quantity");
		int quantity=sc.nextInt();
		double cost=p.calculatePizzaCost(price,quantity);
		System.out.println("price is "+cost);
		System.out.println("enter your distance");
		double distance=sc.nextDouble();
		double charges=p.deliveryCharges(distance);
		double bill=p.finalBill(cost, distance);
		System.out.println(bill);
		
		
		 
		

	}
	double calculatePizzaPrice(char size){
		if(size=='S' || size =='s'){
			return 70;
		}else if (size=='M' || size=='m'){
			return 100;
		}else if(size=='L'||size=='l'){
			return 150;
			}
		else {
			System.out.println("Invaid size");
		}
		return size;
		
	}
	double calculatePizzaCost(double price,int quanity) {
		
		return price*quantity;
		
		
	}
	double deliveryCharges(double distance) {
		if(distance>0&&10<distance) {
			return 7.0;
		}else if(distance>=11 && distance<=20) {
			return 100;
		}else if(distance>20) {
			return 150;
		}else {
			System.out.println("Invalid Distance");
		}
		return distance;
	}
	double finalBill(double pizzaCost,double deliveryCharges) {
		double bill=pizzaCost+deliveryCharges;
		return bill;
	}

}
