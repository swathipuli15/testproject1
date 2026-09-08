package com.langfundamentals.constructors;

public class Chiranjivi {
	int age;
	int movieCount;

	Chiranjivi() {
		System.out.println("No Arg Constructor called from chiru");
	}

	Chiranjivi(int age, int movieCount) {
		this.age = age;
		this.movieCount = movieCount;
		System.out.println("parameterised Constructor called from chiru");
	}

	public static void main(String[] args) {
		System.out.println("Main method Started from Chiru");

	}

}

class RamCharan extends Chiranjivi {
	RamCharan() {
		System.out.println("No-Arg Constructor Called from ram");
	}

	RamCharan(int age, int movieCount) {
		super(age,movieCount);
		this.age = age;
		this.movieCount = movieCount;
		System.out.println("No-Arg Constructor Called from ram");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started from Ram");
		RamCharan r = new RamCharan();
		RamCharan r1 = new RamCharan(10, 20);
		r1.display();

	}
	void display() {
		System.out.println(age);
		System.out.println(movieCount);
	}
}
