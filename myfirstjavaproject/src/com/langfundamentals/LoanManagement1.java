package com.langfundamentals;
import java.util.Scanner;

public class LoanManagement1 {
	String customerName;
	double loanAmount;
	double interestRate;
	 double loanTenure=2;
	static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main Method Started");
	//	Scanner sc =new Scanner(System.in);
		LoanManagement1 l=new LoanManagement1();
		System.out.println("Enter Loan Amount:");
		double loanAmount=sc.nextDouble();
		System.out.println("Enter interestrate:");
		double interestRate=sc.nextDouble();
		//System.out.println("Enter loan Tenure:");
	//	double loanTenure=sc.nextDouble();
		
		double d=l.calculateInterest(loanAmount,interestRate);
		double d1=l.calculateTotalAmount(loanAmount,d);
		System.out.println("TotalAmount is:" +d1);
		double d2=l.calculateMonthlyEMI(d1,l.loanTenure);
		System.out.println("Monthly EMI:"+d2);
		
		

	}
	double calculateInterest(double loanAmount,double interestRate) {
	double interest=(loanAmount*interestRate*loanTenure)/100;
	System.out.println("interest is:" +interest);
   // l.calculateInterest(interest);
	return interest;
	
	
		
	}
	double calculateTotalAmount(double loanAmount,double interest) {
		double totalAmountPayable=loanAmount+interest;
		//System.out.println("Total Amount:" +totalAmount);
		return totalAmountPayable;
	}
	double calculateMonthlyEMI(double totalAmountPayable,double monthlyTenure) {
		System.out.println("Enter Monthly Tenure");
		monthlyTenure=sc.nextDouble();
		double monthlyEMI=totalAmountPayable/monthlyTenure;
		return monthlyEMI;
		
	}
	

}
