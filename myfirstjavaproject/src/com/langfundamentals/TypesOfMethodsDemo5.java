package com.langfundamentals;
//with Return type+No Parameters
import java.util.Scanner;
public class TypesOfMethodsDemo5 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		TypesOfMethodsDemo5  t=new TypesOfMethodsDemo5();
		//static Scanner sc=new Scanner(System.in);
		double salary=t.employeeSalary();
		double bonus=t.empBonus();
		System.out.println("Total Salary is:" +(salary+bonus));
		

	}
	double employeeSalary(){
		System.out.println("Enter a Employee Salary");
		double salary=sc.nextDouble();
		return salary;
		
	}
	double empBonus(){
		System.out.println("Enter a Employee Bonus");
		double bonus=sc.nextDouble();
		return bonus;
		
	}

}
