package com.logicalstatements;

import java.util.Scanner;

// WAP to give T-shirt Description based on size...?
public class TestLsDemo5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		System.out.println("Welcome to Vcube Shopping mall");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a T-Shirt Size:");
		int size=sc.nextInt();
		switch(size) {
		case 32->System.out.println("XX-Small");
		case 34->System.out.println("X-Samll");
		case 36->{
			System.out.println("Small");
			System.out.println("the price is 600");
		}
		case 38->System.out.println("Medium");
		case 40->System.out.println("Large");
		case 42->System.out.println("X-Large");
		case 44->System.out.println("XX-Large");
		default->System.out.println("The Entered T-shirt is sold out");
		}

	}

}
