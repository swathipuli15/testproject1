package com.langfundamentals;

public class VandeExpress {
	String passangerName;
	int age;
	String source;
	String destination;
	 int numberOfTickets;
	static int totalTicketBought;
	static int totalAmount;
	// int ticketAmount;
	 static int  price=500;
	 static {
		 System.out.println("Welcome to Vande Express Thank You For Choosing us");
	 }
	 void bookTickets() {
		 System.out.println("Number Of Tickets=" +numberOfTickets);
		 totalTicketBought +=numberOfTickets;
		 totalAmount +=numberOfTickets*price;
		 System.out.println("Ticket Amount=" +price);
		// System.out.println("Total Tickets Brought" +totalTicketBought);
		 
		 System.out.println("Sucessfully Booking");
	 }
	 void bookingDetails() {
		 System.out.println("Passanger Name:" +passangerName);
		 System.out.println("Age:"+age);
		// System.out.println("Number of tickets:"+numberOfTickets);
		 System.out.println("Total Amount=" +totalAmount); 
		 System.out.println("Source: " +source +" to Destination: " +destination);
		 
	 }
	static   void ticketCounter() {
		
		 
		 System.out.println("Total Tickets :" +totalTicketBought);
		
		 System.out.println("Total Amount collected:" +totalAmount);
		 
	 }

	public static void main(String[] args) {
		VandeExpress E1=new VandeExpress();
		VandeExpress E2=new VandeExpress();
		E1.passangerName="pondu";
		E1.age=18;
		E1.source="VIJ";
		E1.destination="Hyd";
		E1.numberOfTickets=5;
	//	E1.totalTicketBought=10;
		E1.bookTickets();
		E1.bookingDetails();
		E2.passangerName="sri";
		E2.age=40;
		E2.source="chennai";
		E2.destination="Hyd";
		E2.numberOfTickets=6;
	//	E1.totalTicketBought=5;
		E2.bookTickets();
		E2.bookingDetails();
		
		ticketCounter();
		
		
		
		
		

	}

}
