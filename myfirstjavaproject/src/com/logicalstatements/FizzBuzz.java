package com.logicalstatements;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%3==0&&n%5==0) {
			System.out.println("FizzBuzz");
			
		}else if(n%5==0) {
			System.out.println("Buzz");
		}else if(n%3==0){
			System.out.println("Fizz");
		}

	}

}
