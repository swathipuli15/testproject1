package com.langfundamentals;

public class TestLiteralsDemo1 {
	

	public static void main(String[] args) {
		//Below 3 values are decimal literals 
		//Decimal means base is 10--->0 to 9
		//this can access directly
        int a=10;
		int a1=123;
		int a2=678;
		
		
		//Below 3 values are Octal Literals
		//Octal means base is 8 -->0 to 7
		//Octal can starts with '0'
		//the octal converstion can happens like this  evalution process can starts from righ to left
		//number*8^position-1
		//int a=0124
		//=0*8^3+1*8^2+2*8^1+4*2^0
		//=0*512+1*64+2*8+4*1
		//=0+64+16+4
		//=83
		
		int a3=0123;//83
		int a4=0765;//501
		int a5=02324;//1236
		//int a5=0678; error:this is out of range of Octal literal (0 to 7)
		
		//Below 3 values are Hex-decimal Literals
		//Hex-Decimal means base is 15--> 0-9 and a-z/A-z
		//a/A=10,b/B=11,c/C=12,d/D=13,e/E=14,f/F=15
		//Hex-Decimal can starts '0X/0x'
		//Hex-Decimal conversion can happens like this number*16^position-1
		//int a=0x124
		//=0*16^3+1*16^2+2*16^1+4*16^0
		//=0*4096+1*256+2*16+4*1
		//=0+256+32+4
		//=292
		int a6=0X123;
		int a7=0x5678;
		int a8=0xbee;
		int a9=0xDad;
		//int a10=0xbeer; error-- this is out of range of Hexa-decimal (0-9 and a-z)
		
		//below 3 values are Binary Literals
		//Binary means base is 2-->0 and 1
		//Binary can starts with the '0b/0B'
		//binary conversion can happens in 2's complement
		//int a10=0b10101
		//=1*2^4+0*2^3+1*2^2+0*2^1+1*2^0
		//=1*8+0*8+1*4+0*2+1*1
		//=8+0+4+0+1
		//13
		int a10=0b10101;
		int a11=0B101;
		int a12=0B111;
		int a13=0B000;
		
		
		
		System.out.println(a);//10
		System.out.println(a1);//123
		System.out.println(a2);//678
	
		System.out.println(a3);//83
		System.out.println(a4);//501
		System.out.println(a5);//1236
		
		System.out.println(a6);//291
		System.out.println(a7);//22136
		System.out.println(a8);//3054
		System.out.println(a9);//3501
		
		System.out.println(a10);//21
		System.out.println(a11);//5
		System.out.println(a12);//7
		System.out.println(a13);//0
		

	}

}
