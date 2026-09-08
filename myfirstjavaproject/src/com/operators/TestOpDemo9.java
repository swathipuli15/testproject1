package com.operators;
//instanceof Operator(instanceof)

public class TestOpDemo9 {

	public static void main(String[] args) {
		Integer i=10;
		System.out.println(i instanceof Integer);//true
		System.out.println(i instanceof Number);//true
		System.out.println(i instanceof Object);//true
		
//System.out.println(i instanceof String); 
		System.out.println(null instanceof Integer);//false
		System.out.println(null instanceof Number);//false

	}

}
