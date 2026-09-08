package com.operators;
//WAP to find the maximum number
//to maximum is not value it retuns IDENTIFIER

public class Maximum {
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int a=100;
		
		int b=200;
		int c=300;
		String max=(a>b==true)?"a":"b";
		//100>200 && 100>300 

		String max2=(a>b && a>c)?"a" +a:(b>c&&b>a)?"b" +b:"c=" +c;
		System.out.println("Maximum Number is"+" " +max); 
	System.out.println("Maximum Number is"+" " +max2); 

	}

}
