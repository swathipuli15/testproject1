package com.logicalstatements;

public class Test1 {

	public static void main(String[] args) {
 int x=10;
 if(x++ >10) {
	 System.out.println("A");
 }else if(x++ >11) {
	 System.out.println("B");
 }else {
	 System.out.println("c");
 }
 System.out.println(x);
	}

}
