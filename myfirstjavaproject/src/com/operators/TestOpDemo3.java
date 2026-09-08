package com.operators;
//Unary Operator(+,-,++,--)

public class TestOpDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int a=5;
		int b=6;
		System.out.println(+a);//5
		System.out.println(+b);//6
		System.out.println(-a);//-5
		System.out.println(-b);//-6
		
		System.out.println(++a);//a+1=6
		System.out.println(++b);//b+1=7
		System.out.println(a++);//6 =>a+1=7 update to 7 but not printed
		System.out.println(b++);//7 =>b+1=8 update to 8 but not printed
		System.out.println(--b);//7
		System.out.println(b--);//7
		System.out.println(--a);//6
		System.out.println(a--);//6
		System.out.println("a value is "+a);
		System.out.println("b value is" +b);
		//a=5>6->5| b=6->7->6==5+6+5+6
		
		System.out.println(a++ + b++ + --a + --b);

	}

}
