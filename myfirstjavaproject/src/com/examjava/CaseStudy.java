package com.examjava;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		if(age<0) {
			System.out.println("Invalid Age");
		}else if(age>=18) {
			System.out.println("check the patient type");
			System.out.println("enter patient type");
			int type=sc.nextInt();
			if(type==1) {
				System.out.println("Regular");
				System.out.println("enter Availabilty");
				int avail=sc.nextInt();
				if(avail==1) {
					System.out.println("Regular Appiontment confirmed");
				}else if(avail==2) {
					System.out.println("please select another slot");
				}
			}else if(type==2) {
				System.out.println("Emergency");
				System.out.println("enter Availabilty");
				int avail=sc.nextInt();
				if(avail==1) {
					System.out.println("Emergency Appiontment confirmed");
					
				}else if(avail==2) {
					System.out.println("emergency slot not available");
				}
			}
		}
		
	}
	

}
