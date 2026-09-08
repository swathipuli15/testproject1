package com.logicalstatements;

import java.util.Scanner;

public class ElectriciyBill {
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter connection type");
		String connection=sc.next();
		double dprice=1;
		switch(connection) {
		case "domestic"->{
			System.out.println("enter number of domestic units consumed");
			int dunits=sc.nextInt();
			
			if(dunits<=100) {
				System.out.println("charge 2rs per unit");
				double lprice=2;
				dprice *=lprice;
			}else if(dunits>=300) {
				System.out.println("charge 3rs per charge");
				double hPrice=3;
				dprice *= hPrice;
			}else {
				System.out.println("No charge of domestic");
			}
			System.out.println("Total Cost" +dprice);
			
		}
		//---------------------
		case "commercial"->{
			System.out.println("enter number of commericial units consumed");
			int cunits=sc.nextInt();
			double cPrice=1;
			if(cunits<=100) {
				System.out.println("charge 4 per unit");
				double lPrice=4;
				cPrice =lPrice*cunits;
				
			}else if(cunits>=100 && cunits<=300) {
				System.out.println("Charge 6 per unit ");
				double mPrice=6;
				cPrice =mPrice*cunits;
				
				
			}else if(cunits>300) {
				System.out.println("charge 8 per unit");
				double hPrice=8;
				cPrice =hPrice*cunits;
				
			}
			else {
				System.out.println("No Charge of commerical");
			}
			System.out.println("Total Cost" +cPrice);
			
			
		}
		//----------------
		
		default->{
			System.out.println("Exit");
		}

		
		
		}
		
	}

}
