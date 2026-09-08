package com.operators;
//  Bitwise Operators (&,|,^,~)


public class TestOpDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println(true & true);// true
		System.out.println(1&1);//1
		System.out.println(true & false);//false
		System.out.println(1&0);//0
		System.out.println(false&true);//false
		System.out.println(0&1);//0
		System.out.println(false&false);//false
		System.out.println(0&0);//0
		System.out.println("-------------------");
		System.out.println(39&49);//33
		System.out.println(71&88);//64
		System.out.println(88&77);//72
		System.out.println("---------------------");
		System.out.println(true | true);// true
		System.out.println(1|1);//1
		System.out.println(true |false);//true
		System.out.println(1|0);//1
		System.out.println(false|true);//true
		System.out.println(0|1);//1
		System.out.println(false|false);//false
		System.out.println(0|0);//0
		System.out.println("-------------------");
		System.out.println(39|49);//55
		System.out.println(71|87);//87
		System.out.println(88|77);//93
		System.out.println("---------XOR----------");
		
		System.out.println(true ^ true);//false
		System.out.println(1^1);//0
		System.out.println(true ^false);//true
		System.out.println(1^0);//1
		System.out.println(false^true);//true
		System.out.println(0^1);//1
		System.out.println(false^false);//false
		System.out.println(0^0);//0
		System.out.println("----------------------------");
		System.out.println(39^49);//22
		System.out.println(71^87);//16
		System.out.println(88^77);//21
		
		
		System.out.println("----------------");
		System.out.println("------------ tilt (~)-----------");
		//~ --->(n+1)
		System.out.println(~21);//-22
		System.out.println(~100);//101
		
		

	}

}
