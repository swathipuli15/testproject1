package com.logicalstatements;
// WAP to print the cricketer info based on their Jersery Number
import java.util.Scanner;

public class TestLsDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Indian Cricket Team");
		System.out.println("Enter a jersey no:");
        int jNo=sc.nextInt();
        switch(jNo) {
        case 7:
        	System.out.println("Mahindra Singh Dhoni!!");
        	System.out.println("cool captain for India");
        	break;
        case 45:
        	System.out.println("Rohit Sharma");
        	System.out.println("Hitman for a Reason");
        	break;
        case 18:
        	System.out.println("Virat Kohili");
        	System.out.println("the most consistent player in the world");
        case 1:
        	System.out.println("KL Rahul");
        	System.out.println("He is classy BatMan");
        	default:
        		System.out.println("entered jNo player is not playing today");
        }
        
	}

}
