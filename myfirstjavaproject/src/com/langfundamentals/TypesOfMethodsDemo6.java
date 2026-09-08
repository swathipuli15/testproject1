package com.langfundamentals;
import java.util.Scanner;
//With Return type+With Arguments
// -- Area of circle    - 
// --Area of Rectangle - length * breath
// -- Area of square - side * side

public class TypesOfMethodsDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TypesOfMethodsDemo6 t=new TypesOfMethodsDemo6();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		double length=sc.nextDouble();
		System.out.println("Enter Breath");
		double breath=sc.nextDouble();
		double d=t.findAreaOfRectangle(length,breath);
	    System.out.println("Area of Rectangle :" +d);
	    System.out.println("**********************************************");
	    System.out.println("Enter side");
	    double side=sc.nextDouble();
	    double d1=t.findAreaOfSquare(side);
	    System.out.println("Area Of Square:" +d1);
	    System.out.println("**********************************************");
	    System.out.println("Enter Radius");
	    double radius=sc.nextDouble();
	    double d2=t.findAreaOfCircle(radius);
	    System.out.println("Area Of Circle :" +d2);
	    System.out.println("***********************************************");
	    System.out.println("Enter base");
	    double base=sc.nextDouble();
	    System.out.println("Enter height");
	    double height=sc.nextDouble();
	    double d3=t.findAreaOfTriangle(base,height);
	    System.out.println("Area of Triangle :" +d3);
	    System.out.println("***********************************");
	    System.out.println("Main Method Ended");
		

	}
	double findAreaOfRectangle(double l,double b) {
		double area=l*b;
		return area;
		
	}
	double findAreaOfSquare(double s) {
		double area=s*s;
		return area;
	}
	double findAreaOfCircle(double r) {
		double area=Math.PI*r*r;
		return area;
	}
	double findAreaOfTriangle(double base,double height) {
		double area=0.5*base*height;
		return area;
	}
	

}
