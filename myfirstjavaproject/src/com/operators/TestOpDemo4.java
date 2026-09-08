package com.operators;
//Comparison operator or Relational Operator(==,!=,<=,>=)
// Resulted value is boolean expression->true or false
// ==operator checks the value if it is primitive

public class TestOpDemo4 {

	public static void main(String[] args) {
 System.out.println("Main Method Started");
 String s1="Java";//object-->SCP-->1
 String  s2="Java";// object-- SCP-->0
 String s3="Sikanth";//Object-->SCP-->1
 String s4="srikanth";//Object -->heap-->1
 System.out.println(s1==s2);//true
 System.out.println(s3==s4);//false
 System.out.println(s3.equalsIgnoreCase(s4));
 //content :equals Or equalsIgnoreCase 
 // string can checks the Address not value
 System.out.println("---------------------");
 
 int a=10;
 int b=20;
 int c=10;
 
 float f=5.9f;
 double f1=5.9f;
 float f2=2.243647453f;
 float f3=2.243647453f;
 System.out.println(a==b);//false
 System.out.println(a==c);//true
 System.out.println("--------------");
 System.out.println(a!=b);
 System.out.println(a!=c);
 System.out.println("--------------");
 System.out.println(a<=b);
 System.out.println(a<=c);
 System.out.println("--------------");
 System.out.println(a>=b);
 System.out.println(a>=c);
 
 
 System.out.println(f);//5.9
 System.out.println(f1);//5.900000095367432
 
 System.out.println(f2);//2.2436473
 System.out.println(f3);
		 
	}

}
