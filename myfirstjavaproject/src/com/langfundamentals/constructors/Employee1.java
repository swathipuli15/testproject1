package com.langfundamentals.constructors;

public class Employee1 {
	String employeeName;
	double salary;
	String companyName;
/*	Employee1(){
		employeeName="pondu";
		salary=100000.0;
		companyName="infosys";
		
	}*/
	Employee1(String employeeName,double salary,String companyName){
		this.employeeName=employeeName;
		this.salary=salary;
		this.companyName=companyName;
		System.out.println("Parameterised Constructor called");
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Employee1 e=new Employee1("pondu",10000.1,"Infosys");
		e.display();
		System.out.println("Main Method Ended");

	}
	void display() {
		System.out.println(employeeName);
		System.out.println(salary);
		System.out.println(companyName);
	}

}
