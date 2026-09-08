package com.days;

public class Loops {

	public static void main(String[] args) {
		int i=10;
		
		for(i=1;i<=10;i++) {
			System.out.print("  " +i);
		}
		//-------------
		System.out.println("\n");
		for(i=10;i>=1;i--) {
			System.out.print("  "+i);
	}
		// ---------------------------
		System.out.println("\n");
		for(i=0;i<=10;i=i+2) {
			System.out.print("   " +i);
			
		}
		//-------------
		System.out.println("\n");
		for(i=1;i<=10;i=i+2) {
			System.out.print("  "+i);
		}
		//--------------------
		System.out.println("\n");
		int sum=0;
		for(i=1;i<=10;i++) {
		
			System.out.print("  "+sum);
			 sum=sum+i;
		}
		// -----------------
		// Nested loop
		System.out.println("\n");
		for(i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+" " +j);
			}
		}
		//---------------------
		// for-each loop
		//Syntax:for(datatype variable:collections/arrays)
		int numbers[]= {10,20,30,40,50};
		for(int number:numbers) {
			System.out.print(" "+number);
		}
		//-------------
		System.out.println("\n");
		for(i=1;i<=10;i++) {
			System.out.print(" ");
			if(i==5) {
				
				break;
				
			
			}
			System.out.print("  " +i);
		}
		//------------
		System.out.println("\n");
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(" "+i);
		}
		//------------------------------
		System.out.println("\n");
		for(i=0;i<=100;i=i+2) {
			System.out.print("  "+i);
		}
		//------------------
		System.out.println("\n");
		for(i=1;i<=100;i=i+2) {
			System.out.print(" " +i);
		}
		//-----------------
		int fact=1;
		for( i=1;i<=10;i++) {
			fact=fact*i;
			System.out.println(i +"!=" +fact);
		}
		//----------
		System.out.println("\n");
		int n=2;
		for(i=1;i<=10;i++) {
			System.out.println(n+"X"+i +"=" +(n*i));
		
		}
		//------------
		n=13;
		int count=0;
		for( i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		//------------------------
		
		for(i=2;i<=100;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(" "+i);
			}
		}
		// ------------------------------
		System.out.println("\n");
		sum=0;
		int num=12345;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
//-----------------
	
		for(i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
				
			}
			System.out.println("");
		}
		//--------------------------------
		sum=0;
		n=1234;
		while(n!=0) {         //1234!=0         |123!=0       |12!=0      |1!=0
			int digit=n%10;  //digit=1234%10=4  |=123%10=3    |=12%10=2   |=1%10=1                  sum=10
			 sum=sum+digit;  //sum=0+4 =4       |=4+3=7       |=7+2=9     |=9+1=10
			 n=n/10;        //n=1234/10=123     |123/10=12    |=12/10=2   |=1/10=0
			
			
		}
		System.out.println(sum);
		//------------------------------
		n=10;
		i=1;
		int j=i%n;
		System.out.println(j);
		
		
	}
	

}
