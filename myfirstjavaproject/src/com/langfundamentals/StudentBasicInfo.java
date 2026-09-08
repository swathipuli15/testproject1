package com.langfundamentals;

public class StudentBasicInfo {

	public static void main(String[] args) {
           System.out.println("Main method Started!!");
           StudentBasicInfo s=new StudentBasicInfo();
           String fName=s.getFirstName();
           String lName=s.getLastName();
           System.out.println("Full Name:" +fName+" " +lName);
           
	}
	 String getFirstName() {
		 return "kohili";
		 
	 }
	 String getLastName() {
		 return "Virat";
	 }

}
