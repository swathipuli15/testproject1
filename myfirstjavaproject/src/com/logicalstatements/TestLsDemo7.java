package com.logicalstatements;

import java.util.Scanner;

// WAP to calculate two numbers and give me the result..?
public class TestLsDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		String yn="";
		
		do {
		System.out.println("Enter a first Number");
		int a1=sc.nextInt();
		
		System.out.println("Enter a second number");
		int a2=sc.nextInt();
		
		System.out.println("Enter a symbol to calculate values:");
		String sym=sc.next();
		double result=0;
		
		switch(sym) {
		case "+"->{
			System.out.println("the values are calculated with addition");
			result=a1+a2;
		}
		case "-"->{
			System.out.println("the values are calculated with subtraction");
			result=a1-a2;
		}
		case "*"->{
			System.out.println("the values are calculated with Multiplication");
			result=a1*a2;
		}
		case "/"->{
			System.out.println("the values are calculated with Division");
			result=a1/a2;
		}
		case "%"->{
			System.out.println("the values are calculated with Modulus");
			result=a1%a2;
		}
		default->System.out.println("Invalid Symbol");
		
		}
		System.out.println("The Result is :" +result);
		System.out.println("Do you want to continue ...? click Y for Yes or N for No");
		yn=sc.next();
		
		}while(yn.equalsIgnoreCase(yn));
		System.out.println("EXIT");
	}

}
