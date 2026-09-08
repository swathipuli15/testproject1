package com.langfundamentals;

public class Methods {
	int c;

	void add(int a,int b) {
		c=a+b;
		System.out.println("Sum of Numbers:" +c);
	}
	void sub(int a,int b) {
		c=a-b;
		
		System.out.println("subtration of numbers:" +c);
		
	}
	void multiply(int a,int b ) {
		c=a*b;
		System.out.println("Mulitiplication of numbers:" +c);
	}
	void divide(int a,int b ) {
		c=a/b;
		System.out.println("Division  of numbers:" +c);
	}


	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.add(10, 20);
		m1.sub(m1.c, 10);
		m1.multiply(m1.c, 20);
		m1.divide(m1.c,30);

	}

}
