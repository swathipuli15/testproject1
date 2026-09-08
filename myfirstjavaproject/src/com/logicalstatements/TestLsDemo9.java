package com.logicalstatements;

import java.util.Scanner;

//veg non-veg starters soups desert
public class TestLsDemo9 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		String yn = " ";
		double totalPrice=0;
		do {
			System.out.println("enter item");
			String item = sc.next();
			
			switch (item) {
			case "veg" -> {
				
				double vegPrice = 0;
				String vyn = " ";
			do {
				System.out.println("enter Veg item");
				String veg = sc.next();
				
				switch (veg) {

				case "panner" -> {
					System.out.println("price of Panner is 200 ");
					double pPrice = 200;
					vegPrice=vegPrice+pPrice;
				}
				case "butter" -> {
					System.out.println("price of butter is 300");
					double bPrice=300;
					vegPrice=vegPrice+bPrice;
				}
				case "cheese"->{
					System.out.println("price of cheese is 400");
					double cPrice=400;
					vegPrice=vegPrice+cPrice;
				}
				default ->System.out.println("Enter veg item is not available");
				}
				
				System.out.println("Do you Want to continue with veg..?Click y for yes n for No");
				vyn=sc.next();
			}while(vyn.equalsIgnoreCase("y"));
			totalPrice=totalPrice+vegPrice;
			System.out.println("Total Price:" +totalPrice);
			}
			// ------------------
			case "Nonveg" -> {
				double nPrice=0;
				String nyn=" ";
				do {
					System.out.println("Enter Non Veg Item");
					String Nonveg=sc.next();
					
					switch(Nonveg) {
					case "chicken"-> {
						System.out.println("Chicken price is: 150" );
						double chiPrice=150;
						nPrice=nPrice+chiPrice;
					}
					case "mutton"->{
						System.out.println("Mutton price is:300");
						double mPrice=300;
						nPrice=nPrice+mPrice;
					}
					case "prawns"->{
						System.out.println("Prawns Price is:400");
						double pPrice=400;
						nPrice=nPrice+pPrice;
					}
					case "crabs"->{
						System.out.println("crabs Price is:600");
						double crPrice=600;
						nPrice=nPrice+crPrice;
					}
					case "fish"->{
						System.out.println("fish price is:500");
						double fPrice=200;
						nPrice=nPrice+fPrice;
					}
					default->System.out.println("Enter item is not available");
					}
					System.out.println("Do You Want to continue with Nonveg..? click y for Yes n for NO");
					nyn=sc.next();
				}while(nyn.equalsIgnoreCase("y"));
				totalPrice=totalPrice+nPrice;
				System.out.println("Total Price" +totalPrice);
				
			}
			// -------------------------
			case "straters" -> {
				double sPrice=0;
				String syn=" ";
				do {
					System.out.println("Enter Starter Item");
					String starter=sc.next();
					switch(starter) {
					case "lolipop"->{
						System.out.println("Price of lolipop is 80");
						double lolprice=80;
						sPrice += lolprice;
					}
					case "cholee"->{
						System.out.println("Price of cholee is 100");
						double cholee=100;
						sPrice += cholee;
					}
					case "panner65"->{
						System.out.println("Price of Panner65 is 120");
						double panPrice=120;
						sPrice +=panPrice;
					}
					case "alooTikka"->{
						System.out.println("Price of aloo Tikka is 200");
						double aPrice=200;
					}
					case "crispyCorn"->{
						System.out.println(" Price of Crispy corn is 100 ");
						double crPrice=100;
						sPrice +=crPrice;
					}
					default->System.out.println("Enter Starter item is not availabl");
					}
					System.out.println("Do you want to continue with Starters...?Click y For Yes n for No");
					syn=sc.next();
				}while(syn.equalsIgnoreCase("y"));
				totalPrice=totalPrice+sPrice;
				System.out.println("Total Price is:" +totalPrice);

			}
			// ---------------------
			case "soups" -> {
				    double ssPrice=0;
				    String syn=sc.next();
				do {
					System.out.println("enter a soup");
					String soup=sc.next();
					switch(soup) {
					case "chicken soup"->{
						System.out.println("Price of chicken soup is:100");
						double csPrice=100;
						ssPrice +=csPrice;
					}
					case "cornSoup"->{
						System.out.println("Price of Corn Soup is 110");
						double cPrice=110;
						ssPrice +=cPrice;
						
					}
					case "toamatoSoup"->{
						System.out.println("Price of tomato Soup is 30");
						double tPrice=30;
						ssPrice +=tPrice;
					}
					case "mashow soup"->{
						System.out.println(" Price of mashow soup is 50 ");
						double mPrice=60;
						ssPrice +=mPrice;
					}
					default ->System.out.println("enter item is not available");
					
					}
					System.out.println("Do you Want to continue with soups..? click y for yes n for No");
					syn=sc.next();
				}while(syn.equalsIgnoreCase("y"));
				totalPrice =totalPrice+ssPrice;
				System.out.println("Total price is" +totalPrice);

			}
			// -----------------
			case "desserts" -> {
				double dPrice=0;
				String dyn=" ";
				do {
					System.out.println("Enter desssert item");
					String deserts=sc.next();
					switch(deserts) {
					case "chacolate"->{
						System.out.println("Price of chacolte is 100");
						double cPrice=100;
						dPrice +=cPrice;
					}
					case "scotch"->{
						System.out.println("Price of scoch is 110");
						double sPrice=110;
						dPrice +=sPrice;
					}
					default->System.out.println("enter item is not available");
					}
					System.out.println("Do you Want to continue with desserts  ..? click y for yes n for No");
					dyn=sc.next();
				}while(dyn.equalsIgnoreCase("y"));
				totalPrice=totalPrice+dPrice;
				System.out.println("totalPrice :" +totalPrice);

			}
			// --------------------
			default->System.out.println("enter item is not available");
			}
		
			System.out.println("Do you want to continue..?click y for yes n for no");
			yn=sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("total Price:" +totalPrice);
		System.out.println("Exit");

	}

}
