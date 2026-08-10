package com.javaintro;

public class ShoppingCart {
	int items;
	int price=100;
	double totalAmount;
	 String orderPlaced="yes";
	 static String website="PizzaHut";
	 void addItem() {
		 items +=1;
		 
		 
		 System.out.println("Items Added:" +items);
	 }
	
	 void placeOrder() {
		
		 System.out.println("Order placed:" +orderPlaced);
		
	 }
	 
	 void displayCart() {
		 System.out.println("Website Name: " +website);
		 System.out.println("Number of Items " +items);
		 totalAmount +=items*price;
		 System.out.println("Total Amount:" +totalAmount);
		 System.out.println("OrderStatus:" +orderPlaced);
	 }
	
	static  void changeWebsite() {
		 System.out.println("Website Changed:" +website);
	 }
	static void displayWebsite() {
		System.out.println("website Name:" +website);
	}
	
	 

	public static void main(String[] args) {
		ShoppingCart s1=new ShoppingCart();
		ShoppingCart s2=new ShoppingCart();
		System.out.println("cart1 details:");
		
		s1.addItem();
		s1.displayCart();
		s1.placeOrder();
		System.out.println("cart2 details:");
		s2.items=2;
		s2.price=400;
		
		website="waffles";
		changeWebsite();
		System.out.println("updated Details:");
		s1.displayCart();
		s2.displayCart();
	
      
	}

}
