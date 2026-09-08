package com.javaintro;

public class Movie {
	static String movieName="SALAR";
	static int releasedYear=2024;
	int ticketPrice;
	String viewerName;
	void display() {
		System.out.println(" Movie Name:"+movieName);
		System.out.println("Released Year:" +releasedYear);
		System.out.println("Ticket Price" +ticketPrice);
		System.out.println("Viewer Name:" +viewerName);
	}

	public static void main(String[] args) {
		Movie m1=new Movie();
		Movie m2=new Movie();
		Movie m3=new Movie();
		m1.viewerName="pondu";
		m1.ticketPrice=1000;
		m1.display();
		
		m2.viewerName="sri";
		m2.ticketPrice=2000;
		m2.display();
		
		m3.viewerName="chari";
		m3.ticketPrice=3000;
		m3.display();
	}

}
