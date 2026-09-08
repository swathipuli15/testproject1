package com.examjava;

import java.util.Scanner;

public class CaseStudy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<0) {
			System.out.println("Invalid Age");
		}else if(age>=18) {
			System.out.println("check the patient");
		}else {
			System.out.println("not Checking");
		}
		System.out.println("enter Patient Type");
		int type=sc.nextInt();
		if(type==1) {
			System.out.println("Regular");
		}else if(type==2) {
			System.out.println("Emergency");
		}else {
			System.out.println("Invalid Patient Type");
		}
		System.out.println("Enter Availability");
		int avail=sc.nextInt();
		if(avail==1) {
			System.out.println("Emergency AppointMent Confirmed");
			
		}else if(avail==2){
			System.out.println("Emergency Slot Not Available");
			
		}else {
		System.out.println("Invalid");
		}
		System.out.println("exit");
	}

}
