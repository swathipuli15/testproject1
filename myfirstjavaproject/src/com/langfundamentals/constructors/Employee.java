package com.langfundamentals.constructors;

public class Employee {
	// instance variable
	int eid;
	String ename;
	double esal;
	// no arg constructor 
	//No arg constructor is used to initialized the developer data
	Employee(){
		System.out.println("No Arg constuctor called");
		eid=101;
		ename="pondu";
		esal=100000.0;
	}
	Employee(int eid,String ename,double esal){
		System.out.println("Parameterised constructor called");
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
	/*	// these Objects are created with the help of default constructor
		Employee e1=new Employee();
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.esal);
		// these objects are created with the help of No-Arg constructor
		Employee e2=new Employee();
		System.out.println(e2.eid);
		System.out.println(e2.ename);
		System.out.println(e2.esal);
		Employee e3=new Employee(101,"Srikanth",20000.00);
		
		System.out.println(e3.eid);
		System.out.println(e3.ename);
		System.out.println(e3.esal);*/
		Employee e1=new Employee();
		e1.show();
		Employee e2=new Employee();
		e2.show();
		Employee e3=new Employee(101,"Srikanth",20000.00);
		e3.show();
		
		
		
		System.out.println("Main Method Ended");
		

	}
	void show() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}

}
