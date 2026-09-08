package com.operators;
//Logical Operators(&&,||,!)

public class TestOpDemo5 {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=40;
		System.out.println(++a>15 && ++a +19>16);
		System.out.println("A value is:" +a);
		System.out.println(true && true);//true
		System.out.println(true && false);// false
		System.out.println(false&&true);//false 2and part is Dead code
		System.out.println(false && false);//false 2and part is Dead code
		System.out.println("---------------------");
		System.out.println(a<b && b<c );
		System.out.println(a<b && b>c);
		System.out.println(a>b && b<c);
		System.out.println(a>b&& b<c);
		System.out.println("----------------");
		
		
		System.out.println(true||true);//true-->2and part is Dead code
		System.out.println(true||false);//true-->2and part is Dead code
		System.out.println(false||true);//true
		System.out.println(false||false);
		System.out.println("---------------------");
		System.out.println(a<b || b<c );
		System.out.println(a<b || b>c);
		System.out.println(a>b || b<c);
		System.out.println(a>b || b>c);
		System.out.println("---------------------");
		
		System.out.println(!(true));
		
		
		
		

	}

}
