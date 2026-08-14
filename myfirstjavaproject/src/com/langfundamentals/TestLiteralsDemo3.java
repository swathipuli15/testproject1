package com.langfundamentals;
//char literals,null literals & boolean literals

public class TestLiteralsDemo3 {
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		//null literals
		String s=null;
		TestLiteralsDemo3 t1=null;
		s="Srikanth";
		System.out.println(s);
		System.out.println(t1);
		//boolean literals
		boolean IsStudentAreSeriousAboutTheirJobs=true;
		boolean SomeStudentsAreRocking=true;
		if(IsStudentAreSeriousAboutTheirJobs) {
			System.out.println("They  will get a ob in 4 to 6 months");
		}else {
			System.out.println("Those who are not serious consider as Time-Pass Batch");
		}
		//character literals
		char c='A';//Single Quote Characters
		char c1=65;//ASCII Characters
		char c2=65535;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		//these are junk characters
		System.out.println('\u0020');//they provide a empty space
		System.out.println('\u0040');//@
	}

}
