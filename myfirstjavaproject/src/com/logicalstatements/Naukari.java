package com.logicalstatements;

import java.util.Scanner;

//WAP to communicate HR in Naukari portal
public class Naukari {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Welcome to Naukri job portal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:" );
		String name=sc.nextLine();
		System.out.println("Hello" + name +"lets discuss our job profile");
		System.out.println("enter your Educational Qualification");
		int qulification=sc.nextInt();
		if(qulification>=12 ||12<qulification) {
			System.out.println("Great ! your educational Qualification Match our Requirements.Lets continue ");
			System.out.println("Enter your Experience:");
			int experience=sc.nextInt();
			sc.nextLine();
			if(experience>0&&5>=experience){
				System.out.println("Nice ! Your Experience match our requirement let's continue");
				System.out.println("Enter your Technical skills");
				String skills=sc.nextLine();
				if(skills.equalsIgnoreCase("java")||skills.equalsIgnoreCase("sql")) {
					System.out.println("Excellent! your Technical Skills Match our Requirement");
					System.out.println("Enter your Expected Salary");
					double salary=sc.nextDouble();
					if(salary<400000&&200000>=salary) {
						System.out.println("Great your salary expections is within our budget");
						System.out.println("Congratulations! Your profile has been shortlisted");
						System.out.println("Our HR team will contact you soon for the next round");
							System.out.println("Thank you for applying through Naukri Job Portal.");
						
					}else {
						System.out.println("sorry! your expected salary is currently outside our budget");
					}
				}else {
					System.out.println("Sorry! Your technical skills do not match this job profile.");
				}
			}else {
				System.out.println("Sorry! Your experience does not match our requirement");
				
			}
			
		}else {
			System.out.println("Sorry ! your educational Qualification Match our Requirements.Lets continue ");
	
		}
	}

}
