package com.days;
// Operator :

// An operator is a special symbol that tells java to perform an operation on one or more values
//operator=Symbol that performs an operation on operands

public class Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int year = 365;
		char ch = 'e';
		char choice = '+';
		// -------------
		if (a < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("positive");
		}
		// -------------------------
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}
		// ---------------------------
		if (a > 18) {
			System.out.println("eliglible");
		} else {
			System.out.println("not eligible");
		}
		// ----------------
		if (a > b == true) {
			System.out.println("a large");
		} else {
			System.out.println("b large");
		}
		// --------------------
		if (a % 5 == 0) {
			System.out.println("Divisible by 5");
		} else {
			System.out.println("not Divisible");
		}
		// ---------------------
		if ((a > b) && (a > c)) {
			System.out.println("a is large");
		} else if ((b > c) && (b > a)) {
			System.out.println("b large ");
		} else {
			System.out.println("c large");
		}
		// -----------------
		if (year == 366) {
			System.out.println("leap Year");

		} else {
			System.out.println(" notleap year");
		}
		// -----------------------
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");

		} else {
			System.out.println("consonant");
		}
		// ----------------
		if (a < 0) {
			System.out.println("Negative");
		} else if (a > 0) {
			System.out.println("positive");
		} else {
			System.out.println("Zero");
		}
		// -------------------------------
		switch (choice) {
		case '+' -> System.out.println("addition" + (a + b));

		case '-' -> System.out.println("Subtraction" + (a - b));
		case '*' -> System.out.println("multiplication" + (a * b));
		case '/' -> System.out.println("Division" + (a / b));
		case '%' -> System.out.println("Modulus" + a % b);
		}
		// --------------------------
		if (a > b) {
			if(a>c) {
			System.out.println("a");
			}else {
				System.out.println("c");
			}
			
		}else {
			if(b>c) {
					System.out.println("b");
				}else {
			
				
				System.out.println("c");
				
				}
			}
		//---------------------------
		
	}

}
