package com.logicalstatements;

import java.util.Scanner;

public class Account {
	double balance=20000.0;

	public static void main(String[] args) {
		System.out.println("Welcome to VCube Banking!!");
		Account a=new Account ();
		Scanner sc=new Scanner(System.in);
		a.checkBalance();
		System.out.println("Enter amount to withDraw");
		double withDamount=sc.nextDouble();
		a.withDraw(withDamount);
		System.out.println("Enter amount to deposit");
		double dAmount=sc.nextDouble();
		a.deposit(dAmount);
		
		

	}
	void deposit(double dAmount) {
		if(dAmount<=10000) {
			balance=balance+dAmount;
			System.out.println("Your Current Balance is:" +balance);
		}
		else {
			System.err.println("per Day Transanction limit 1 lakh only");
		}
	}
	void withDraw(double withDrawAmount) {
		if(withDrawAmount<=balance) {
		
		balance=balance-withDrawAmount;
		System.out.println("after Debiting balance is:" +balance);
		}
		else {
			System.err.println("InSufficient Balance Please Check the Balance");
		}
		
	}
	void checkBalance() {
		
		System.out.println("your Currrent Balance is "+balance);
	}

}
