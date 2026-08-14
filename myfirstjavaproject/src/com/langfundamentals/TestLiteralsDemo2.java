package com.langfundamentals;
//Float Literals

public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		float f1 = 123; // 123.0 int to float
		float f2 = 0123; // 123.0 octal-int-float
      // float f3=123.5; Type mismatch: cannot convert from double to float
		float f4 = 123.5F;//123,5
		float f5 = 0123.5F;//In floating point data ,we don't have Octal ,so its Directly Floating point data
		float f6 = 123F;//123.0
		float f7 = 0123f;//123.0
		float f8 = 0X123F;//123.0
		// float f9=0x123.5f;Invalid hex literal number
		//float f10=0X123.5;Invalid hex literal number
		// float f11=0Xabc.5f;Invalid hex literal number
		
		System.out.println(f1);//123.0
		System.out.println(f2);//83.0
		
		System.out.println(f4);//123.5
		System.out.println(f5);//123.5
		System.out.println(f6);//123.0
		System.out.println(f7);//123.0
		System.out.println(f8);//4671.0
	}

}
