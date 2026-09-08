package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a week Day");
		String day=sc.next().toUpperCase();
		switch(day) {
		case "MON"->System.out.println("yes! Monday are Always a lazy Day");
		case "TUE","WED","THUS"->System.out.println("Tuesday,Wednesday,Thursday are the Routine Days");
		case "FRI"->System.out.println("Weekend Mode Started");
		case "SAT","SUN"->System.out.println("Saturday & Sunday are Holidays and Happy Days");
		default ->System.out.println("Some thing Went Wrong !! check again");
		}

	}

}
