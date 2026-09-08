package com.logicalstatements;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=sc.nextInt();
		String result=
	   ( marks<=100 & marks>=91)? "S Grade" :
		   (marks <= 90 && marks>=81 )? " A Grade":
			   (marks<=80 && marks>=71)?"B Grade":
				   (marks<=70 &&marks>=51)? "C Grade":
					   (marks<=50&& marks>=41)?"D Grade":
						   (marks<=40&&marks>=35)?"E Grade":
							   (marks<34 && marks>=0)?"Failed":"Invalid Marks";
		System.out.println("Your  Grade is " +result);
					   
		   

	}

}
