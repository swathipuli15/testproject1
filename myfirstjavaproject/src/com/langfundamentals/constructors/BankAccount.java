package com.langfundamentals.constructors;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	
	BankAccount(int accountNumber,String accountHolderName,double balance,String branch){
		System.out.println("Parameterised constructor called");
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this. branch= branch;
		
		
	}
	BankAccount(BankAccount b1,String branch,double balance){
		this.accountNumber=b1.accountNumber;
		this.accountHolderName=b1.accountHolderName;
		this.balance=balance;
		this. branch= branch;
		
		
	}
	void display() {
		System.out.println("************************");
		System.out.println(accountNumber);
		System.out.println(accountHolderName);
		System.out.println(balance);
		System.out.println(branch);
		
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		BankAccount b=new BankAccount(784211082,"Ram",100000,"Hyd");
		b.display();
		BankAccount b2=new BankAccount(b,"Chennai",20000);
		b2.display();
		
		
		

	}
	

}
