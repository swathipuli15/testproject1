package com.langfundamentals.constructors;

public class CountOfObject {
	static  int count;
	CountOfObject(){
		
		count++;
		
		
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		CountOfObject c=new CountOfObject();
		CountOfObject c1=new CountOfObject();
		CountOfObject c2=new CountOfObject();
		CountOfObject c3=new CountOfObject();
		System.out.println("Number of objects Created:" +count);
		System.out.println("Main method Ended");
		
		

	}

}
