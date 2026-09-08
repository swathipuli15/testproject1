package com.operators;
import java.util.Scanner;
//Arithematic Operators

public class TestOpDemo1 {
	int a;
	int b;
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		TestOpDemo1 t=new TestOpDemo1();
		System.out.println("Enter a First Value:");
		float a1=sc.nextFloat();
		System.out.println("Enter a Second value");
		double a2=sc.nextDouble();
		double sum=t.addition(a1,a2);
		System.out.println("Addition is:" +sum);
		double sub=t.subtraction(a1,a2);
		System.out.println("Subtarction is:" +sub);
		double mul=t.multiplication(a1,a2);
		System.out.println("Multiplication is:" +mul);
		double div=t.division(a1,a2);
		System.out.println("Division is:" +div);
	    double mod=t.modulus(a1, a2);
	    System.out.println("Modulus is:" +mod);

	}
	double addition(float x,double y) {
		double sum=x+y;
		return sum;
	}
	double subtraction(float x,double y) {
		double sub=x-y;
		return sub;
	}
	double multiplication(float x,double y) {
		double mul=x*y;
		return mul;
	}
	double division(float x,double y) {
		double div=x/y;
		return div;
	}
	double modulus(float x,double y) {
		double mod=x%y;
		return mod;
	}

}
