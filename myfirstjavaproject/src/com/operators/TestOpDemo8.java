package com.operators;
//Terniry Operator (? :)
public class TestOpDemo8 {

	public static void main(String[] args) {
System.out.println("Main Methhod Started");
int a=100;
int b=50;
int max=(a>b)?a:b;
System.out.println("Max value is:" +max);
System.out.println("--------------------");
int x=10;
int y=20;
int z=30;
int max1=(x>y)
             ?((x>z)?x:z):((y>z)?y:z);
System.out.println("Max1 value is:" +max1);
System.out.println("--------------------");
int age=18;
String eligible=(age>=18)?"yes":"no";
System.out.println("Eligiable for vote:" +eligible);
System.out.println("-------------------");
	}

}
