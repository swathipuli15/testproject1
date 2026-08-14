package com.langfundamentals;

public class Employee {
	String employeeName;
	int employeeId;
	String designation="BackEnd";
	String department;
	int salary;
	String location="Chennai";
	static String companyName="Suntech Solutions";
	static String companyLocation="Hi-Tech City";
	static {
		System.out.println("Welcome to SunTech Solutions! Employee HRMS Portal");
	}
	void displayEmployeeDetails() {
		System.out.println("Employee Name:" +employeeName);
		System.out.println("Employee ID:" +employeeId);
		System.out.println("Desigination:" +designation);
		System.out.println("Department:" +department);
		System.out.println("Salary" +salary);
		System.out.println("location:" +location);
	}
	void promoteEmployee() {
		Employee E= new Employee();
		String designation1=E.designation;
		System.out.println("Change Employees Designation:" +designation1);
	}
	void updateSalary() {
		salary +=5000;
		System.out.println("Increase salary:" +salary);
	}
	void updateEmployeeLocation() {
		Employee E= new Employee();
		String remotelocation=E.location;
		System.out.println("Update Employee Location:" +remotelocation);
	}
	

	public static void main(String[] args) {
		Employee E =new Employee();
		E.employeeName="Pondu";
		E.employeeId=101;
		E.designation="Frontend Developer";
		E.department="Software Engineer";
		E.salary=5000;
	    E.location="Hyderabad";
	    E.displayEmployeeDetails();
	    E.promoteEmployee();
	    E. updateSalary();
	    E.updateEmployeeLocation();
	}

}
