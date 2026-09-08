package com.langfundamentals;

public class Employee1 {
	int emp_Id;
	String emp_Name;
	
	static int org_Id =555;
	static String org_Name="Vcube";
	
	
	public static void main(String[] args) {
		//Local Variables
		//Local variables may declared but not  initialized,int age;
		//whenever the accessing local variables without initialized it will give compile time error
		//we can access local variables we must need to initialized int age=18;
		//JVM does not provide default values for Local Variables
		int age=18;
		String name="Pondu";
		//same Variables on class level and method level it will give method level data
		int org_Id=666;
		String org_Name="Vcube";
		Employee1 e=new Employee1();
		e.emp_Id=101;
		e.emp_Name="Chiru";
		System.out.println("Main Method Started");
		System.out.println("Accessing Static Data Directly");
		System.out.println(org_Id);
		System.out.println(org_Name);
		System.out.println("Accessing Static Data by using class Name  ");
		System.out.println(Employee1.org_Id);
		System.out.println(Employee1.org_Name);
		//whenever we can access static data by using Object Reference Variable Compiler Gives the Warning 
		//even Object reference is NULL it will give you value .Employee1 e=NULL
		System.out.println("Acessing Static Data By Using Object Reference Variable");
		System.out.println(e.org_Id);
		System.out.println(e.org_Name);
		System.out.println("Accessing Instance Data by using Object Reference Variable Only");
		System.out.println(e.emp_Id);
		System.out.println(e.emp_Name);
		System.out.println("Accessing Local Variables");
		System.out.println(age);
		System.out.println(name);
		

	}

}
