package com.examjava;
//Insertion Sorting
public class TestArrDemo16 {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 1, 6 };
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
				
			}
			arr[j]=temp;
		}	
					
		
		for(int i=1;i<arr.length;i++) {
	System.out.println("Array is:"+arr[i-1]);
		}
	}

}
