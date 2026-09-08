package com.langfundamentals;
//no return type+with parameters

public class TypesOfMethodsDemo2 {

	static void add(int a, int b) {
		System.out.println("Sum of Two Numbers:" + (a + b));

	}

	void sub(float a, float b) {
		System.out.println("Differences of Two Numbers:" + (a - b));
	}

	void modulus(float a, double b) {
		System.out.println("Remainder of Two numbers:" + (a % b));
	}

	public static void main(String[] args) {
		TypesOfMethodsDemo2 t = new TypesOfMethodsDemo2();
		System.out.println("Main method started");

		add(40, 10);
		t.sub(40, 10);
		t.modulus(4, 3);

		System.out.println("Main Method Ended");
	}

}
