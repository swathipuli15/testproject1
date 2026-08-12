package com.langfundamentals;
//Primitive data types 
// Note:default values of primitive data types are 
//for byte short long --0
//for float & double --0.0
//for char-- (empty space)
//for boolean --false

public class TestDataTypesDemo1 {
	byte b=127;
	//byte b1=128; error-- Range of Byte is -128 to 127
	short s;
	int i;
	long l;

	float f;
	double d;
	
	char c;
	boolean boo;
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		TestDataTypesDemo1 t1=new TestDataTypesDemo1();
		
System.out.println("byte value:" +t1.b);
System.out.println("short value:" +t1.s);
System.out.println("int Value :" +t1.i);
System.out.println("long value:" +t1.l);
System.out.println("float value:" +t1.f);
System.out.println("double value:" +t1.d);
System.out.println("char value:" +t1.c);
System.out.println("boolean value:" +t1.boo);
		
	}

}
