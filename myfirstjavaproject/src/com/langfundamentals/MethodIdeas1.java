package com.langfundamentals;
import java.util.Scanner;

public class MethodIdeas1 {
//No return type+with parameters
	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int sId=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sName=sc.next();
		System.out.println("Enter student Age:");
		int sAge=sc.nextInt();
		System.out.println("Enter employee ID");
		int eId=sc.nextInt();
		System.out.println("Enter employee Name");
		String eName=sc.next();
		System.out.println("Enter employee Age:");
		int eAge=sc.nextInt();
		System.out.println("Enter a Value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("Enter Number:");
		int number=sc.nextInt();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter principle Amount:" );
		double p=sc.nextInt();
		System.out.println("Enter Time:");
		double t=sc.nextInt();
		System.out.println("Enter Rate of interest:");
		double r=sc.nextInt();
		displayStudentDetails( sId, sName,sAge);
		displayEmployeeDetails( eId, eName ,eAge);
		calculateSum( a, b);
		calculateDifference(a,  b);
		calculateProduct( a, b);
		calculateDivision( a,  b);
		calculateRemainder( a, b);
		checkEvenOdd( number);
		checkPositiveNegative(number);
		checkEligibleForVoting( age);
		calculateSimpleInterest( p,  r, t);

	}
	static void displayStudentDetails(int id, String name,int age) {
		System.out.println("Student Info!!");
		System.out.println("Student Id:" +id);
		System.out.println("Student Name" +name);
		System.out.println("Student Age"+age);
		
	}
	static void displayEmployeeDetails(int id, String name,int age) {
		System.out.println("Employee Details:");
		System.out.println("Employee Id:" +id);
		System.out.println("Employee Name:" +name);
		System.out.println("Employee Age:" +age);
	}
	static void calculateSum(int a, int b) {
		System.out.println("Sum of values:" +(a+b));
		
	}
	static void calculateDifference(int a, int b) {
		System.out.println("Difference of Values:" +(a-b));
	}
	static void calculateProduct(int a, int b) {
		System.out.println("Product of Values:" +(a*b));
	}
	static void calculateDivision(int a, int b) {
		System.out.println("Division of Values:" +(a/b));
	}
	static void calculateRemainder(int a, int b) {
		System.out.println("Remainder of values:" +(a%b));
	
		}
	static void checkEvenOdd(int number) {
		System.out.println("Check even number: " +(number%2==0));
		
	}
	static void checkPositiveNegative(int number) {
		System.out.println("Check Positve Number: " +(number<0));
	}
	static void checkEligibleForVoting(int age) {
		System.out.println("Eligiable for voting:" +age);
	}
	static void calculateSimpleInterest(double p, double r, double t) {
		System.out.println("Simple Interest :" +(p*t*r/100));
	}

}
