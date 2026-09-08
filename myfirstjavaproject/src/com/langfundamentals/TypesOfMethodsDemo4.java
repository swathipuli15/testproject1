package com.langfundamentals;

import java.util.Scanner;

public class TypesOfMethodsDemo4 {
	double balance = 5000;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		TypesOfMethodsDemo4 t = new TypesOfMethodsDemo4();
		System.out.println("enter Amount to deposit:");
		double amount = sc.nextDouble();
		System.out.println("Enter Withdraw Amount:");
		double wAmount=sc.nextDouble();

		t.deposit(amount);
		
		t.withDrawAmount(wAmount);
		t.checkbalance();

	}
	void withDrawAmount(double wAmount) {
		if(wAmount<=balance) {
			balance=balance-wAmount;
		}else {
			System.out.println("Insuffiecient Balance in your Account");
		}
	}

	void checkbalance() {
		System.out.println("The Current Balance is:" + balance);
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;

		} else {
			System.out.println("Invalid Amount to Deposit");
		}
	}

}
