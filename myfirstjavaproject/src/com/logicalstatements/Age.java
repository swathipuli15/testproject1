package com.logicalstatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age1=sc.nextInt();
		if(age1<0) {
			System.out.println("Invalid Age");
		}else if(age1>60) {
			System.out.println("you are a Old");
		}else if(5>age1||age1<=0) {
			System.out.println("you are a kid");
		}else if(12>age1 || age1<=5) {
			System.out.println("you are a child");	
		}else if(13>age1 ||age1<19) {
			System.out.println("you are a TEEN");
		}else if(20>age1 || age1<35) {
			System.out.println("you are a YOUNG");
		}else if(35>age1 || age1<60) {
			System.out.println("you are a middle age");
			
		}
			
	

	}


}
