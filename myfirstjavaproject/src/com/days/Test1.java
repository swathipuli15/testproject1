package com.days;
//Day1:practice

 class Employee{
	int id;
	String name;
	double salary;
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}
	public class Test1{
	

public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="Rahul";
		e1.salary=45000;
		e1.display();
			

}

}
