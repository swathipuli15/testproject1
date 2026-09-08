package com.operators;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// Arithematic Operator
		a = a + b;// a=10+20=30

		b = a - b;// b=30-20=10
		a = a - b;// a=30-10=20
		System.out.println(a);
		System.out.println(b);

		/*
		 * //Arithematic Operators int a=10; int b=20; int temp=a; a=b; b=a;
		 * System.out.println("A Value is:" +a); System.out.println("b Value is:" +b);
		 */
		// Bitwise Operator

		a = a ^ b;// a=10^20=30
		b = b ^ a;//b=20^30=20
		a=a^b;//a=30^20=10
		System.out.println("a value is:" + a);

		System.out.println("b value is:" + b);

	}

}
