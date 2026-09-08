package com.operators;

import java.util.Scanner;

// WAP to check whether the given number is even or not using BitWise Operators



public class CheckEven {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=sc.nextInt();
		boolean e=((a%2)==0 & true);
		System.out.println("Given Number is Even:"+e);
		
		

	}

}
