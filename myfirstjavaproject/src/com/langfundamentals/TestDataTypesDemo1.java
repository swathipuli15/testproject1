package com.langfundamentals;
//Primitive data types 
// Note:default values of primitive data types are 
//for byte short long --0
//for float & double --0.0
//for char-- (empty space)
//for boolean --false

public class TestDataTypesDemo1 {
	
	
	byte b=127;
	// Range of Byte is -128 to 127
	//byte b1=128;  CE:Type Mismatch:Cannot convert into  int  to byte
	byte b1=(byte) 128;// Explicit Type Casting(int to byte)
	
	// The range of short is -32768 to 32767
	short s=b1;//Implicit Type Casting
	short s1=32767;
 //  short s2=32768; CE:Type Mismatch:Cannot convert into   int to short
	short s2= (short) 32768;
	// Range of int is -2147483648 to 2147483647
	int i=s2;
	int i1= 2147483647;
	// int i2=2147483648; CE:The literal 2147483648 of type int is out of range
	int i2=(int) 2147483647;
   
	//range of long is -922337263685477808 to 922337263685477807L
	long l=i2;
	long l1=922337263685477808L;
//	long l2=922337263685477808L

	//float f=76.5f;
	//float f=(char) 'A';
	float f= 'A';
	float f1=76.2425236347154f;
	
	//double d =76.2425236347154f;
	double d ='A';
	
	char c='A';
	char c1=65;
	char c2='\u0004';
	
	boolean boo;
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		TestDataTypesDemo1 t1=new TestDataTypesDemo1();
		
System.out.println("byte value:" +t1.b);
System.out.println("byte value:" +t1.b1);
System.out.println("   ");


System.out.println("short value:" +t1.s);
System.out.println("short value:" +t1.s1);
System.out.println("short value:" +t1.s2);
System.out.println("   ");


System.out.println("int Value :" +t1.i);
System.out.println("int Value :" +t1.i1);
System.out.println("int Value :" +t1.i2);
System.out.println("   ");

System.out.println("long value:" +t1.l);
System.out.println("long value:" +t1.l1);

System.out.println("float value:" +t1.f);
System.out.println("float value:" +t1.f1);
System.out.println("   ");

System.out.println("double value:" +t1.d);
System.out.println("   ");

System.out.println("char value:" +t1.c);
System.out.println("char value:" +t1.c1);
System.out.println("char value:" +t1.c2);
System.out.println("   ");

System.out.println("boolean value:" +t1.boo);
		
	}

}
