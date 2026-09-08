package com.logicalstatements;

import java.util.Scanner;

// WAP to check the eligibility for marriage in matrimonial sites.

public class TestLsDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to VCube Matrimonial ");
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("Hello " +name +"Lets continue the discussion ");
		System.out.println("Enter your Assets:");
		double assets=sc.nextDouble();
		System.out.println("Enter your salary:");
		double salary=sc.nextDouble();
		if(assets>=5000000.0&& salary>=250000) {
			System.out.println("Great ! Lets continue the discussion");
			System.out.println("Enter your age");
			int age=sc.nextInt();
			if(age>=26 &&age<=29) {
				System.out.println("Nice to meet you !Lets continue the discussion");
				   System.out.println("Enter your Height");
				   float height=sc.nextFloat();
				   System.out.println("Enter your Weight");
				   float weight=sc.nextFloat();
				if((height>=5.6&&height<=6.1)&&(weight>=50&&weight<=70)) {
					System.out.println("Hoo!! lets continue the discussion");
					System.out.println("enter your Siblings:");
					int siblings=sc.nextInt();
					if(siblings<=0) {
						System.out.println("okay Get will be back soon");
					}else {
						System.out.println("You Are not Matching our Profile");
					}
				}else {
					System.out.println("Your height and Weight is not matching our profile");
				}
			}else {
				System.out.println("your Age is not matching our profile");
			}
		}else {
			System.out.println("you can leave for the Day");
		}
		
	}

}
