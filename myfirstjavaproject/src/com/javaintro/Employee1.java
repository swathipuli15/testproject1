package com.javaintro;

public class Employee1 {
	int salary=5000;
	String employeeName="James";
	
	int monthlyGST;
	int monthlyPF;
	int monthlynetSalary;
	int annualGST;
	int annualPF;
	int annualnetSalary;
	void calculateMonthlyPF() {
		monthlyPF=salary*2/100;
	}
	void calculateMonthlyGST() {
		monthlyGST=salary*3/100;
		
	}
	void calculateNetMonthlysalary() {
		monthlynetSalary=salary-monthlyGST-monthlyPF;
		
	}
	void calculateAnnualGST() {
		annualGST=monthlyGST*12;
		
	}
	void calculateAnnualPF() {
		annualPF=monthlyPF*12;
		
	}
	void calculateAnnualNetSalary() {
		annualnetSalary=monthlynetSalary*12;
		
	}
	void diplayEmployeeDetails() {
		System.out.println("Employee Name:" +employeeName);
		System.out.println("Employee Salary:" +salary);
		System.out.println("monthly GST:" +monthlyGST);
		System.out.println("Monthly PF:" +monthlyPF);
		System.out.println("Monthly NetSalary:" +monthlynetSalary);
		System.out.println("Annual GST:" +annualGST);
		System.out.println("Annual PF:" +annualPF);
		System.out.println("Annual Net Salary:" +annualnetSalary);
		
		
		
		
	}
	

	public static void main(String[] args) {
		Employee1 E=new Employee1();
		E.calculateMonthlyPF();
		E.calculateMonthlyGST();
		E.calculateNetMonthlysalary();
		E.calculateAnnualGST();
		E.calculateAnnualPF();
		E.calculateAnnualNetSalary();
		E.diplayEmployeeDetails();

	}

}
