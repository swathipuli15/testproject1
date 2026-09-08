package com.langfundamentals.constructors;

public class Employee2 {
	String employeeName;
	double salary;
	boolean doorPower;
	boolean blocked;

	Employee2(String employeeName, double salary, boolean doorPower, boolean blocked) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.doorPower = doorPower;
		this.blocked = blocked;

	}

	public static void main(String[] args) {
		Employee2 e = new Employee2("Sridhar", 10000.0, true, false);
		e.checkAccess();

	}

	void checkAccess() {
		System.out.println("Employee Name:" + employeeName);
		System.out.println("salary:" + salary);
		System.out.println(" Access " + (doorPower && !blocked));

	}

}
