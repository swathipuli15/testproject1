package com.langfundamentals;

public class Courier {
	String customerName;
	int courierId;
	String source;
	String destination;
	int weight;
	int deliveryAmount;
	static  int totalCouriers;
	static int totalWeights;
	static int totalAmountCollected;
	static int pricePerKg=100;
	static {
		System.out.println("Welcome to QuickShip Courier");
	}
	void bookCourier() {
		deliveryAmount=weight*pricePerKg;
		System.out.println("Delivery Amount is:" +deliveryAmount);
		totalCouriers++;
		totalWeights +=weight;
		totalAmountCollected +=deliveryAmount;
		System.out.println("Booking Sucessful");
		
	}
	void diplayCourierDetails() {
		System.out.println("Customer Name :" +customerName);
		System.out.println("CourierId:" +courierId);
		System.out.println("source :" +" to Destination :" +destination);
		System.out.println("weight :" +weight);
	}
	static void  displayTodaysCollection() {
		System.out.println("Total Courier Booked:" +totalCouriers);
		System.out.println("Total weight:" +totalWeights);
		System.out.println("Total Amount Collected:" +totalAmountCollected);
	}
	
	public static void main(String[] args) {
		Courier c1=new Courier();
		Courier c2=new Courier();
		
		c1.customerName="Pondu";
		c1.courierId=101;
		c1.source="hyd";
		c1.destination="chennai";
		c1.weight=100;
	   
	    c1.diplayCourierDetails();
	    c1.bookCourier();
	    c2.customerName="Chinnu";
		c2.courierId=102;
		c2.source="hyd";
		c2.destination="Benguluru";
		c2.weight=20;
	    
	    c2.diplayCourierDetails();
	    c2.bookCourier();
	    
	    displayTodaysCollection();

	}

}
