package com.operators;
//Assignment OPerators(=,+=,-=,*=,/=,%=)

public class TestOpDemo2 {

	public static void main(String[] args) {
		int result = 5;
		// Type mismatch: cannot convert from double to int
		// result=result+4.5; CE
		// casting the values
		// result=(int) (result+4.5); (or)
		result += 4.5;// 9
		result -= 4.5;// 4
		result *= 4.5; // 18
		result /= 4.5;// 4
		result %= 4.5;// 4

		System.out.println("result is:" + result);

	}

}
