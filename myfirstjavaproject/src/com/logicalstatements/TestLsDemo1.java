package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are Eligible For Voting!!");
			
		}
		
		else {
			System.out.println("Babu niku inka time vundi ra!!");
		}
		sc.close();
		System.out.println("Have a nice day!!");
		
		System.out.println("Main Method Ended");

	}

}
