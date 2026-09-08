package com.langfundamentals.constructors;
//Paritial  Copy Constructor
public class Movie {
	String director;
	String producer;
	String name;
	double budget;
	String hero;
	String heroin;
	Movie(String director,String producer){
		this.director=director;
		this.producer=producer;
	}
	Movie(Movie m,String name,double budget){
		this.director=m.director;
		this.producer =m.producer;
		this.name=name;
		this.budget=budget;
	}
	Movie(Movie m,String hero,String heroin){
		this.director=m.director;
		this.producer =m.producer;
		this.name=m.name;
		this.budget=m.budget;
		this.hero=hero;
		this.heroin=heroin;
	}


	public static void main(String[] args) {
		Movie m1=new Movie("Rajmouli"," D V D");
		m1.display();
		Movie m2=new Movie(m1,"Bagubali",30000000.0);
		m2.display();
		Movie m3=new Movie(m2,"prabhas","ANUSHUKA");
		m3.display();
		
		
		

	}
	void display() {
		System.out.println("Director name: " +director);
		System.out.println("Producer name: " +producer);
		System.out.println("Movie Name: " +name);
		System.out.println("Budget: " +budget);
		System.out.println("Hero: " +hero);
		System.out.println("Heroin: " +heroin);
		System.out.println("----------------------------------------");
	}

}
