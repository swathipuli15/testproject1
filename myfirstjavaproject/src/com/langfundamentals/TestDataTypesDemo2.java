package com.langfundamentals;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Arrays;

public class TestDataTypesDemo2 {
	class Dog {
		String name="puppy";
	
		
	}
	//Normal Object Data Types
//	BigInteger bi1=10; -- error
	BigInteger bi=new BigInteger("10");//Initialising the value
	BigInteger b1=new BigInteger("24236547421644735643245654");
	BigInteger b2=new BigInteger("24236547421644735643245654");
	
	BigDecimal bd1=new BigDecimal("24236547421644735643245654.24236547421644735643245654");
	BigDecimal bd2=new BigDecimal("24236547421644735643245654.24236547421644735643245654");
	
	String s=new String();
	String s1="Srikanth";// String Literals -->SCP -->String Constant Pool.(Heap)-->1 object created
	String s2=new String("Java is simple:");
	Arrays a;
	// Wrapper Object Data Types
	//AutoBoxing: Converting Wrapper Object Data Type to Primitive Data Type is called Auto-Boxing
	Integer i=100;//Integer.valueOf(100);
	Short st=34;
	Double b=34.994;
	Character c='M';
	//Auto-Unboxing:Converting Primitive Data Type to Wrapper Object Data Type called Auto-Unboxing
	Integer i1=new Integer(100);
	 
	int i2=i1;//i1.value(): converting Wrapper to Primitive
	//Wrapper Caching:Range of -128 to 127 values will store in same address of the object
	//if the values are crossing max value of 127 it will create a new object.
	//== operator checks the address of the object
	Integer i3=100;
	Integer i4=100;
	
	Integer i5=200;
	Integer i6=200;
	
	//User Defined Data Types
//	Dog d="puppy"; --error
	Dog d=new Dog();
	
	
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TestDataTypesDemo2 t1=new TestDataTypesDemo2();
	
		System.out.println(t1.i3==t1.i4);//true
		System.out.println(t1.i5==t1.i6);//false
		//BigInteger Values
		System.out.println(t1.bi);
		System.out.println(t1.b1);
		System.out.println(t1.b2);
		System.out.println(t1.b1.add(t1.b2));
		System.out.println(" ");
		//BigDecimal Values
		System.out.println(t1.bd1);
		System.out.println(t1.bd2);
		System.out.println(t1.bd1.multiply(t1.bd2));
		
		
		System.out.println(t1.s);
		System.out.println(t1.s1);
		System.out.println(t1.s2);
		System.out.println(" ");
		
		System.out.println(t1.a);
		System.out.println(t1.i);
		System.out.println(t1.s1);
		System.out.println(t1.b);
		System.out.println(t1.c);
		
	}

}
