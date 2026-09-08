package com.days;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
// ----------------
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
//----------------------
		System.out.println("\n");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			System.out.print(" " + sum);
		}
//----------------------------
		System.out.println("\n");
		int[] marks = { 80, 90, 70, 60, 50 };
		sum = 0;
		for (int mark : marks) {
			sum += mark;
			System.out.print("  " + sum);
		}
		System.out.print("  " + sum);
		double avg = (double) sum / marks.length;
		System.out.println("    " + avg);
		// --------------------------
		System.out.println("\n");
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];

			}
		}
		System.out.print("  " + max);
       //--------------------------------------------
		System.out.println("\n");
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(min>numbers[i]) {
				min=numbers[i];	
			}
			
		}
		System.out.println("  "+min);
	//---------------------------------------
		int search=30;
		boolean found=false;
		for(int number:numbers) {
			if(number==search) {
				found=true;
			}
		}
		System.out.println("found : " +found);
   //------------------------------------
		System.out.println("\n");
		int[] num= {10,15,20,33,49};
		int even=0;
		int odd=0;
		for(int nums:num) {
			if(nums%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("even: " +even);
		System.out.println("odd: " +odd);
		//---------------------------------
		System.out.println("\n");
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.print(" " +numbers[i]);
			
		}
		//----------------------------------
		int[] source= {10,20,30,40,50};
		int[] destination=new int[source.length];
		for(int i=0;i<source.length-1;i++) {
			destination[i]=source[i];
		}
		//-----------------------------------
		System.out.println("\n");
		int[] num2= {10,20,30,10,20,40};
		for(int i=0;i<num2.length;i++) {
			for (int j=i+1;j<num2.length;j++) {
				if(num2[i]==num2[j]) {
					System.out.println("Duplicate:" +num2[i]);
				}
				
			}
		}
		
	}

}
