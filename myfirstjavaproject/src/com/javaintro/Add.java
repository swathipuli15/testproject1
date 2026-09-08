package com.javaintro;

import java.util.Scanner;

public class Add {
	int a;
	int b;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
 
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("a value is" +a +" b value is " +b+" " +(a+b));
	}

}
