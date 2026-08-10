package com.javaintro;

public class MovieTickets {
	
String movieName;
int  seatNumber;
boolean booked;

static  String theatreName="cinepolls";
void bookTicket() {
	booked=true;
	System.out.println("Booked Ticket sucessfully");
}
void cancelTicket() {
	booked=false;
	System.out.println("Booked cancel sucessfully");
}
void display() {
	System.out.println("Movie Name:" +movieName);
	System.out.println("seat Number:" +seatNumber);
	System.out.println("Booking Status:" +(booked? "booked":"not booked"));
	System.out.println("threate Name:" +theatreName);
	
}
static void changeTheTheatreName(String newName ) {
	theatreName=newName;
}
	public static void main(String[] args) {
		MovieTickets m1=new MovieTickets();
		MovieTickets m2=new MovieTickets();
		m1.movieName="SALAR";
		m1.seatNumber=100;
		m2.movieName="ARAYA";
		m2.seatNumber=101;
		m1.cancelTicket();
		m1.display();
		m2.display();
		
		

	}

}
