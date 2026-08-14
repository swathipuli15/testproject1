package com.langfundamentals;

public class TestLiteralsDemo4 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		String str=" ";
		
		//String str1;
		// local variable str1 decalred but we not initialised do we can't access
		//JVM does not provide default values for local variables
		//System.out.println(str1);
		String str1=null;
		String str2="Srikanth";//String Literals-->SCP:string constant pool from heap--> 1object
		String str3="Srikanth";//scp-->0 objects
		String str4= new String("Srikanth");//String Object-->heap-->2 objects 1 is in heap+1 is in SCP
		String str5= new String("Srikanth");//String Object-->heap-->1 object in heap
		System.out.println(str1);
		System.out.println(str2);
		//== operator checks the address of the object but not values
		//== operator checks the values for primitive data types
		System.out.println(str1==str2);//true
		System.out.println(str3==str4);//false
		
		
		System.out.println("Main method Ended");

	}

}
