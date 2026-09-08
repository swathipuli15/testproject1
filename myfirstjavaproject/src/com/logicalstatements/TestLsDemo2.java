package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo2 {

	public static void main(String[] args) {
System.out.println("Main Method Started!!");
Scanner sc=new Scanner(System.in);
System.out.println("Enter a marks:");
int marks=sc.nextInt();
if(0>marks|| marks>100) {
	System.out.println("Invalid Marks");
}else if(marks>91) {
	System.out.println("S grade");
}else if(marks>=80) {
	System.out.println("A Grade");
}else if(marks>=70) {
	System.out.println("B Grade");
}else if(marks>=60) {
	System.out.println("C Grade");
}else if(marks>=50) {
	System.out.println("D Grade");
}else if(marks>40) {
	System.out.println("E Grade");
}else if(marks>35) {
	System.out.println("Just Passed");
}else {
	System.out.println("Failed");
}
System.out.println("Main Method ended!!");
	}
	

}
