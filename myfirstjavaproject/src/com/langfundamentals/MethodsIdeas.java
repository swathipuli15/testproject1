package com.langfundamentals;

public class MethodsIdeas {
	void add(int a,int b) {
		System.out.println("Sum Of numbers" +(a+b));
	}
	void sub(float a,float b) {
		System.out.println("Differences on numbers:" +(a-b));
	}
	void cube(double a,double b) {
		System.out.println("Cube of numbers:" +(a*a*a)+" "+(b*b*b));
	}
	void square(float a,float b) {
		System.out.println("Square of Numbers:" +(a*a)+" "+(b*b));
	}
	

	public static void main(String[] args) {
       MethodsIdeas m1=new MethodsIdeas();
       m1.add(10, 20);
       m1.sub(1,3);
       m1.cube(2,7);
       m1.square(2.5f, 7.9f);
      
	}

}
